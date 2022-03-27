package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
	
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
	// switches to Customer screen
	public void switchToCustomerScene(ActionEvent event) throws IOException {
		root= FXMLLoader.load(getClass().getResource("CustomerScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}
	// switches to Technician screen
	public void switchToTechnicianScene(ActionEvent event) throws IOException {
		root= FXMLLoader.load(getClass().getResource("TechnicianScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}
	// switches to Manager screen
	public void switchToManagerScene(ActionEvent event) throws IOException {
		root= FXMLLoader.load(getClass().getResource("ManagerScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}
	// switches to ToDryGoods screen
	public void switchToDryGoods(ActionEvent event) throws IOException {
		root= FXMLLoader.load(getClass().getResource("DryGoodsOptionsScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}
	// switches to ToDryGoods screen
	public void switchToColdGoods(ActionEvent event) throws IOException {
		root= FXMLLoader.load(getClass().getResource("ColdGoodsOptionScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}
	
	
}
