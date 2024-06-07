package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class AllotCourseToTeacherController implements Initializable{
	
	  @FXML
	    private TextField txtTeacherID;

	    @FXML
	    private TextField txtCourseID;

	    @FXML
	    private Button btnAllotCourse;

		ChangeScenes m = new ChangeScenes();
	
	    public AllotCourseToTeacherController() {
		}


		@FXML
		private void handleButtonAction(ActionEvent event) {

			if (event.getSource() == btnAllotCourse) {
				CourseAllotment t=new CourseAllotment(txtTeacherID.getText(),txtCourseID.getText());
				School s=new School();
				s.allotCourseToTeacher(t);
			}
		}

		@FXML
		public void initialize(URL url, ResourceBundle rb) {
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
