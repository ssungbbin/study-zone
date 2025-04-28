package com.ohgiraffers.d_looping_and_branching.level03.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문자열 입력
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();

		// 영문자 검사
		if (!str.matches("[a-zA-Z]+")) {
			System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
			return;
		}

		// 검색할 문자 입력
		System.out.print("문자를 입력하세요: ");
		char ch = sc.next().charAt(0); // 한 글자 입력

		int count = 0;
		List<Character> list = new ArrayList<>();

		// 문자열을 문자 리스트로 변환
		for (char c : str.toCharArray()) {
			list.add(c);
		}

		// 리스트에서 문자 개수 찾기
		for (char c : list) {
			if (c == ch) {  // 대소문자 구분하여 비교
				count++;
			}
		}

		System.out.println("포함된 갯수: " + count + "개");
	}
}



/*package com.ohgiraffers.d_looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문자열 입력
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();

		// 영문자 검사
		if (!str.matches("[a-zA-Z]+")) {  // 알파벳(a~z, A~Z)만 있는지 체크
			System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
			return;  // 프로그램 종료
		}

		// 검색할 문자 입력
		System.out.print("문자를 입력하세요: ");
		char ch = sc.next().charAt(0); // 한 글자 입력

		int count = 0;

		// 문자열에서 문자 개수 찾기
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {  // 대소문자 구분하여 비교
				count++;
			}
		}

		System.out.println("포함된 갯수: " + count + "개");
	}
}

/* 문자열을 하나 입력 받고, 검색할 문자를 입력 하여
		 * 입력받은 문자열에서 검색할 문자가 몇 개 포함되어 있는지를 출력하는 프로그램을 만드세요
		 * 
		 * 단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우에는
		 * 검색할 문자를 입력받지 않고 "영문자가 아닌 문자가 포함되어 있습니다." 출력 후 프로그램을 종료하세요
		 * 
		 * 또한 일치하는 문자의 경우 대소문자를 구분합니다.
		 * 
		 * -- 프로그램 예시 --
		 * 
		 * -- 정상 동작의 경우 --
		 * -- 입력 예시 --
		 * 문자열 입력 : apple
		 * 문자 입력 : p
		 * 
		 * -- 출력 예시 --
		 * 포함된 갯수 : 1개
		 * 
		 * --------------------
		 * -- 영문자가 아닌 문자 포함된 경우 --
		 * -- 입력 예시 --
		 * 문자열 입력 : app2le
		 * 
		 * -- 출력 예시 --
		 * 영문자가 아닌 문자가 포함되어 있습니다.
		 * */
		



