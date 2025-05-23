package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

	/* 수업목표. 오버로딩(Overloading)에 대해 이해할 수 있다. */
	/* 생성자 작성 시 동일한 이름의 생성자를 한 클래스 내에서 작성하는게 불가능하다는 것을 확인했다.
	 *  또한, 매개변수 부분의 타입, 갯수, 순서를 다르게 작성하면 서로 다른 메소드나 생성자로 인식하기 때문에
	 *  동일한 이름의 생성자나 메소드를 여러 개 작성할 수 있게 하기도 했다.
	 *  그러한 것을 오버로딩(Overloading) 이라고 한다.
	 * */

	/* 오버로딩의 사용 이유
	 *  매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
	 *  이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기가 매우 어려울 것이다.
	 *  규모가 작은 프로그램의 경우는 정도가 덜 하지만, 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
	 *  따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로 관리하기 위해
	 *  사용하는 기술을 오버로딩이라고 한다.
	 * */

	/* 오버로딩의 조건
	 *  동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
	 *  한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
	 *  메소드의 시그니쳐(Signature)가 다르면 다른 메소드로 인식하기 때문이다.
	 *  즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.
	 * */

	/* 메소드의 시그니쳐란?
	 *  public void method(int num) {} 이라는 메소드의 메소드명과 파라미터 선언부 부분을 시그니쳐라고 부른다.
	 *  method(int num) 이 부분이 시그니처이다.
	 *  메소드의 시그니처가 달라야 하기 때문에 접근제한자나 반환형은 오버로딩 성립요건에 해당하지 않는다.
	 * */
	public void test() {}
	
	/* 메소드의 시그니처가 동일한 경우 Compile Error를 발생시킨다. */
//	public void test() {}		//에러남
	
	/* 접근제한자에 따른 오버로딩 성립 확인 */
//	private void test() {}			//에러남	//접근제한자는 메소드 시그니처에 해당하지 않는다.
	
	/* 반환형에 따른 오버로딩 성립 확인 */
//	public int test() { return 0; }	//에러남	//반환형은 메소드 시그니처에 해당하지 않는다.
	
	/* 매개변수 유무에 따른 오버로딩 성립 확인 */
	public void test(int num) {}			//파라미터 선언부는 메소드 시그니처에 해당한다.
	
//	public void test(int num2) {}	//에러남	//매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다.
	
	/* 매개변수 갯수에 따른 오버로딩 성립 확인 */
	public void test(int num1, int num2) {}
	
	/* 매개변수 타입 변화에 따른 오버로딩 성립 확인 */
	public void test(int num, String name) {}
	
	/* 매개변수의 순서에 따른 오버로딩 성립 확인 */
	public void test(String name, int num) {}
	
	/* 오버로딩은 매우 중요한 개념이므로 반드시 숙지할 수 있도록 해야 한다.
	 *  뒤에서 배울 오버라이딩과 비교하는 면접 질문이 단골 질문으로 등장하니
	 *  오버라이딩 학습 후에 비교해서 특징을 살펴보자
	 * */
}
