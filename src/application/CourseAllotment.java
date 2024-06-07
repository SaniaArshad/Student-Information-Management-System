package application;

public class CourseAllotment {
	Course c=new Course();
	private String courseID= c.getCourseID();
	Teacher t=new Teacher();
	private String teacherID= t.getTeacherID();
	
	public CourseAllotment(String teacherID,String courseID) {
		this.courseID = courseID;
		this.teacherID = teacherID;
	}


	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}


	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	
	

	
}
