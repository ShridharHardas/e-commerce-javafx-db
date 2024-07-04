package update_product;

import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import product_management.ProductManagementScreen;

public class UpdateActualProductController {
	@FXML
	TextField productname;
	@FXML
	TextField productquantity;
	@FXML
	TextField productprice;
	@FXML
	Label errormessage2;
	
	
	public void updateProduct() throws SQLException
	{
		UpdateProductViewController updateProductViewController=new UpdateProductViewController();
		String updateQuery="update product set productName='"+productname.getText()+"',productQuantity='"+productquantity.getText()+"', productPrice='"+productprice.getText()+"' where productName='"+updateProductViewController.productnametoupdate.getText()+"'";
		DBUtil.executeQuery(updateQuery);
		errormessage2.setText("Product Update successfully..!");
		errormessage2.setTextFill(Color.GREEN);
	}
	public void BackButton()
	{
		new ProductManagementScreen().show();
	}
}
