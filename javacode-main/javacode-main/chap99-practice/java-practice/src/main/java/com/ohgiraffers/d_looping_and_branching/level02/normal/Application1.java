package com.ohgiraffers.d_looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = scr.nextLine();

		int len = str.length();
		for(int i=0;i<len;i++){
			char ch = str.charAt(i);
			System.out.println(i + ":" + ch);
		}
		/* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요
		 * 
		 * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : apple
		 * 
		 * -- 출력 예시 --
		 * 0 : a
		 * 1 : p
		 * 2 : p
		 * 3 : l
		 * 4 : e
		 * */
		
	}

}
