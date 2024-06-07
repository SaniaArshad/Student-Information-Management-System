package application;

public class Register {
	private String courseID;
	Student s= new Student();
	private String rollNo= s.getRollNo();

	public Register(String courseID, String rollNo ) {
		
		this.courseID = courseID;
		this.rollNo=rollNo;
	}

	public String getcourseID() {
		return courseID;
	}

	public void setcourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	

}