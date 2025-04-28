package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
	
	/* 목차. 1. extends 키워드를 이용하여 Car 클래스 상속 */
	public FireCar() {
		
		/*  모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
		 *  부모의 기본 생성자를 호출하는 구문이다.
		 *  해당 생성자가 호출 될 시 가장 먼저 Car 클래스 호출 내용이 출력될 것이다.
		 *  명시적, 묵시적 전부 사용 가능하다.
		 * */
		super(); //적지않더라도 컴파일러에서 자동으로 추가해줌
		
		System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
	}

	/* 목차. 2. soundHorn() 오버라이딩 */

	/*  @Override 어노테이션
	 *  JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	 *  (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
	 *  오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
	 * */
	@Override
	public void soundHorn() {

		if(isRunning()) {

			System.out.println("빠아아아아앙~~~~~~빠아아아아아아앙!!!!!!!!!!!!");
		} else {
			
			System.out.println("소방차가 앞으로 갈 수 없습니다~ 비키세요 비켜~~");
		}
	}
	
	/* 목차. 3. 물뿌리는 기능 추가 */
	public void sprayWater() {
		
		/* 소방차는 추가적으로 물뿌리는 기능을 수행할 수 있다. */
		System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ======================>>>");
	}
}
