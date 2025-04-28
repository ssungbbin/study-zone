package com.ohgiraffers.section01.extend;

public class Car {

	/* 자동차의 달리는 상태를 확인할 수 있는 필드 */
	private boolean runningStatus;
	
	public Car() {
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}

	public void run() {
		
		/* 자동차는 기본적으로 달리는 기능을 수행할 수 있다. */
		runningStatus = true;
		System.out.println("자동차가 달립니다.");
	}
	
	public void soundHorn() {
		
		/* 자동차는 주행중인 상태일 때 기본적인 경적을 울리는 기능을 수행할 수 있다. */
		if(isRunning()) {
			
			System.out.println("빵!빵!");
		} else {
			
			System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다.");
		}
	}

	public boolean isRunning() {

		/* 자동차의 주행중 상태를 반환하는 기능을 수행할 수 있다. */
		return runningStatus;
	}

	public void stop() {
		
		/* 자동차는 기본적으로 멈추는 기능을 수행할 수 있다. */
		runningStatus = false;
		System.out.println("자동차가 멈춥니다.");
	}
}
