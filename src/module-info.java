module i202425_UI {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires javafx.base;
	opens application to javafx.graphics, javafx.fxml;
	exports application;
}
