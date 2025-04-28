package com.ohgiraffers.section01.conditional;
import java.util.Scanner;

public class D_switch {

	public void testSimpleSwitchStatement() {

		/* 수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
		/* [switch문 표현식]
		 *  switch(비교할변수) {
		 *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
		 *      default : case에 모두 해당하지 않는 경우 실행할 구문; break;
		 *  }
		 * */

		/* 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
		 *  따라서 일부 호환이 가능하다.
		 *  하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
		 *  실수와 논리는 비교할 수 없다.
		 *  또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
		 *  case절에는 변수를 사용하지 못한다. (값만 비교 가능)
		 *  또한, 문자열 비교는 jdk 1.7 이상부터 가능하다.
		 * */


		/*  정수 두 개와 연산 기호 문자를 입력 받아서
		 *  두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
		 * */

		/* 정수 두 개와 연산 기호 입력 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);

		/* 연산의 결과를 저장할 변수 */
		int result = 0;

		/* 입력한 연산기호 문자에 따라 연산 결과가 달라짐 */
		switch(op) {
			case '+' :
				result = first + second;
				break;
			case '-' :
				result = first - second;
				break;
			case '*' :
				result = first * second;
				break;
			case '/' :
				result = first / second;			//second가 0이면 에러 발생(ArithmeticException)
				break;
			case '%' :
				result = first % second;
				break;
			/* default문은 생략 가능하지만 생략하는 경우 주석으로 생략 이유를 작성해주는 것이 좋다. */
			/* 산술연산 외에 다른 문자에 대한 처리는 생략하였음 */
		}

		System.out.println(first + " " + op + " " + second + " = " + result);
	}

	public void testSwitchVendingMachine() {

		/* 수업목표. switch문 내의 break문에 대해 흐름을 이해하고 적용할 수 있다. */
		/* switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
		 * break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
		 * */

		/* 간단한 자판기 */
		System.out.println("======== ohgiraffers vending machine =========");
		System.out.println(" apple    banana    orange    melon    grape   ");
		System.out.println("==============================================");
		System.out.print("과일을 선택해주세요 : ");

		// 원하는 과일을 문자열로 입력받는다.
		Scanner sc = new Scanner(System.in);
		String selectedFruit = sc.nextLine();

		int price = 0;

		String order = "";

		switch (selectedFruit) {
			case "apple" :
				order = "apple";
				price = 1000;
				break;
			case "banana" :
				order = "banana";
				price = 1500;
				break;
			case "orange" :
				order = "orange";
				price = 2000;
				break;
			case "melon" :
				order = "melon";
				price = 2500;
				break;
			case "grape" :
				order = "grape";
				price = 10000;
				break;
		}

		System.out.println(order + "를 선택하셨습니다.");
		System.out.println(price + "원을 투입해주세요!");
	}
}