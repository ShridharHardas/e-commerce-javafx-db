package javafx_home;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import Common.CommonStatic;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeScreenView  {

	

	public static  void show()  {
		CommonStatic.stage.setTitle("Home_Page");
		URL fxmlLoad;
		try {
			fxmlLoad = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_home\\HomeScreen.fxml").toUri().toURL();
			Parent actorgroup;
			try {
				actorgroup = FXMLLoader.load(fxmlLoad);
				Scene scene=new Scene(actorgroup,1300,800);
				CommonStatic.stage.setScene(scene);
				CommonStatic.stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
