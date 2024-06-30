package javafx_UserManagement;

import java.sql.ResultSet;
import java.sql.SQLException;

import Common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class UpdateUserController {
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
	@FXML
	TextField updateName;
	@FXML
	Label errormessage1;
	public void updateExecute() throws SQLException
	{
		String checkQuery="select * from user where userFirstName='"+updateName.getText()+"'";
		ResultSet updateResultSet=DBUtil.executeSelectQuery(checkQuery);
		if(updateResultSet.next())
		{
			errormessage1.setText("User Found To Update..!");
			errormessage1.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage1.setText("User Not Found..!");
			errormessage1.setTextFill(Color.RED);
		}
		
	}
	public void updateUser() throws SQLException
	{
		String updateQuery="update user set userFirstName='"+firstNameText.getText()+"',userLastName='"+lastNameText.getText()+"',userAge='"+ageText.getText()+"',userGender='"+genderText.getText()+"',userEmail='"+emailText.getText()+"',userPassword='"+passwordText.getText()+"' where userFirstName='"+updateName.getText()+"'";
		DBUtil.executeQuery(updateQuery);
		errormessage.setText("Update User Successfully..!");
		errormessage.setTextFill(Color.GREEN);
	}
	
	public void backButton()
	{
		UserManagementView.showBackUserMenuScreen();
	}
	
}
