package javafx_user_management;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx_add_user.AddUserScreen;
import javafx_delete_user.DeleteUserScreen;
import javafx_home.HomeScreen;
import javafx_search_user.SearchUserScreen;
import javafx_update_user.UpdateUserViewScreen;


public class UserManagementController {
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
		new AddUserScreen().show();
	}
	
	public void updateUserButton()
	{
		new UpdateUserViewScreen().show();
	}
	
	public void searchButton()
	{
		new SearchUserScreen().show();
	}
	public void deleteUserButton()
	{
		new DeleteUserScreen().show();
	}
	public void printUserButton()
	{
		//UserManagementView.showPrintUserScreen();
	}
	
	public void backbutton()
	{
		new HomeScreen().show();
	}

}
