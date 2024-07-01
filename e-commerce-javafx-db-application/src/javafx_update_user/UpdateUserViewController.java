package javafx_update_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common_db_screen.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx_user_management.UserManagementScreen;


public class UpdateUserViewController {
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
			new UpdateActualScreen().show();
		}
		else
		{
			errormessage1.setText("User Not Found..!");
			errormessage1.setTextFill(Color.RED);
		}
		
	}
	
	public void backButton()
	{
		new UserManagementScreen().show();
	}

}
