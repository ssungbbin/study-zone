package com.ohgiraffers.d_looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "";
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		/*
		String s1 = "수박";
		String s2 = "박";
		if(a%2==0){
			answer = s1.repeat(a/2);

		}else if(a%2 ==1){
			answer = s1.repeat(a/2) + s1;
		}
		System.out.println(answer);

		/* 정수를 입력받아 1부터 입력받은 정수까지
		 * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
		 * 
		 * -- 입력 예시 --
		 * 정수를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 수박수박수
		 * */

		for(int i=0; i<n;i++){
			answer += (i%2==0)? "수" : "박";

		}
		System.out.println(answer);
	}

}
