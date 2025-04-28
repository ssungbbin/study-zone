package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

	/* 목차. 1. extends 키워드를 이용하여 Car 클래스 상속 */
	public RacingCar() {

		System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
	}

	/* 목차. 2. run() 오버라이딩 */
	@Override
	public void run() {
		
		System.out.println("레이싱카가 전속력으로 질주합니다!!!!!!!!!");
	}

	/* 목차. 3. soundHorn(), stop() 오버라이딩 */
	@Override
	public void soundHorn() {
		
		System.out.println("레이싱카는 경적을 울리지 않습니다. (조용....)");
	}
	
	@Override
	public void stop() {
		
		System.out.println("레이싱카가 멈춥니다.");
	}
	
	/* 상속만 했을 뿐이지 거의 새로운 클래스를 작성한 것과 다름이 없다.
	 * 
	 *  불필요하게 상속을 하는 경우 오히려 유지보수성에 악영향을 미친다고 했다.
	 *  extends Car 부분을 제거해보면 수 많은 컴파일 에러가 발생하는 것을 볼 수 있다.
	 *  이런 경우는 차라리 상속을 하지 않는 것이 더 나은 상황이 된다.
	 * 
	 *  그래서 객체지향프로그래밍에서 상속은 다형성의 토대가 되는 중요한 기술이긴 하지만
	 *  오용할 경우 이러한 유지보수에 악영향을 미칠 수 있다는 의미이다.
	 * 
	 *  상속보다는 작게 작성한 블럭을 조합하며 프로그래밍 하는 것이 더 좋은 방식이 된다.
	 *  하지만 이 부분은 초급개발자가 공부할 수 있는 영역을 벗어나기에 후에 깊게 공부해야 이해할 수 있을 것이다.
	 * */
	
}
