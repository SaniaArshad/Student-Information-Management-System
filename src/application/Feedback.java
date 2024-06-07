package application;

public class Feedback {
	Student s = new Student();
	private String rollNo = s.getRollNo();
	private String feedback;

	public Feedback(String rollNo, String feedback) {
		this.rollNo = rollNo;
		this.feedback = feedback;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
