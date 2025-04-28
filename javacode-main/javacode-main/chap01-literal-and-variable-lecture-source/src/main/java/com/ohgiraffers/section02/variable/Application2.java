package com.ohgiraffers.section02.variable;

public class Application2 {

	public static void main(String[] args) {
		
		/* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. */
		/* 변수를 사용하는 방법
		 *   1. 변수를 준비한다.(선언)
		 *   2. 변수에 값을 대입한다.(값 대입 및 초기화)
		 *   3. 변수를 사용한다.
		 * */
		
		/* 목차. 1. 변수를 준비한다. (선언) */
		/* 목차. 1-1. 변수를 선언하는 방법 */
		/* 자료형 변수명; */
		
		/* 기본자료형 8가지를 살펴보자. */
		
		/* 목차. 1-1-1. 숫자를 취급하는 자료형 */
		/* 정수를 취급하는 자료형은 4가지가 있다. */
		byte bnum;			//1byte
		short snum;			//2byte
		int inum;			//4byte
		long lnum;			//8byte
		
		/* 실수를 취급하는 자료형은 2가지가 있다. */
		float fnum;			//4byte
		double dnum;		//8byte
		
		/* 목차. 1-1-2. 문자를 취급하는 자료형 */
		/* 문자를 취급하는 자료형은 한 가지가 있다. */
		char ch;			//2byte
		char ch2;
		
		/* 목차. 1-1-3. 논리값을 취급하는 자료형 */
		boolean isTrue;		//1byte
		
		/* 이상 8가지를 기본자료형(Primary type)이라고 한다. (문자열은 나중에 깊게 다룬다.)*/
		
		/* 목차. 1-1-4. 문자열을 취급하는 자료형 */
		String str;			//4byte (엄밀히 이야기 하면 주소값은 4byte 정수형이다.)
		
		/* 목차. 2. 변수에 값을 대입한다.(값 대입 및 초기화) */
		/* 목차. 2-1. 정수를 취급하는 자료형에 값 대입 */
		bnum = 1;
		snum = 2;
		inum = 4;
		//lnum = 8;			//아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야 한다. 그 이유는 뒤에 형변환에서 다루게 될 것이다.
		lnum = 8L;			//소문자로 'l'을 써도 되지만 글꼴에 따라 숫자 1과 혼선이 빚어질 수 있어서 대문자로 하는 것이 권장이다.
		
		/* 목차. 2-2. 실수를 취급하는 자료형에 값 대입 */
		//fnum = 4.0;		//실수 형태의 값을 fnum에 사용하는 것은 불가능하다.
		fnum = 4.0f;		//실수 뒤에 'f'를 붙여야 한다. 대문다 'F'도 가능하지만 소문자를 사용하는 것이 일반적이다.
		dnum = 8.0;
		
		/* 목차. 2-3. 문자를 취급하는 자료형에 값 대입 */
		ch = 'a';			//문자 형태의 값을 저장할 수 있다.
		ch2 = 97;			//'a'는 97이라는 숫자였지? 그래서 숫자로도 저장할 수 있다.
		
		/* 목차. 2-4. 논리를 취급하는 자료형에 값 대입 */
		isTrue = true;
		isTrue = false;		//true 혹은 false 중 한 가지의 값만 사용 가능하다.
		
		/* 목차. 2-5. 문자열을 취급하는 자료형에 값 대입 */
		str = "안녕하세요";
		
		/*  숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double이다.
		 *  일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
		 *  정수형은 int, 실수형은 double이 대표 자료형이다.
		 * */
		
		/* 선언과 동시에 초기화 */
		int point = 100;
		int bonus = 10;
		
		/* 목차. 3. 변수를 사용한다. */
		/* 목차. 3-1. 변수에 저장한 값 출력하기 */
		/* 위에서 선언 후 초기화 한 변수들을 출력해보자 */
		System.out.println("========== 변수에 저장된 값 출력 ===========");
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("ch2의 값 : " + ch2);
		
		System.out.println("isTrue의 값 : " + isTrue);
		
		System.out.println("str의 값 : " + str);
		
		/* 목차. 3-2. 변수를 이용해서 연산하기 */
		/* 변수에 저장된 값을 이용해서 연산을 할 수도 있다. */
		System.out.println("포인트와 보너스의 합은? : " + (point + bonus));
		
		/* 목차. 3-3. 대입연산자의 왼쪽과 오른쪽 편에 사용하기 */
		/* 대입연산자의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미이다.
		 *  따라서 point라는 공간에 point가 가지고 있는 값에 + 100한 값을 대입하라는 의미이다.
		 * */
		point = point + 100;
		
		System.out.println("point = point + 100 ? " + point);
	}
}
