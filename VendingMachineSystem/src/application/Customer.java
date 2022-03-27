package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Customer {

	private String name;
	private int wallet;
	
	 @FXML
	    private TextField customerName;

	    @FXML
	    private TextField customerWallet;
	

    public Customer (String name, int wallet) throws Exception{
    	this.name = name;
    	if(wallet<0)
    		throw new Exception("Please enter a positve wallet amount");
    	this.wallet = wallet;
    }
    
    //getter for to grab a customer's name
    public String getName() {
    	return name;
    }
    
    //setter to set the customer's name
    public void setName(String name) {
    	this.name = name;
    }
    // sets the amount of money the customer can have
    public void setMoney(int wallet) throws Exception{
		if(wallet<0)
			throw new Exception("Money must not be negative");
		this.wallet=wallet;
	}
	
    //Added remaining/leftover coins from purchasing an item; back to wallet
    public void refundAdd(float amnt) {
    	wallet += amnt;
    }
    
	//remove amount spent purchasing an item from customer's wallet w/ cash 
    public void itemBought(float amnt) {
    	wallet -= amnt;
    }
    
    // view how much the customer has in current wallet
    public int viewWallet() {
	   return wallet;
    }
    
    public void slectOption(String product) {
    	
    }
    
    public boolean subtractMoney(int change) {
    	if(change<=wallet){
    		wallet-=change;
			return true;
		}
		else
			return false;
    }
    
    
    
   
}//end of customer class
