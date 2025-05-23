package com.ohgiraffers.section03.overriding;

public class SuperClass {

	/* 수업목표. 오버라이딩(overriding)에 대해 이해할 수 있다. */
	/*  오버라이딩이란?
	 *  부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것이다.
	 * 
	 *  오버라이딩 성립요건
	 *  1. 메소드의 이름이 동일해야 한다.
	 *  2. 메소드의 리턴 타입이 동일해야 한다.
	 *  3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.
	 *  4. private 메소드는 접근이 불가능하기 때문에 오버라이딩이 불가능하다.
	 *  5. final 키워드가 사용된 메소드는 오버라이딩이 불가능하다.
	 *  6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
	 *  7. 예외처리는 같은 예외이거나 더 구체적(하위)인 예외를 처리해야 한다.	<- 예외처리 챕터에서 다룸
	 *  */

	/* 오버라이딩 테스트를 위한 기준이 되는 메소드 */
	public void method(int num) {}
	
	private void privateMethod() {} // private 더 작은 범위로 오버라이딩 불가
	
	public final void finalMethod() {} //오버라이딩 불가
	
	protected void protectedMethod() {} // 오버라이딩 가능
}
