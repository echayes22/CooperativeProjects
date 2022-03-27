package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CustomerBuyingOptions {
	 @FXML
	    private TextField customerName;

	    @FXML
	    private TextField customerWalTextArea;

	    @FXML
	    private RadioButton creditCardToggle;

	    @FXML
	    private RadioButton cashToggle;

	    @FXML
	    private TextField creditCardTextArea;

	    @FXML
	    private TextField cashTextArea;
	    
	    @FXML
	    private Button enterCash;

	    @FXML
	    private Button enterCredit;
	  
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
		//gets the amount being entered
	    @FXML
	    void displayWalletAmount(ActionEvent event) throws Exception {
	    	String currentCash= cashTextArea.getText();
	    	String customerName= cashTextArea.getText();
	    	customerWalTextArea.setText(currentCash);
	    	int money = Integer.parseInt(currentCash);
	    	Customer c = new Customer(customerName, money);
	    	System.out.println(c);
	    }
	    //marks out the option not being used
	    @FXML
	    public void isCashCustomer (ActionEvent event ) {
	    	
	    	if(cashToggle.isSelected()== true) {
	    		creditCardTextArea.setDisable(true);
	    		creditCardToggle.setDisable(true);
	    	}
	    	else if(cashToggle.isSelected()== false) {
	    		cashTextArea.setDisable(true);
	    		cashToggle.setDisable(true);
	    	}
	    }
	    
	    
	    
	    
}
