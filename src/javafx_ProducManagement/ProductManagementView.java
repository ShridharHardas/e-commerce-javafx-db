package javafx_ProducManagement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import Common.CommonStatic;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagementView {
	public static void showAddProductScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Add_Product");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_ProducManagement\\CreateProductScreen.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void showUpdateProductScreen()
	{

		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Update_Product");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_ProducManagement\\UpdateProductScn.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showSearchProductScreen()
	{

		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Search_Product");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_ProducManagement\\SearchProductScreen.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showDeleteProductScreen()
	{

		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Delete_Product");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_ProducManagement\\DeleteProductScreen.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showPrintProductScreen()
	{

		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Print_Product");
			fxmlload = Paths.get("").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showBackMenuScreen()
	{

		URL fxmlload;
		try {
		    //CommonStatic.stage.setTitle("Update_Product");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_home\\HomeScreen.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void showBackUnderProductManagement()
	{

		URL fxmlload;
		try {
		    //CommonStatic.stage.setTitle("Update_Product");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_add_product\\ProductMenuScreen.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
