package add_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import user_management.UserManagementScreen;

public class AddUserController {
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
	public void addUser() throws SQLException
	{
		if(passwordText.getText().contains(confirmPassword.getText()))
		{
		String insertQuery="insert into user(userFirstName,userLastName,userAge,userGender,userEmail,userPassword) values('"+firstNameText.getText()+"','"+lastNameText.getText()+"','"+ageText.getText()+"','"+genderText.getText()+"','"+emailText.getText()+"','"+passwordText.getText()+"')";
		String checkuser="select * from user where userFirstName='"+firstNameText.getText()+"' and userLastName='"+lastNameText.getText()+"'";
		ResultSet Result=DBUtil.executeSelectQuery(checkuser);
		if(Result.next())
		{
			errormessage.setText("User Already Exit...!");
			errormessage.setTextFill(Color.RED);
		}
		else
		{
		
			errormessage.setText("User Addition Successfully...!");
			errormessage.setTextFill(Color.GREEN);
			DBUtil.executeQuery(insertQuery);
			
		}
		}
		else
		{
			errormessage.setText("Password does not Match..!");
			errormessage.setTextFill(Color.RED);
		}
	}
	public void backButton()
	{
		new UserManagementScreen().show();
	}
}
