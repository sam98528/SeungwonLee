package ch09;

public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("Comptuer is ON.");
	}
	
	public void turnOff() {
		System.out.println("Comptuer is OFF.");
	}
	
}
