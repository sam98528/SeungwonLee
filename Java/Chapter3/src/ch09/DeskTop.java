package ch09;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop Display");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing");
		
	}

	@Override
	public void turnOff() {
		System.out.println("DeskTop TurnOFF");
	}
}
