package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UploadFinalGradeController implements Initializable{
	ChangeScenes m=new ChangeScenes();
	public UploadFinalGradeController() {
	}
	@FXML
	private TextField TFenglish;

	@FXML
	private TextField TFurdu;

	@FXML
	private TextField TFcomputer;

	@FXML
	private TextField TFscience;
	@FXML
	private TextField EnterStudentID;
	@FXML
	private TextField TFmath;

	@FXML
	private Button CalculateGradeButton;
	@FXML
	private Label FinalGrade;

	@FXML
	private TextField GradeCalculated;

    @FXML
    private Button SaveGradeButton;
    
	@FXML
	private Text totalabsolutes;
	
	DBHandler db = new DBHandler();
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		db.connectDB();
		if (event.getSource() == SaveGradeButton) {
//			db.insertGrade(EnterStudentID,GradeCalculated);
		}
	}
	@FXML
	private void CalculateGrade(ActionEvent event) {

		String EnglishScore;
		String MathScore;
		String UrduScore;
		String ScienceScore;
		String ComputerScore;

		int totalabs;
		String Grade;
		EnglishScore= TFenglish.getText();
		MathScore=TFmath.getText();
		UrduScore=TFurdu.getText();
		ScienceScore=TFscience.getText();
		ComputerScore=TFcomputer.getText();

		int English= Integer.parseInt(EnglishScore);
		int Math= Integer.parseInt(MathScore);
		int Urdu=Integer.parseInt(UrduScore);
		int Science = Integer.parseInt(ScienceScore);
		int Computer= Integer.parseInt(ComputerScore);
		totalabs= (English+Math+Urdu+Science+Computer);
		totalabsolutes.setText(String.valueOf(totalabs));



		if (event.getSource() == CalculateGradeButton)
		{
			if(((totalabs/500)*100) >= 80) {
				GradeCalculated.setText("A");
			}else if(((totalabs/500)*100) >= 70 && ((totalabs/500)*100)<80 ){
				GradeCalculated.setText("B");
			}else if(((totalabs/500)*100) >= 60 && ((totalabs/500)*100)<70){
				GradeCalculated.setText("C");
			}else if(((totalabs/500)*100) >= 50 && ((totalabs/500)*100)<60){
				GradeCalculated.setText("D");
			}else if( ((totalabs/500)*100)<50){
				GradeCalculated.setText("FAIL");
			}


		}
	}
	
	@FXML
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	public void switchToLogin(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToLogin(s);
	}
	public void switchToUploadMarks(ActionEvent event) throws IOException {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeSceneToUploadMarks(s);
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
