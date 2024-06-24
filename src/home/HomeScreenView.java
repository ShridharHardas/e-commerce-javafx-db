package home;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeScreenView extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Home Page");
		URL fxmlLoad=Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce-javafx-db\\src\\home\\HomeScreen.fxml").toUri().toURL();
		Parent actorgroup=FXMLLoader.load(fxmlLoad);
		Scene scene=new Scene(actorgroup,1300,800);
		stage.setScene(scene);
		stage.show();
				
	}

}
