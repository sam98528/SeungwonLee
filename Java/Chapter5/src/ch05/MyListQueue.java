package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue{

	
	MyListNode front;
	MyListNode rear;
	
	public MyListQueue(){
		front = null;
		rear = null;
	}
	
	public void enQueue(String data) {
		MyListNode newNode;
		
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}else {
			newNode = addElement(data);
			rear = newNode;
		}
		
	}

	public String deQueue() {
		MyListNode tempNode;
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}else {
			String data = front.getData();
			tempNode = front.next;
			front = front.next;
			if(front == null) {
				front = rear;
			}
			return data;
		}
		
	}
	
	public void printAll() {
		MyListNode tempNode = front;
		while(tempNode != rear.next) {
			System.out.print(tempNode.getData());
			tempNode = tempNode.next;
			if(tempNode != null) {
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}
	
}
