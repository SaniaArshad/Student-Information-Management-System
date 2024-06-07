package application;

public class Marks {
	private String assessmentCategory;
	private int marks;
	Student s=new Student();
	private String rollNo= s.getRollNo();

	public Marks(String assessmentCategory, int marks, String rollNo ) {
		this.assessmentCategory = assessmentCategory;
		this.marks = marks;
		this.rollNo=rollNo;
	}

	public String getAssessmentCategory() {
		return assessmentCategory;
	}

	public void setAssessmentCategory(String assessmentCategory) {
		this.assessmentCategory = assessmentCategory;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	

}
