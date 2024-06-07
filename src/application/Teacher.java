package application;

public class Teacher {
	
	private String teacherID;
	private String teacherName;
	private String Qualification;
	
	public Teacher(String teacherID, String teacherName, String qualification) {
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		Qualification = qualification;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	
	

}
