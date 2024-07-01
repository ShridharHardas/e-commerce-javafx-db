package javafx_add_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common_db_screen.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx_product_management.ProductManagementScreen;
import javafx_user_management.UserManagementScreen;

public class AddProductController {
	@FXML
	TextField productname;
	@FXML
	TextField productquantity;
	@FXML
	TextField productprice;
	@FXML
	Label errormessage;
	
	public void addProduct() throws SQLException
	{
		String insertQuery="insert into product(productName,productQuantity,productPrice) values('"+productname.getText()+"','"+productquantity.getText()+"','"+productprice.getText()+"')";
		String checkQuery="select * from product where productName='"+productname.getText()+"'";
		ResultSet resultSet=DBUtil.executeSelectQuery(checkQuery);
		if(resultSet.next())
		{
			errormessage.setText("Product Already Exits..!");
			errormessage.setTextFill(Color.RED);
		}
		else
		{
			errormessage.setText("Product Addition Successfully..!");
			errormessage.setTextFill(Color.GREEN);
			DBUtil.executeQuery(insertQuery);
		}
	}
	public void backbutton()
	{
		new ProductManagementScreen().show();
	}

}
