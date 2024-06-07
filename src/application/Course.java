package application;

public class Course {
	private String courseName;
	private String courseID;
	private String courseDescription;
	
	public Course(String courseName, String courseID, String courseDescription) {
		this.courseName = courseName;
		this.courseID = courseID;
		this.courseDescription = courseDescription;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	

}
