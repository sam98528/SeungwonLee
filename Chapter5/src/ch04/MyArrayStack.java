package ch04;

import ch02.MyArray;

public class MyArrayStack {
	
	MyArray arrayStack;
	int top;
	
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray(10);
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is FULL");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	
	public int pop() {
		if(arrayStack.isEmpty()) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {
		if(arrayStack.isEmpty()) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(top);
	}
	public boolean isFull() {
		if (top == arrayStack.ARRAY_SIZE) {
			return true;
		} else
			return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
	public int getSize() {
		return top;
	}
}
