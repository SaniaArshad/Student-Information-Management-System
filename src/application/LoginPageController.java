package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class LoginPageController {
	ChangeScenes m=new ChangeScenes();
	public LoginPageController() {
	}

	@FXML
	public void initialize() {
	}
	public void switchToAdmin(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToRegisterStudent(s);
		
	}
	public void switchToTeacher(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToUploadMarks(s);
	}
	public void switchToStudent(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToRegisterCourse(s);
	}

}
