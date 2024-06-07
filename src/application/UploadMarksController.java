package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class UploadMarksController  implements Initializable{
	@FXML
    private Button BtnUpload;

    @FXML
    private TextField tfAC;

    @FXML
    private TextField tfrollNo;

    @FXML
    private TextField tfMarks;

    @FXML
    private TableView<Marks> tvMarks;

    @FXML
    private TableColumn<Marks, String> colRollNo;

    @FXML
    private TableColumn<Marks, String> colMarks;

    @FXML
    private TableColumn<Marks, String> colAssessmentCategory;
	 DBHandler db=new DBHandler();
	
	ChangeScenes m=new ChangeScenes();
	@FXML
	private void handleButtonAction(ActionEvent event) {

		if (event.getSource() == BtnUpload) {
			Marks m=new Marks(tfAC.getText(),Integer.parseInt(tfMarks.getText()),tfrollNo.getText());
			db.updateMarksRecord(m);
			db.showMarks(tvMarks,colRollNo,colMarks,colAssessmentCategory);
		}	
	}
	public UploadMarksController() {
	}

	public void initialize(URL url, ResourceBundle rb) {
		db.showMarks(tvMarks,colRollNo,colMarks,colAssessmentCategory);
	}
	public void switchToLogin(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToLogin(s);
	}

	public void switchToUploadAttendence(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToUploadAttendence(s);
	}
	public void switchToManageFeedback(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToManageFeedback(s); 
	}
	public void switchToUploadFinalGrade(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToUploadFinalGrade(s); 
	}

}
