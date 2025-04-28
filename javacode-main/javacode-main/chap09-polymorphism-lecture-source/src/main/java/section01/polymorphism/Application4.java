package section01.polymorphism;


public class Application4 {

	public static void main(String[] args) {

		/* 수업목표. 다형성을 적용하여 리턴타입에 활용할 수 있다. */
		/* 목차. 1. getRandomAnimal() 추가 */

		/* 목차. 2. getRandomAnimal() 호출 */
		Application4 app4 = new Application4();
		
		Animal randomAnimal = app4.getRandomAnimal();
		randomAnimal.cry();
	}
	
	public Animal getRandomAnimal() {
		
		int random = (int) (Math.random() * 2);
		
		return random == 0? new Rabbit(): new Tiger();
	}
}
