package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Feedback2Controller  implements Initializable{
	@FXML
	private Button btnSubmit;

	@FXML
	private TextField tfrollnofeedback;

	@FXML
	private TextArea tffeedbacktextarea;
	
	DBHandler db = new DBHandler();
	ChangeScenes m = new ChangeScenes();
	
	public Feedback2Controller() {
	}
	@FXML
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	@FXML
	private void handleButtonAction(ActionEvent event) {
		if (event.getSource()==btnSubmit) {
			Feedback f=new Feedback(tfrollnofeedback.getText(),tffeedbacktextarea.getText());
			School s=new School();
			s.giveFeedBack(f);
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
