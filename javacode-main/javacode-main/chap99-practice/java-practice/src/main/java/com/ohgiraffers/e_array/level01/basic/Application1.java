package com.ohgiraffers.e_array.level01.basic;

public class Application1 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		/* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
		 * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
		 * */
		
	}
}
