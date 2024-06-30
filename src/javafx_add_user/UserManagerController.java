package javafx_add_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import Common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx_UserManagement.UserManagementView;

public class UserManagerController {
	@FXML
	Button adduserbutton;
	@FXML
	Button updateuserbutton;
	@FXML
	Button searchbutton;
	@FXML
	Button deleteuserbutton;
	@FXML
	Button printuserbutton;
	@FXML
	Button back;
	
	public void addUserButton()
	{
		UserManagementView.showAddUserScreen();
	}
	
	public void updateUserButton()
	{
		UserManagementView.showUpdateUserScreen();
	}
	
	public void searchButton()
	{
		UserManagementView.showSearchUserScreen();
	}
	public void deleteUserButton()
	{
		UserManagementView.showDeleteUserScreen();
	}
	public void printUserButton()
	{
		UserManagementView.showPrintUserScreen();
	}
	
	public void backbutton()
	{
		UserManagementView.showBackMenuScreen();
	}
}
