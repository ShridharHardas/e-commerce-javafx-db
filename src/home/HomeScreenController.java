package home;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx_add_product.AddProductView;
import javafx_add_user.AddUserView;
import login.LoginScreenController;

public class HomeScreenController {
	@FXML
	Button adduserbutton;
	@FXML
	Button addproductbutton;
	@FXML
	Button logoutbutton;
	
	public void addUserButton() {
		System.out.println("Add User Button");
		AddUserView.showAddUserScreen();
	}
	public void addProductButton() {
		System.out.println("Add Product Button");
		AddProductView.showAddProductScreen();
	}
	public void LogoutButton() throws SQLException {
//		LoginScreenController loginScreenController=new LoginScreenController();
//		loginScreenController.userClickLogin();
	}

}
