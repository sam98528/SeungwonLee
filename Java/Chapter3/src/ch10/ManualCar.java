package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("수동 주행을 합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("수동 주행을 멈춥니다.");
		
	}

}
