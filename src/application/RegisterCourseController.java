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
import javafx.scene.control.TextArea;
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

public class RegisterCourseController implements Initializable {
	@FXML
	private Button btnregister;

	@FXML
	private TableView<Course> tvCourse;

	@FXML
	private TableColumn<Course, String> colCourseDescription;

	@FXML
	private TableColumn<Course, String> colCourseID;

	@FXML
	private TableColumn<Course, String> colCourseName;

	@FXML
	private TextField tfcourses;

	@FXML
	private TextField tfrollno;

	
	DBHandler db = new DBHandler();
	ChangeScenes m = new ChangeScenes();

	public RegisterCourseController() {
	}

	@FXML
	public void initialize(URL url, ResourceBundle rb) {
		db.showCourse(tvCourse, colCourseName, colCourseID, colCourseDescription);
	}

	@FXML
	private void handleButtonAction(ActionEvent event) {
		if (event.getSource() == btnregister) {
			Register r=new Register(tfcourses.getText(), tfrollno.getText());
			School s=new School();
			s.registerCourse(r);
			
		}
	}

	public void switchToLogin(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToLogin(s);
	}

	public void switchToFeedback(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToGiveFeedback(s);
	}

	public void switchToRegisterCourse(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToRegisterCourse(s);
	}

	public void switchToGiveFeedback2(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToGiveFeedback2(s);
	}
	public void switchToCourseWithdraw(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToCourseWithdraw(s);
	}

}
