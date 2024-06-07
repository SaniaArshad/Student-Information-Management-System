package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChangeScenes {
	public void changeSceneToLogin(Stage currentStage) throws IOException {
		URL url = new File("src/application/LoginPage.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}

	public void changeSceneToManageCourse(Stage currentStage) throws IOException {
		URL url = new File("src/application/ManageCourse.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}

	public void changeSceneToRegisterStudent(Stage currentStage) throws IOException {
		URL url = new File("src/application/RegisterStudent.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}



	public void changeSceneToUploadMarks(Stage currentStage) throws IOException {
		URL url = new File("src/application/UploadMarks.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}


	public void changeSceneToRegisterCourse(Stage currentStage) throws IOException {
		URL url = new File("src/application/RegisterCourses.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToTimetable(Stage currentStage) throws IOException {
		URL url = new File("src/application/Timetable.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToUploadAttendence(Stage currentStage) throws IOException {
		URL url = new File("src/application/UploadAttendence.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToUploadFinalGrade(Stage currentStage) throws IOException {
		URL url = new File("src/application/UploadFinalGrade.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToGiveFeedback(Stage currentStage) throws IOException {
		URL url = new File("src/application/GiveFeedback.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToGiveFeedback2(Stage currentStage) throws IOException {
		URL url = new File("src/application/GiveFeedback2.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	
	public void changeSceneToManageFeedback(Stage currentStage) throws IOException {
		URL url = new File("src/application/ManageFeedback.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToManageFeedback2(Stage currentStage) throws IOException {
		URL url = new File("src/application/ManageFeedback2.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToAllotCourseToTeacher(Stage currentStage) throws IOException {
		URL url = new File("src/application/AllotCourseToTeacher.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToRegisterTeacher(Stage currentStage) throws IOException {
		URL url = new File("src/application/RegisterTeacher.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
	public void changeSceneToCourseWithdraw(Stage currentStage) throws IOException {
		URL url = new File("src/application/CourseWithdraw.fxml").toURI().toURL();
		Parent roots = FXMLLoader.load(url);
		Scene scene = new Scene(roots);
		currentStage.setScene(scene);
		currentStage.show();
	}
}
