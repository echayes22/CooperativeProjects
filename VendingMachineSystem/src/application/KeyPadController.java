package application;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class KeyPadController implements Initializable {
	
	 @FXML
	 /*
	  * These are buttons for the keypad
	  * The descriptions match what is on the keypad when buying an item on the keypad
	  */
	    private Button buttonA;

	    @FXML
	    private Button button1;

	    @FXML
	    private Button button2;

	    @FXML
	    private Button buttonB;

	    @FXML
	    private Button button3;

	    @FXML
	    private Button button4;

	    @FXML
	    private Button buttonC;

	    @FXML
	    private Button button5;

	    @FXML
	    private Button button6;

	    @FXML
	    private Button buttonD;
	    
	    @FXML
	    private Button button7;

	    @FXML
	    private Button button8;

	    @FXML
	    private Button buttonE;

	    @FXML
	    private Button button9;

	    @FXML
	    private Button button0;

	    @FXML
	    private TextField textFieldCustomerInput;

	    @FXML
	    private Button buttonF;

	    @FXML
	    private Button buttonStar;

	    @FXML
	    private Button buttonCLR;

	    @FXML
	    private Button buttonBuy;

	    @FXML
	    private Button buttonRefund;
	    
		
		@FXML
		private Button enterButton;
		
		 @FXML
		    private TextArea screenForIteam;

	    @FXML
	    public void displayOptions(ActionEvent event) {
	    	if(event.getSource() == buttonA) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "A");
	    	}else if(event.getSource() == buttonB) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "B");
	    	}
	    	else if(event.getSource() == buttonB) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "B");
	    	}
	    	else if(event.getSource() == buttonC) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "C");
	    	}
	    	else if(event.getSource() == buttonD) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "D");
	    	}
	    	else if(event.getSource() == buttonE) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "E");
	    	}
	    	else if(event.getSource() == buttonF) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "F");
	    	}
	    	else if(event.getSource() == button1) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "1");
	    	}
	    	else if(event.getSource() == button2) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "2");
	    	}
	    	else if(event.getSource() == button3) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "3");
	    	}
	    	else if(event.getSource() == button4) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "4");
	    	}
	    	else if(event.getSource() == button5) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "5");
	    	}
	    	else if(event.getSource() == button6) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "6");
	    	}
	    	else if(event.getSource() == button7) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "7");
	    	}
	    	else if(event.getSource() == button8) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "8");
	    	}
	    	 
	    	else if(event.getSource() == button9) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "9");
	    	}
	    	else if(event.getSource() == button0) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "0");
	    	}
	    	else if(event.getSource() == buttonStar) {
	    		textFieldCustomerInput.setText(textFieldCustomerInput.getText() + "*");
	    	}
	    	else if(event.getSource() == buttonCLR) {
	    		textFieldCustomerInput.setText("");
	    	}

	    }
	    
	    
	    @FXML
	    public void tototalShopping(ActionEvent event) {
	    	int total = 0;
	    	if(textFieldCustomerInput.getText().contentEquals("A1")) {
	    		total+=1.75;
	    	}
	    	else if(textFieldCustomerInput.getText().contentEquals("A2")) {
	    		total+=1.25;
	    	}
	    	String finalTotal = Integer.toString(total);
	    	System.out.println(finalTotal);
	    }
	    /*
	    @FXML
		public void displayProductDryGoods(ActionEvent event ) {
	    	/*TODO This way brings up errors. Need to think of a way to implement this
	    	ImageView view = new ImageView(gummyTrolli);
			if(event.getSource() == enterButton && textFieldCustomerInput.getText()== "C3") {
				displayProduct.+++++(view);
			}
			
		}
		*/
		
		

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
