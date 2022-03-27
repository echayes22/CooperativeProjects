package application;

import java.util.ArrayList;

public class Product {
	//Variables used to configure product for the vending machine
	
    String name;              // Name of the product
    String manufacturer;      // Company who made the product
    double price;              // Cost of the product
    String expDate;   // Expiration date of product; takes parameters (YY, MM, DD)
    String type;              // Determines if product is a cold product or dry product  
    int maxTemp;
    int minTemp;
	ArrayList <Product> productLoad = new ArrayList<>();

    
    
    //Constructors for 2 types of product: dry and refrigerated 
    //dry product
    public Product(String name, double price, String manufacturer, String expDate, String type) {
    	this.name = name;
    	this.price = price;
    	this.manufacturer = manufacturer;
    	this.expDate = expDate;
    	this.type = type;      // Could use if statement ex.(if type = "refrigerated " or "dry")
    }
    
    // if the product is a refrigerated  product, additional parameters added in case of max/min temperature
    public Product(String name, double price, String manufacturer, String expDate, String type, int maxTemp, int minTemp) {
    	this.name = name;
    	this.price = price;
    	this.manufacturer = manufacturer;
    	this.expDate = expDate;
    	this.type = type;      
    	this.maxTemp = maxTemp;
    	this.minTemp = minTemp;
    }
    
 
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getExpDate() {
		return this.expDate;
	}
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public String getType() {
		return this.type;
	}
	
	public double getMaxTemp() {
		return this.maxTemp;
	}
	
	public double getMinTemp() {
		return this.minTemp;
	}
	
	public void setName(String name){
		if(name==null)
			System.out.println("Name must not be null");
		this.name = name;
	}
	
	public void setPrice(float price) {
		this.price =price;
	}
	
	public void setExpDate(String expDate){
		this.expDate = expDate;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setType(String type) {
		this.type= type;
	}
	
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

}
