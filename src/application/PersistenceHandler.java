package application;

import java.sql.Connection;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public interface PersistenceHandler {
	abstract void connectDB();

	abstract void showFeedback(TableView<Feedback> tvFeedback, TableColumn<Feedback, String> colRollNo,
			TableColumn<Feedback, String> colFeedback);

	abstract void insertStudentRecord(Student s);

	abstract void insertCourseRecord(Course c);

	abstract void insertGrade(Grade g);

	abstract void updateCourseRecord(Course c);

	abstract void deleteCourseButton(Course c);

	abstract void showCourse(TableView<Course> tvCourse, TableColumn<Course, String> colCourseName,
			TableColumn<Course, String> colCourseID, TableColumn<Course, String> colCourseDescription);

	abstract void showMarks(TableView<Marks> tvMarks, TableColumn<Marks, String> colRollNo,
			TableColumn<Marks, String> colMarks, TableColumn<Marks, String> colAssessmentCategory);

	abstract void showTimetable(TableView<Timetable> Tableview, TableColumn<Timetable, String> Colsubject,
			TableColumn<Timetable, String> colclass, TableColumn<Timetable, String> coltimeslot);

	abstract void loadDate(TableView<Attendance> AttendanceTV, TableColumn<Attendance, String> StudentIDCol,
			TableColumn<Attendance, String> AttendanceCol);
	
	abstract void updateMarksRecord(Marks m);
	
	abstract void insertRegisteredCourse(Register r);
	
	abstract void insertFeedback(Feedback f);
	
	abstract void insertTimetableRecord(Timetable t);
	
	abstract void updateTimetableRecord(Timetable t);
	
	abstract void deleteTimetableButton(Timetable t);

	abstract void uploadAttendance(Attendance a);
	
	abstract void insertTeacherRecord(Teacher t);
	
	abstract void allotCourseToTeacher(CourseAllotment ca);
	
	abstract void withdrawRegisteredCourse(Register r);

	abstract void InsertAttendance(TextField TFSTUDENTID, TextField TFEnterAttendance);

}