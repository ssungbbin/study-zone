package com.ohgiraffers.section02.variable;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 변수의 사용 목적에 대해 이해할 수 있다. */
		/*  변수의 사용 목적
		 *   1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리기 때문이다.)
		 *   2. 한 번 저장해둔 값을 재사용 하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 때도 보다 간편하게 변경할 수 있다.)
		 *   3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변하는 값을 저장하기 위한 공간이다)
		 * */
		
		/* 목차. 1. 값에 의미를 부여하기 위한 목적 */
		System.out.println("================= 값에 의미 부여 테스트 ===================");
		/* 아래 처럼 작성하면 어느 값이 급여인지 어느 값이 보너스 금액인지 알 수 없다. */
		System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");

		/* 아래 처럼 의미를 부여하게 되면 어느 값이 급여인지, 보너스인지를 명확하게 알 수 있게 한다. */
		int salary = 1000000;
		int bonus = 200000;
		System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");
		
		/* 목차. 2. 한 번 저장해둔 값을 재사용하기 위한 목적 */
		System.out.println("================ 변수에 저장한 값 재사용 테스트 =================");
		/* 10명의 고객에게 100 포인트를 지급해주는 내용을 출력하도록 작성해보자 */
		System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");
		
		/* 위 코드에서 공통적으로 사용된 100이라고 하는 값을 변수에 넣고 변수를 호출하여 코드를 개선해보자 */
		int point = 100;
		System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		
		/* 목차. 3. 시간에 따라 변경되는 값을 저장하고 사용할 수 있다. */
		System.out.println("=========== 변수에 저장된 값 변경 테스트 ==============");
		/* 변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기 위한 공간이다. */
		int sum = 0;
		
		sum = sum + 10;
		System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
		
		sum = sum + 10;
		System.out.println("sum에 10이 있었으니 10을 추가로 더하면? " + sum);
		
		sum = sum + 10;
		System.out.println("sum에 20이 있었는데 추가로 10을 더 더하면? " + sum);
		
		/* 동일한 sum 이라는 변수를 세 번 출력했지만, 출력하는 시점마다 수행된 연산의 결과에 따라 출력되는 sum의 값은 달라진다. */
		
		int count = 0;

		count = count + 1;
		System.out.println("count에 1을 더하면 현재 count의 값은? " + count);
	}
}
