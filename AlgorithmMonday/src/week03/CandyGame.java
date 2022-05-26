package week03;

import java.util.Scanner;

public class CandyGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int num = 0;
		int A = 0;
		int B = 0;
		
		for(int i = 0; i < t; i++) {
			num = sc.nextInt();
			if(num % 2 == 0) {
				A++;
			}else {
				B++;
			}
		}
		if(A > B) {
			System.out.println(A);
		}else if (A < B) {
			System.out.println(B);
		}else
			System.out.println("tie");
	}

}
