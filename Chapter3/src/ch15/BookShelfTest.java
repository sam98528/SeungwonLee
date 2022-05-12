package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("Test1");
		bookQueue.enQueue("Test2");
		bookQueue.enQueue("Test3");
		bookQueue.enQueue("Test4");
		bookQueue.enQueue("Test5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
	}

}
