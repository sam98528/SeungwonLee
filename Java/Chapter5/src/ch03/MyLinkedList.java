package ch03;

public class MyLinkedList {
	private MyListNode head;
	int count;

	public MyLinkedList() {
		head = null;
		count = 0;
	}

	public MyListNode addElement(String data) {
		MyListNode newNode;

		if (head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		} else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}

	public MyListNode insertElement(int position, String data) {
		MyListNode preNode = null;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);

		if (position < 0 || position > count) {
			return null;
		}
		if (position == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;

		}
		count++;
		return newNode;
	}

	public MyListNode removeElement(int position) {
		MyListNode preNode = null;
		MyListNode tempNode = head;

		if (position < 0 || position > count) {
			return null;
		}
		if (position == 0) {
			head = tempNode.next;
		} else {
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}

	public String getElement(int position) {
		MyListNode tempNode = head;
		for (int i = 0; i < position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode.getData();
	}

	public void printAll() {
		MyListNode tempNode = head;
		for (int i = 0; i < count; i++) {
			System.out.print(tempNode.getData());
			tempNode = tempNode.next;
			if(tempNode != null) {
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}else {
			return false;
		}
	}
	public void removeAll() {
		head = null;
		count = 0;
	}

	public int getSize() {
		return count;
	}

}
