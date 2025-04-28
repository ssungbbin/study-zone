package com.ohgiraffers.c_conditional.level03.hard;

import java.util.Scanner;

public class Applicaion1 {
	
	public static void main(String[] args) {
		
		/* 두 개의 정수를 입력 받아 변수에 저장하고,
		 * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
		 * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
		 * 
		 * -- 입력 예시 --
		 * 첫 번째 정수 : 4
		 * 두 번째 정수 : 3
		 * 연산 기호를 입력하세요 : +
		 * 
		 * -- 출력 예시 --
		 * 4 + 3 = 7 
		 */

		Scanner scr = new Scanner(System.in);
		int answer = 0;

		System.out.print("첫 번째 정수 : ");
		int a = scr.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = scr.nextInt();
		System.out.print("연산 기호를 입력 해주세요 : ");
		String c = scr.next();

		switch(c){
			case "+" :
				System.out.println(a + "+" + b +"=" + (a+b));  break; //괄호를 쳐주지 않으면 "" + + 로 되면서 문자열 취급
			case "-" :
				System.out.println(a + "-" + b + "=" + (a-b)); break;
			case "*" :
				System.out.println(a + "*" + b +"=" + (a*b)); break;
			case "%" :
				System.out.println(a + "%" + b +"=" + (a%b)); break;
			case "/" :
				System.out.println(a + "/" + b +"=" + (a/b)); break;
			default :
				System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
				break;

		}
		
	}
}
