package application;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class School {

	public void registerStudent(Student s) {
		PersistenceHandler db = new DBHandler();
		db.insertStudentRecord(s);
	}
	
	public void allotCourseToTeacher(CourseAllotment ca) {
		PersistenceHandler db = new DBHandler();
		db.allotCourseToTeacher(ca);
	}


	public void AddCourse(Course c) {
		PersistenceHandler db = new DBHandler();
		db.insertCourseRecord(c);
	}

	public void DeleteCourse(Course c) {
		PersistenceHandler db = new DBHandler();
		db.deleteCourseButton(c);

	}
	public void registerTeacher(Teacher t) {
		PersistenceHandler db = new DBHandler();
		db.insertTeacherRecord(t);
	}
	public void UpdateCourse(Course c) {
		PersistenceHandler db = new DBHandler();
		db.updateCourseRecord(c);
	}

	public void uploadMarks(Marks m) {
		PersistenceHandler db = new DBHandler();
		db.updateMarksRecord(m);
		;
	}

	public void registerCourse(Register s) {
		PersistenceHandler db = new DBHandler();
		db.insertRegisteredCourse(s);

	}
	public void withdrawCourse(Register s) {
		PersistenceHandler db = new DBHandler();
		db.withdrawRegisteredCourse(s);

	}
	public void giveFeedBack(Feedback f) {
		PersistenceHandler db = new DBHandler();
		db.insertFeedback(f);
	}

	public void insertTimetableRecord(Timetable t) {
		PersistenceHandler db = new DBHandler();
		db.insertTimetableRecord(t);
	}

	public void deleteTimeTable(Timetable t) {
		PersistenceHandler db = new DBHandler();
		db.deleteTimetableButton(t);
	}

	public void updateTimeTable(Timetable t) {
		PersistenceHandler db = new DBHandler();
		db.updateTimetableRecord(t);
	}

	public void uploadAttendance(Attendance a) {
		PersistenceHandler db = new DBHandler();
		db.uploadAttendance(a);

	}

	public void uploadGrade(Grade g) {
		PersistenceHandler db = new DBHandler();
		db.insertGrade(g);

	}
}
