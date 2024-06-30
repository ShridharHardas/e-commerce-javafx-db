package javafx_add_product;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx_ProducManagement.ProductManagementView;

public class ProductManagementController {
	@FXML
	Button addproductrbutton;
	@FXML
	Button updateproductbutton;
	@FXML
	Button searchbutton;
	@FXML
	Button deleteproductbutton;
	@FXML
	Button printproductbutton;
	@FXML
	Button back;
	
	public void addProductButton()
	{
		ProductManagementView.showAddProductScreen();
	}
	
	public void updateProductButton()
	{
		ProductManagementView.showUpdateProductScreen();
	}
	
	public void searchButton()
	{
		ProductManagementView.showSearchProductScreen();
	}
	public void deleteProductButton()
	{
		ProductManagementView.showDeleteProductScreen();
	}
	public void printProductButton()
	{
		ProductManagementView.showPrintProductScreen();
	}
	
	public void backbutton()
	{
		ProductManagementView.showBackMenuScreen();
	}

}
