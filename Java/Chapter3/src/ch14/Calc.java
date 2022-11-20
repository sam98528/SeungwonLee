package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 제공합니다");
		myMethod();
	}
	
	static int total(int[] arr) {
		myStaticMethod();
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
	
	private void myMethod() {
		System.out.println("MyMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}