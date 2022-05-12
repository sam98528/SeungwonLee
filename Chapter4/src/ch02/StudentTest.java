package ch02;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student Kim1 = new Student(1000, "Kim");
		Student Kim2 = new Student(1000, "Kim");
		
		
		System.out.println(Kim1.equals(Kim2));
		System.out.println(Kim1.toString());
		
		System.out.println(Kim1.hashCode());
		
		Student copyStudent = (Student)Kim1.clone();
		System.out.println(copyStudent.toString());
		System.out.println(copyStudent.hashCode());
		copyStudent.setStudentName("Sam");
		System.out.println(Kim1.toString());
		System.out.println(copyStudent.toString());
	}
	
}
