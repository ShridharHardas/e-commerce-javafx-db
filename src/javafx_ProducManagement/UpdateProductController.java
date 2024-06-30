package javafx_ProducManagement;

import java.sql.ResultSet;
import java.sql.SQLException;

import Common.DBUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class UpdateProductController {
	@FXML
	TextField productname;
	@FXML
	TextField productquantity;
	@FXML
	TextField productprice;
	@FXML
	TextField productnametoupdate;
	@FXML
	Label errormessage2;
	@FXML
	Label errormessage1;
	public void updateProductExecute() throws SQLException
	{
		String checkQuery="select * from product where productName='"+productnametoupdate.getText()+"'";
		ResultSet updateResultSet=DBUtil.executeSelectQuery(checkQuery);
		if(updateResultSet.next())
		{
			errormessage1.setText("Product Found to update..!");
			errormessage1.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage1.setText("Product Not Found..!");
			errormessage1.setTextFill(Color.RED);
		}
	}
	
	public void updateProduct() throws SQLException
	{

		String updateQuery="update product set productName='"+productname.getText()+"',productQuantity='"+productquantity.getText()+"', productPrice='"+productprice.getText()+"' where productName='"+productnametoupdate.getText()+"'";
		DBUtil.executeQuery(updateQuery);
		errormessage2.setText("Product Update successfully..!");
		errormessage2.setTextFill(Color.GREEN);
	}
	public void backButton()
	{
		ProductManagementView.showBackUnderProductManagement();
	}
}
