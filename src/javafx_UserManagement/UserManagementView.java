package javafx_UserManagement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import Common.CommonStatic;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserManagementView {

	public static void showAddUserScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Add_User");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_UserManagement\\AddUserJavafxScreen.fxml").toUri().toURL();
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
	public static void showUpdateUserScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Update_User");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_UserManagement\\UpdateUserScreen.fxml").toUri().toURL();
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
	public static void showSearchUserScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Search_User");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_UserManagement\\SearchUserScreen.fxml").toUri().toURL();
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
	public static void showDeleteUserScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Delete_User");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_UserManagement\\DeleteUserScreen.fxml").toUri().toURL();
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
	public static void showPrintUserScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Print_User");
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
	public static void showBackUserMenuScreen()
	{
		URL fxmlload;
		try {
			//CommonStatic.stage.setTitle("Print_User");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce_javafx_db\\src\\javafx_add_user\\UserMenuJavaFxScreen.fxml").toUri().toURL();
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
			//CommonStatic.stage.setTitle("Print_User");
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
}
