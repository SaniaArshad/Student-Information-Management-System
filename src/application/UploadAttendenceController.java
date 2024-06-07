package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UploadAttendenceController implements Initializable{
	Attendance attendance;
	@FXML
	private Button updateAttendance;

	@FXML
	private TableView<Attendance> AttendanceTV;

	@FXML
	private TableColumn<Attendance, String> StudentIDCol;

	@FXML
	private TextField TFEnterAttendance;

	@FXML
	private TableColumn<Attendance, String> AttendanceCol;
	
    @FXML
    private TextField TFSTUDENTID;
	DBHandler db = new DBHandler();
	ChangeScenes m = new ChangeScenes();
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		db.connectDB();
		if (event.getSource() == updateAttendance) {
			db.InsertAttendance(TFSTUDENTID,TFEnterAttendance);
			db.loadDate(AttendanceTV,StudentIDCol,AttendanceCol);
		}
	}


	public void initialize(URL url, ResourceBundle rb) {
		db.loadDate(AttendanceTV,StudentIDCol,AttendanceCol);
	}

	public UploadAttendenceController() {
	}
	public void switchToLogin(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToLogin(s);
	}

	public void switchToUploadMarks(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToUploadMarks(s);
	}

	public void switchToUploadAttendence(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToUploadAttendence(s);
	}

	public void switchToManageFeedback(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToManageFeedback(s);
	}

	public void switchToUploadFinalGrade(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToUploadFinalGrade(s);
	}

	
}
