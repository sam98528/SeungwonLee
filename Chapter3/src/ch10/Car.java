package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("차 시동 부릉부릉");
		
	}
	
	public void turnOff() {
		System.out.println("차 시동 오프");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
