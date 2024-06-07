package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class DBHandler implements PersistenceHandler {
	Connection con;
	Course course;
	Marks marks;
	Student student;
	ManageCourseController mc;
	Timetable Timetable;
	Feedback feedback;
	Attendance attendance;
	Grade grade;
	UploadFinalGradeController ContObj;

	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			if (con == null) {
				System.out.println("DB connection failed");
			} else
				System.out.println("DB connection successful");

		} catch (Exception e) {
			System.out.println("exception: " + e);
		}
	}

	public ObservableList<Course> getCourseList() {
		ObservableList<Course> courseList = FXCollections.observableArrayList();
		String query = "Select * FROM course";
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * FROM course");

			while (rs.next()) {
				course = new Course(rs.getString("courseName"), rs.getString("courseID"),
						rs.getString("courseDescription"));
				courseList.add(course);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return courseList;
	}

	public ObservableList<Timetable> getTtable() {
		ObservableList<Timetable> Ttable = FXCollections.observableArrayList();
		String query = "SELECT * FROM timetable";
		Statement stm;
		ResultSet rset;
		try {
			stm = con.createStatement();
			rset = stm.executeQuery("SELECT * FROM timetable");

			while (rset.next()) {
				Timetable = new Timetable(rset.getString("Subject"), rset.getString("class"),
						rset.getString("Timeslot"));
				Ttable.add(Timetable);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return Ttable;
	}

	public ObservableList<Marks> getMarksList() {
		ObservableList<Marks> marksList = FXCollections.observableArrayList();
		String query = "Select * FROM marks";
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * FROM marks");

			while (rs.next()) {
				marks = new Marks(rs.getString("assessmentCategory"), rs.getInt("marks"), rs.getString("rollNo"));
				marksList.add(marks);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return marksList;
	}

	public ObservableList<Attendance> getAttendance() {
		ObservableList<Attendance> aList = FXCollections.observableArrayList();
		String query = "Select * FROM attendance";
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * FROM attendance");

			while (rs.next()) {
				attendance = new Attendance(rs.getString("rollNo"), rs.getString("Attendance"));
				aList.add(attendance);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return aList;
	}

	public ObservableList<Timetable> getTimetableList() {
		ObservableList<Timetable> timetableList = FXCollections.observableArrayList();
		String query = "Select * FROM timetable";
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * FROM  timetable");

			while (rs.next()) {
				Timetable = new Timetable(rs.getString("Subject"), rs.getString("class"), rs.getString("Timeslot"));
				timetableList.add(Timetable);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return timetableList;
	}

	public void showFeedback(TableView<Feedback> tvFeedback, TableColumn<Feedback, String> colRollNo,
			TableColumn<Feedback, String> colFeedback) {
		connectDB();
		ObservableList<Feedback> feedbackList = FXCollections.observableArrayList();
		String query = "Select * FROM feedback";
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * FROM feedback");

			while (rs.next()) {
				feedbackList.add(new Feedback(rs.getString("rollNo"), rs.getString("feedback")));
				colRollNo.setCellValueFactory(new PropertyValueFactory<Feedback, String>("rollNo"));
				colFeedback.setCellValueFactory(new PropertyValueFactory<Feedback, String>("feedback"));
				tvFeedback.setItems(feedbackList);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void insertStudentRecord(Student s) {
		connectDB();
		String query = "INSERT INTO student VALUES ('" + s.getRollNo() + "','" + s.getName() + "')";
		executeQuery(query);
	}

	public void insertTeacherRecord(Teacher t) {
		connectDB();
		String query = "INSERT INTO teacher VALUES ('" + t.getTeacherID()+ "','" + t.getTeacherName() +"','"+t.getQualification()+ "')";
		executeQuery(query);
	}
	
	public void allotCourseToTeacher(CourseAllotment ca) {
		connectDB();
		String query = "INSERT INTO courseallotment VALUES ('" + ca.getCourseID() + "','" + ca.getTeacherID() + "')";
		executeQuery(query);
	}
	
	private void executeQuery(String query) {
		Statement st;
		try {
			st = con.createStatement();
			st.executeUpdate(query);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void insertCourseRecord(Course c) {
		connectDB();
		String query = "INSERT INTO course VALUES ('" + c.getCourseName() + "','" + c.getCourseID() + "','"
				+ c.getCourseDescription() + "')";
		executeQuery(query);
	}

	public void insertGrade(Grade g) {
		connectDB();
		String query = "INSERT INTO finalgrade VALUES ('" + g.getRollNo() + "','" + g.getGrade()
				+ "')";
		executeQuery(query);
	}

	public void updateCourseRecord(Course c) {
		connectDB();
		String query = "UPDATE  course SET courseName  = '" + c.getCourseName() + "', courseDescription = '"
				+ c.getCourseDescription() + "' WHERE courseID = '" + c.getCourseID() + "'";
		executeQuery(query);
	}

	public void deleteCourseButton(Course c) {
		connectDB();
		String query = "DELETE FROM course WHERE courseID ='" + c.getCourseID() + "'";
		executeQuery(query);
	}

	public void showCourse(TableView<Course> tvCourse, TableColumn<Course, String> colCourseName,
			TableColumn<Course, String> colCourseID, TableColumn<Course, String> colCourseDescription) {
		connectDB();
		ObservableList<Course> list = getCourseList();
		colCourseName.setCellValueFactory(new PropertyValueFactory<Course, String>("courseName"));
		colCourseID.setCellValueFactory(new PropertyValueFactory<Course, String>("courseID"));
		colCourseDescription.setCellValueFactory(new PropertyValueFactory<Course, String>("courseDescription"));
		tvCourse.setItems(list);
	}

	public void showMarks(TableView<Marks> tvMarks, TableColumn<Marks, String> colRollNo,
			TableColumn<Marks, String> colMarks, TableColumn<Marks, String> colAssessmentCategory) {
		connectDB();
		ObservableList<Marks> list = getMarksList();
		colRollNo.setCellValueFactory(new PropertyValueFactory<Marks, String>("rollNo"));
		colAssessmentCategory.setCellValueFactory(new PropertyValueFactory<Marks, String>("assessmentCategory"));
		colMarks.setCellValueFactory(new PropertyValueFactory<Marks, String>("marks"));
		tvMarks.setItems(list);
	}

	public void showTimetable(TableView<Timetable> Tableview, TableColumn<Timetable, String> Colsubject,
			TableColumn<Timetable, String> colclass, TableColumn<Timetable, String> coltimeslot) {
		connectDB();
		ObservableList<Timetable> list = getTimetableList();
		Colsubject.setCellValueFactory(new PropertyValueFactory<Timetable, String>("Subject"));
		colclass.setCellValueFactory(new PropertyValueFactory<Timetable, String>("class"));
		coltimeslot.setCellValueFactory(new PropertyValueFactory<Timetable, String>("Timeslot"));
		Tableview.setItems(list);
	}

	public void loadDate(TableView<Attendance> AttendanceTV, TableColumn<Attendance, String> StudentIDCol,
			TableColumn<Attendance, String> AttendanceCol) {
		connectDB();
		ObservableList<Attendance> LIST = getAttendance();
		StudentIDCol.setCellValueFactory(new PropertyValueFactory<Attendance, String>("rollNo"));
		AttendanceCol.setCellValueFactory(new PropertyValueFactory<Attendance, String>("Attendance"));
		AttendanceTV.setItems(LIST);
	}

	private void executeMarksQuery(String query) {
		Statement st;
		try {
			st = con.createStatement();
			st.executeUpdate(query);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void updateMarksRecord(Marks m) {
		String query = "UPDATE  marks SET marks  = " + m.getMarks() + ", assessmentCategory = '" + m.getAssessmentCategory()
				+ "' WHERE rollNo = '" + m.getRollNo()+ "'";
		executeQuery(query);
	}

	public void insertRegisteredCourse(Register r) {
		connectDB();
		String query = "INSERT INTO coursesRegistered VALUES ('" + r.getcourseID() + "','" + r.getRollNo() + "')";
		executeQuery(query);
	}
	public void withdrawRegisteredCourse(Register r) {
		connectDB();
		String query = "DELETE FROM coursesRegistered WHERE rollNo ='" + r.getRollNo() + "' AND courseID='" +r.getcourseID()+"'";
		executeQuery(query);
	}
	public void insertFeedback(Feedback f) {
		connectDB();
		String query = "INSERT INTO Feedback VALUES ('" + f.getRollNo() + "','"
				+ f.getFeedback() + "')";
		executeQuery(query);
	}

	public void insertTimetableRecord(Timetable t) {
		connectDB();
		String query = "INSERT INTO timetable VALUES ('" + t.getSubject() + "','" + t.getClassroom() + "','"
				+ t.getTimeslot() + "')";
		executeQuery(query);
	}

	public void InsertAttendance(TextField TFSTUDENTID, TextField TFEnterAttendance) {
		String query = "UPDATE  attendance SET Attendance  = '" + TFEnterAttendance.getText() + "' WHERE rollNo = '"
				+ TFSTUDENTID.getText() + "'";
		executeQuery(query);
	}
	public void uploadAttendance(Attendance a) {
		String query = "UPDATE  attendance SET Attendance  = '" +a.getAttendance() + "' WHERE rollNo = '"
				+ a.getRollNo() + "'";
		executeQuery(query);
	}

	public void updateTimetableRecord(Timetable t) {
		connectDB();
		String query = "UPDATE timetable SET Timeslot  = '" + t.getTimeslot() + "', class = '" + t.getClassroom()
				+ "' WHERE Subject = '" +t.getSubject() + "'";
		executeQuery(query);
	}

	public void deleteTimetableButton(Timetable t) {
		connectDB();
		String query = "DELETE FROM timetable WHERE Subject ='" + t.getSubject() + "'";
		executeQuery(query);
	}

	

}
