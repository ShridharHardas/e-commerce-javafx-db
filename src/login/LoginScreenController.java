package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import Common.DBUtil;
import home.HomeScreenView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {

	@FXML
	TextField username;
	@FXML
	TextField password;
	@FXML
	Label error_message;
	
	public void userClickLogin() throws SQLException
	{
		String userFromJavaFx=username.getText();
		String passwordFromJavaFx=password.getText();
	String validateUser="select * from user where userFirstName='"+userFromJavaFx+"' &&  userPassword='"+passwordFromJavaFx+"'";
		ResultSet validate=DBUtil.executeSelectQuery(validateUser);
		if(validate.next())
		{
			error_message.setText("Login Success");
			error_message.setTextFill(Color.GREEN);
			HomeScreenView.show();
		}
		else
		{
			error_message.setText("Login Failed");
			error_message.setTextFill(Color.RED);
		}
	}
}
