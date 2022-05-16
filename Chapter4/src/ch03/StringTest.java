package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String ("Java");
		String android = new String ("Android");
		
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		System.out.println(System.identityHashCode(java));
		System.out.println(java);
		

	}

}
