package javafx_product_management;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx_add_product.AddProductScreen;
import javafx_delete_product.DeleteProductScreen;
import javafx_home.HomeScreen;
import javafx_search_product.SearchProductScreen;
import javafx_update_product.UpdateProductViewScreen;

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
		new AddProductScreen().show();
	}
	
	public void updateProductButton()
	{
		new UpdateProductViewScreen().show();
	}
	
	public void searchButton()
	{
		new SearchProductScreen().show();
	}
	public void deleteProductButton()
	{
		new DeleteProductScreen().show();
	}
	public void printProductButton()
	{
		//ProductManagementView.showPrintProductScreen();
	}
	
	public void backbutton()
	{
		new HomeScreen().show();
	}


}
