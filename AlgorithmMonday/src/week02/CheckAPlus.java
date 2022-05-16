package week02;

import java.util.Scanner;

public class CheckAPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double l,s,n;
		int k,m,temp;
		boolean score = true;
		boolean project = true;
		
		for(int i = 0; i < t; i++) {
			l = sc.nextDouble();
			s = sc.nextDouble();
			n = sc.nextDouble();
			if(s / l >= n / l) {
				score = false;
				System.out.println(l + " " + s + " "+ n);
				break;
			}
			k = sc.nextInt();
			m = sc.nextInt();
			for(int j = 0; j < k; j++) {
				temp = sc.nextInt();
				if(temp < m) {
					project = false;
				}
			}
		}
		if(score == false || project == false) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
		sc.close();
	}

}
