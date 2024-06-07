package application;

public class Grade {

	Student s = new Student();
	private String rollNo = s.getRollNo();
	String Grade;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public Grade(String rollNo, String grade) {
		this.rollNo = rollNo;
		Grade = grade;
	}
}