package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class SearchUserController {
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
	TextField searchName;
	public void searchUser() throws SQLException
	{
		String searchUser="select * from user where userFirstName='"+searchName.getText()+"'";
		ResultSet searchResultSet=DBUtil.executeSelectQuery(searchUser);
		if(searchResultSet.next())
		{
			firstNameText.setText(searchResultSet.getString(2));
			lastNameText.setText(searchResultSet.getString(3));
			ageText.setText(searchResultSet.getString(4));
			genderText.setText(searchResultSet.getString(5));
			emailText.setText(searchResultSet.getString(6));
		}
	}
	public void backButton()
	{
		new UserManagementScreen().show();
	}

}
