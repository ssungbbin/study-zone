package com.ohgiraffers.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/* 수업목표. 오버플로우에 해대 이해할 수 있다. */
		/* 자료형 별 값의 최대 범위를 벗어나는 경우
		 *  발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
		 * */

		/* 목차. 1. 오버플로우 */
		byte num1 = 127;
		
		System.out.println("num1 : " + num1);						//127 : byte의 최대 저장 범위
		
		num1++;														//1 증가
		
		System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위
		
		/* 목차 2. 언더플로우 */
		/* 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
		 * */
		byte num2 = -128;
		
		System.out.println("num2 : " + num2);						//-128 : byte의 최소 저장 범위
		
		num2--;														//1 감소
		
		System.out.println("num2 underflow : " + num2);				//127 : byte의 최대 저장 범위

		int firstNum = 1000000;			//100만
		int secondNum = 700000;			//70만
		
		int multi = firstNum * secondNum;		//7천억이 나와야 함
		
		System.out.println("firstNum * secondNum = " + multi);			//--79669248 이 나온다.
		
		/* 목차. 3.해결방법 */
		/* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
		long longMulti = firstNum * secondNum;
		
		System.out.println("longMulti : " + longMulti);		//안되지?? 똑같지??


		long result = (long) firstNum * secondNum;
		
		System.out.println("result : " + result);			//정상적으로 7천억이 출력될 것이다.
	}
}
