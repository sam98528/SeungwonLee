package ch16_1;

public class SuperLevel extends PlayerLevel{

	
	@Override
	protected void run() {
		System.out.println("엄청빠르게 달립니다.");
		
	}
	
	@Override
	protected void jump() {
			System.out.println("아주높이 Jump합니다");
		
	}

	@Override
	protected void turn() {
		System.out.println("Turn 합니다");
		
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다 ******");
		
	}
}
