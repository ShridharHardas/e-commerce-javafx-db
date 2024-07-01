package javafx_update_user;

import java.sql.SQLException;

import common_db_screen.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx_user_management.UserManagementScreen;

public class UpdateActualController {
	
	@FXML
	TextField firstNameText;
	@FXML
	TextField lastNameText;
	@FXML
	TextField ageText;
	@FXML
	TextField genderText;
	@FXML
	TextField emailText;
	@FXML
	TextField passwordText;
	@FXML
	TextField confirmPassword;
	@FXML
	Label errormessage;
	public void updateUser() throws SQLException
	{
		UpdateUserViewController updateUserViewController=new UpdateUserViewController();
		String updateQuery="update user set userFirstName='"+firstNameText.getText()+"',userLastName='"+lastNameText.getText()+"',userAge='"+ageText.getText()+"',userGender='"+genderText.getText()+"',userEmail='"+emailText.getText()+"',userPassword='"+passwordText.getText()+"' where userFirstName='"+updateUserViewController.updateName.getText()+"'";
		DBUtil.executeQuery(updateQuery);
		errormessage.setText("Update User Successfully..!");
		errormessage.setTextFill(Color.GREEN);
	}
	public void BackButtonMenu() 
	{
		new UserManagementScreen().show();
	}
}
