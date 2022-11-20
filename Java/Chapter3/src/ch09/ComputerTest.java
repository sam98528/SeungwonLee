package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer1 = new DeskTop();
		Computer computer2 = new MyNoteBook();
		
		computer1.display();
		computer1.turnOff();
		computer2.display();
		computer2.turnOff();
		computer1.typing();
		computer2.typing();

	}

}
