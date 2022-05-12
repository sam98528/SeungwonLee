package ch02;

public class Student implements Cloneable {

	
	private String studentName;
	private int studentID;
	
	public Student(int studentID , String studentName) {
		this.studentName = studentName;
		this.studentID = studentID;
	}
	
	
	
	public String toString() {
		return studentID + "," + studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentName == std.studentName) {
				return true;
			}
		}else 
			return false;
		return false;
	}

	@Override
	public int hashCode() {
		return this.studentID;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
