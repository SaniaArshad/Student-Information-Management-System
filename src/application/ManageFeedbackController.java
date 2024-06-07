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
import javafx.util.Callback;

public class ManageFeedbackController implements Initializable {

	@FXML
	private TableView<Feedback> tvFeedback;

	@FXML
	private TableColumn<Feedback, String> colRollNo;

	@FXML
	private TableColumn<Feedback, String> colFeedback;
	
	DBHandler db = new DBHandler();
	
	ChangeScenes m = new ChangeScenes();
	
	
	public ManageFeedbackController() {
	}
	public void initialize(URL url, ResourceBundle rb) {
		db.showFeedback(tvFeedback,colRollNo,colFeedback);
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

	public void switchToManageFeedback2(ActionEvent event) throws IOException {
		Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
		m.changeSceneToManageFeedback2(s);
	}

}
