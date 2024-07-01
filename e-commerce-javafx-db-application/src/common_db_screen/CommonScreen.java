package common_db_screen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CommonScreen {
		public void show()
		{
			//String myPackageName=getClass().getPackageName();
			String myClassName=getClass().getSimpleName();
			String classFilePath=getClass().getResource(myClassName+".class").toString();
			String fileFxmlPath=classFilePath.replace(".class", ".fxml");
			String finalPath=fileFxmlPath.substring(8);
			//System.out.println(myPackageName);
			System.out.println(myClassName);
			System.out.println(classFilePath);
			System.out.println(fileFxmlPath);
			URL fxmlLoadFile;
			try {
				fxmlLoadFile = Paths.get(finalPath).toUri().toURL();
				Parent actorGroup=FXMLLoader.load(fxmlLoadFile);
				Scene scene=new Scene(actorGroup,1300,800);
				StageHolder.stage.setScene(scene);
				StageHolder.stage.show();
			} catch (IOException e) {
				e.printStackTrace();
		}
		
		
		}
}
