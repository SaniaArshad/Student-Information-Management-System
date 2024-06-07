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
public class TimetableController  implements Initializable{
	ChangeScenes m = new ChangeScenes();

	@FXML
	private TextField TFtimeslot;

	@FXML
	private TextField TFclass;

	@FXML
	private TextField TFsubject;
	@FXML
	private TableView<Timetable> Tableview;
	@FXML
	private TableColumn<Timetable, String> Colsubject;

	@FXML
	private TableColumn<Timetable, String> colclass;

	@FXML
	private TableColumn<Timetable, String> coltimeslot;
	@FXML
	private Button Addbtn;
	@FXML
	private Button Updatebtn;
	@FXML
	private Button deletebtn;
	@FXML
	DBHandler db = new DBHandler();

	@FXML
	private void handleButtonAction(ActionEvent event) {
		if (event.getSource() == Addbtn) {
			Timetable t=new Timetable(TFsubject.getText(),TFclass.getText(),TFtimeslot.getText());
			new School().insertTimetableRecord(t);
			db.showTimetable(Tableview, Colsubject,colclass,coltimeslot);	
		} else if (event.getSource() == Updatebtn) {
			Timetable t=new Timetable(TFsubject.getText(),TFclass.getText(),TFtimeslot.getText());
			new School().updateTimeTable(t);
			db.showTimetable(Tableview, Colsubject,colclass,coltimeslot);	
		} else if (event.getSource() == deletebtn) {
			Timetable t=new Timetable(TFsubject.getText(),TFclass.getText(),TFtimeslot.getText());
			new School().deleteTimeTable(t);
			db.showTimetable(Tableview, Colsubject,colclass,coltimeslot);	
		}
	}

	public TimetableController() {
	}

	public void initialize(URL url, ResourceBundle rb) {
		db.showTimetable(Tableview, Colsubject,colclass,coltimeslot);	
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
