package application;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManageCourseController implements Initializable {
	ChangeScenes m = new ChangeScenes();
	@FXML
	private Label label;
	@FXML
	public TextField tfCourseName;
	@FXML
	public TextField tfCourseID;
	@FXML
	public TextField tfCourseDescription;
	@FXML
	private TableView<Course> tvCourse;
	@FXML
	private TableColumn<Course, String> colCourseName;
	@FXML
	private TableColumn<Course, String> colCourseID;
	@FXML
	private TableColumn<Course, String> colCourseDescription;
	@FXML
	private Button btnInsert;
	@FXML
	private Button btnUpdate;
	@FXML
	private Button btnDelete;

	DBHandler db = new DBHandler();

	@FXML
	private void handleButtonAction(ActionEvent event) {

		if (event.getSource() == btnInsert) {
			Course c=new Course(tfCourseName.getText(),tfCourseID.getText(),tfCourseDescription.getText());
			new School().AddCourse(c);
			db.showCourse(tvCourse,colCourseID,colCourseDescription,colCourseName);	
		} else if (event.getSource() == btnUpdate) {
			Course c=new Course(tfCourseName.getText(),tfCourseID.getText(),tfCourseDescription.getText());
			new School().UpdateCourse(c);
			db.showCourse(tvCourse,colCourseID,colCourseDescription,colCourseName);
		} else if (event.getSource() == btnDelete) {
			Course c=new Course(tfCourseName.getText(),tfCourseID.getText(),tfCourseDescription.getText());
			new School().DeleteCourse(c);
			db.showCourse(tvCourse,colCourseID,colCourseDescription,colCourseName);
		}
	}

	public ManageCourseController() {
	}

	public void initialize(URL url, ResourceBundle rb) {
		db.showCourse(tvCourse,colCourseID,colCourseDescription,colCourseName);
	}

	public void switchToLogin(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToLogin(s);
	}

	public void switchToManageCourse(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToManageCourse(s);
	}

	public void switchToRegisterStudent(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToRegisterStudent(s);
	}

	public void switchToTimetable(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToTimetable(s);
	}
	public void switchToRegisterTeacher(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToRegisterTeacher(s);
	}

	public void switchToAllotCourseToTeacher(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToAllotCourseToTeacher(s);
	}
	



}
