package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue listQueue = new MyListQueue();
		listQueue.enQueue("A");
		listQueue.printAll();
		listQueue.enQueue("B");
		listQueue.printAll();
		listQueue.enQueue("C");
		listQueue.printAll();
		listQueue.enQueue("D");
		listQueue.printAll();
		listQueue.enQueue("E");
		
		System.out.println(listQueue.deQueue());
		listQueue.printAll();
		listQueue.removeAll();
		listQueue.printAll();

	}

}
