package login;

import java.net.URL;
import java.nio.file.Paths;

import Common.CommonStatic;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class LoginScreenView extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		CommonStatic.stage=stage;
		CommonStatic.stage.setTitle("User_Login");
		//stage.setFullScreen(true);
		//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Esc"));
		URL fxmlLoad=Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce-javafx-db\\src\\login\\LoginScreen.fxml").toUri().toURL();
		Parent actorgroup=FXMLLoader.load(fxmlLoad);
		Scene scene=new Scene(actorgroup,1300,800);
		CommonStatic.stage.setScene(scene);
		CommonStatic.stage.show();
	}

}
