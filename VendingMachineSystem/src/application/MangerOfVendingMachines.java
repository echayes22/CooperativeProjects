package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MangerOfVendingMachines {

	// collection of the products available
	private ArrayList<Product> totalProducts;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	// switches to Home screen
	public void switchToHomeScene(ActionEvent event) throws IOException {
		root= FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}

	public ArrayList<Product> listItems() {
		return totalProducts;
	}

	public void addProductDry(String name, double price, String manufacturer, String date, String type) {
		try {
			Product addProduct = new Product(name, price, manufacturer, date, type);
			// base adding to total class. Need to refractor it to updateMethod.
			totalProducts.add(addProduct);

		} catch (Exception e) {
			System.out.println("Please enter the correct information");
		}

	}

	public void addProductCold(String name, double price, String manufacturer, String date, String type, double maxTemp,
			double minTemp) {
		try {
			Product addProduct = new Product(name, price, manufacturer, date, type);
			// base adding to total class. Need to refractor it to updateMethod.
			totalProducts.add(addProduct);

		} catch (Exception e) {
			System.out.println("Please enter the correct information");
		}

	}


}
