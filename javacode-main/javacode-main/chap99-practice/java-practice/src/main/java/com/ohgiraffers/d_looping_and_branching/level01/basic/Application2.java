package com.ohgiraffers.d_looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수를 입력하세요 : ");
		int a = scr.nextInt();

		for(int i =1; i<=a;i++){
			sum +=i;
		}
		System.out.println("1 ~" + a + "까지의 합은 : " + sum );
		
		/* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 정수를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 1부터 5까지의 합 : 15
		 * 
		 * */
		
	}
}
