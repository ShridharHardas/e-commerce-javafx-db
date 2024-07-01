package e_commerce_main;

import common_db_screen.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx_login.LoginScreen;

public class ApplicationMain extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stageProvidedByJavafx) throws Exception {
		StageHolder.stage=stageProvidedByJavafx;
		new LoginScreen().show();
		
		
	}

}
