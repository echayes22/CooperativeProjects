package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class TechnicianController implements Initializable 
{
	//FXML variables

	@FXML  
    private Button refrigeratedVM;
	@FXML
    private Button dryVM;
	@FXML
    private Button submit2;
	@FXML
    private Button clearText1;
	@FXML
	private Button clearText2;
	@FXML
    private Button add1;
	@FXML
    private Button remove1;
	@FXML
    private Button add2;
	@FXML
    private Button remove2;
	@FXML
    private Button setTemperature;
	@FXML
    private Button print;
	@FXML
    private Button editLocation;
	@FXML
	private TextField address;
	@FXML
	private TextField building;
	@FXML
	private TextField city;
	@FXML
	private TextField company;
	@FXML
	private TextField state;
	@FXML
	private TextField quantity1;
	@FXML
	private TextField quantity2;
	@FXML
	private TextField newLocation;
	@FXML
    private Spinner<Integer> spinner;
	@FXML
    private ChoiceBox <Integer> ChoiceBox1;
	@FXML
    private ChoiceBox <String> ChoiceBox2;
	@FXML
    private ChoiceBox <String> ChoiceBox3;
	@FXML
    private Label ID_Label;
	@FXML
    private Label showAddress;
	@FXML
    private Label dollarStock;
	@FXML
    private Label quarterStock;
	@FXML
    private Label nickelStock;
	@FXML
    private Label dimeStock;
	@FXML
    private Label cokeStock;
	@FXML
	private Label doritosStock;
	@FXML
	private Label drPepperStock;
	@FXML
	private Label fantaStock;
	@FXML
	private Label mmsStock;
	@FXML
	private Label mountainDewStock;
	@FXML
	private Label payDayStock;
	@FXML
	private Label pepsiStock;
	@FXML
	private Label redBullStock;
	@FXML
    private Label reignEnergyStock;
	@FXML
    private Label skittlesStock;
    @FXML
    private Label sourGummyStock;
    @FXML
    private Label spriteStock;
    @FXML
    private Label starbucksStock;
    @FXML
    private Label sunChipsStock;
    @FXML
    private Label takisStock;
    @FXML
    private Label twixStock;
    @FXML
    private Label twixStock2;
    @FXML
    private Label vmID;
    @FXML
    private Label vmType;
    
    // declaring variable for back button
    private Stage stage;
	private Scene scene;
	private Parent root;
	
	int id = 1;
	
	//intializes arraylists for VM and Product objects
	ArrayList <VendingMachine> aList = new ArrayList<VendingMachine>();
	ArrayList <Product> productLoad = new ArrayList<>();
	
	//initializes and populates arraylist with product names
	ArrayList <String> products = new ArrayList<>();
	{
		products.add("Coke");
		products.add("Doritos");
		products.add("Dr Pepper");
		products.add("Fanta");
		products.add("M&Ms");
		products.add("Mountain Dew");
		products.add("Pay Day");
		products.add("Pepsi");
		products.add("Red Bull");
		products.add("Reign Energy");
		products.add("Skittles");
		products.add("Sour Gummy");
		products.add("Sprite");
		products.add("Starbucks");
		products.add("Sun Chips");
		products.add("Takis");
		products.add("Twix");
	}	
	
	//initializes and populates arraylist with currency types
	ArrayList <String> money = new ArrayList<>();
	{
		money.add("Dollar Bills");
		money.add("Quarters");
		money.add("Nickels");
		money.add("Dimes");
	}
	
	//clears all textfields relating to address upon button press
	@FXML
    public void clear1Pressed(ActionEvent event) 
    {
    	address.clear();
    	building.clear();
    	city.clear();
    	state.clear();
    	company.clear();
    }
	
	//Method for creating new refrigerated VM object upon button press, sets text of all labels to initial value(zero)
    @FXML
    public void refrigeratedPressed(ActionEvent event) 
    {
    	ID_Label.setText(String.valueOf(id));
    	String Location = address.getText() + ", " + city.getText() + ", " + state.getText() + "\n" + company.getText() + ", " + building.getText();    	
    	VendingMachine VendinMachine2 = new VendingMachine(Location, "refrigerated", " ", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, productLoad);

    	aList.add(VendinMachine2);
		ChoiceBox1.getItems().add(id);
		showAddress.setText(aList.get(id -1).getLocation());
    	dollarStock.setText(String.valueOf(aList.get(id-1).getDollarBillCount()));
    	quarterStock.setText(String.valueOf(aList.get(id-1).getQuarterCount()));
    	nickelStock.setText(String.valueOf(aList.get(id-1).getNickelCount()));
    	dimeStock.setText(String.valueOf(aList.get(id-1).getDimeCount()));
    	cokeStock.setText(String.valueOf(aList.get(id-1).getCokeCount()));
    	drPepperStock.setText(String.valueOf(aList.get(id-1).getDrPepperCount()));
    	fantaStock.setText(String.valueOf(aList.get(id-1).getFantaCount()));
    	mountainDewStock.setText(String.valueOf(aList.get(id-1).getMountainDewCount()));
    	pepsiStock.setText(String.valueOf(aList.get(id-1).getPepsiCount()));
    	redBullStock.setText(String.valueOf(aList.get(id-1).getRedBullCount()));
    	reignEnergyStock.setText(String.valueOf(aList.get(id-1).getReignEnergyCount()));
    	spriteStock.setText(String.valueOf(aList.get(id-1).getSpriteCount()));
    	starbucksStock.setText(String.valueOf(aList.get(id-1).getStarbucksCount()));
    	mmsStock.setText(String.valueOf(aList.get(id-1).getMmsCount()));
    	doritosStock.setText(String.valueOf(aList.get(id-1).getDoritosCount()));
    	payDayStock.setText(String.valueOf(aList.get(id-1).getPayDayCount()));
    	skittlesStock.setText(String.valueOf(aList.get(id-1).getSkittlesCount()));
    	sourGummyStock.setText(String.valueOf(aList.get(id-1).getSourGummyCount()));
    	sunChipsStock.setText(String.valueOf(aList.get(id-1).getSunChipsCount()));
    	takisStock.setText(String.valueOf(aList.get(id-1).getTakisCount()));
    	twixStock.setText(String.valueOf(aList.get(id-1).getTwixCount()));
    	twixStock2.setText(String.valueOf(aList.get(id-1).getTwixCount()));
    	id++;
    }
    
	//Method for creating new dry VM object upon button press, sets text of all labels to initial value(zero)
    @FXML
    public void dryPressed(ActionEvent event) 
    {
    	ID_Label.setText(String.valueOf(id));
    	String location = address.getText() + ", " + city.getText() + ", " + state.getText() + "\n" + company.getText() + ", " + building.getText();    	
    	VendingMachine VendingMachine1 = new VendingMachine(location, "dry", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, productLoad);

    	aList.add(VendingMachine1);
		ChoiceBox1.getItems().add(id);
		showAddress.setText(aList.get(id -1).getLocation());
    	dollarStock.setText(String.valueOf(aList.get(id-1).getDollarBillCount()));
    	quarterStock.setText(String.valueOf(aList.get(id-1).getQuarterCount()));
    	nickelStock.setText(String.valueOf(aList.get(id-1).getNickelCount()));
    	dimeStock.setText(String.valueOf(aList.get(id-1).getDimeCount()));
    	cokeStock.setText(String.valueOf(aList.get(id-1).getCokeCount()));
    	drPepperStock.setText(String.valueOf(aList.get(id-1).getDrPepperCount()));
    	fantaStock.setText(String.valueOf(aList.get(id-1).getFantaCount()));
    	mountainDewStock.setText(String.valueOf(aList.get(id-1).getMountainDewCount()));
    	pepsiStock.setText(String.valueOf(aList.get(id-1).getPepsiCount()));
    	redBullStock.setText(String.valueOf(aList.get(id-1).getRedBullCount()));
    	reignEnergyStock.setText(String.valueOf(aList.get(id-1).getReignEnergyCount()));
    	spriteStock.setText(String.valueOf(aList.get(id-1).getSpriteCount()));
    	starbucksStock.setText(String.valueOf(aList.get(id-1).getStarbucksCount()));
    	mmsStock.setText(String.valueOf(aList.get(id-1).getMmsCount()));
    	doritosStock.setText(String.valueOf(aList.get(id-1).getDoritosCount()));
    	payDayStock.setText(String.valueOf(aList.get(id-1).getPayDayCount()));
    	skittlesStock.setText(String.valueOf(aList.get(id-1).getSkittlesCount()));
    	sourGummyStock.setText(String.valueOf(aList.get(id-1).getSourGummyCount()));
    	sunChipsStock.setText(String.valueOf(aList.get(id-1).getSunChipsCount()));
    	takisStock.setText(String.valueOf(aList.get(id-1).getTakisCount()));
    	twixStock.setText(String.valueOf(aList.get(id-1).getTwixCount()));
    	twixStock2.setText(String.valueOf(aList.get(id-1).getTwixCount()));
    	id++;
    }

    //allows user to change location to value of textfield upon button press
    @FXML
    public void editPressed(ActionEvent event) 
    {
    	aList.get(ChoiceBox1.getValue()-1).setLocation(newLocation.getText());
		showAddress.setText(aList.get(ChoiceBox1.getValue()-1).getLocation());
    }
    
  //allows user to add any number of products to the machine's stock by choosing 
    //product's name as a value in a choicebox and entering the quantity to stock in related text field
    //upon button press, the number of products is added to the machine
    @FXML
    public void add1Pressed(ActionEvent event) 
    {
    	if (aList.get(ChoiceBox1.getValue()-1).getType().equals("dry")) 
    	{
    		if(ChoiceBox2.getValue().equals("Doritos")||ChoiceBox2.getValue().equals("Sun Chips")||ChoiceBox2.getValue().equals("Takis"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 1.75, "RT Goods & Services", "04/25/22", "dry"));
    			
    			if (ChoiceBox2.getValue().equals("Doritos"))
    			{
    				int doritos = aList.get(ChoiceBox1.getValue()-1).getDoritosCount();
    				aList.get(ChoiceBox1.getValue()-1).setDoritosCount(doritos += Integer.parseInt(quantity1.getText()));
    				doritosStock.setText(aList.get(ChoiceBox1.getValue()-1).getDoritosCount() + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Sun Chips"))
    			{
    				int sunChips = aList.get(ChoiceBox1.getValue()-1).getSunChipsCount();
    				aList.get(ChoiceBox1.getValue()-1).setSunChipsCount(sunChips += Integer.parseInt(quantity1.getText()));
    				sunChipsStock.setText(sunChips + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Takis"))
    			{
    				int takis = aList.get(ChoiceBox1.getValue()-1).getTakisCount();
    				aList.get(ChoiceBox1.getValue()-1).setTakisCount(takis += Integer.parseInt(quantity1.getText()));
    				takisStock.setText(takis + "");
    			}
    		}
    		
    		else if(ChoiceBox2.getValue().equals("Twix")||ChoiceBox2.getValue().equals("Pay Day"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 1.25, "RT Goods & Services", "04/25/22", "dry"));
    			
    			if (ChoiceBox2.getValue().equals("Twix"))
    			{
    				int twix = aList.get(ChoiceBox1.getValue()-1).getTwixCount();
    				aList.get(ChoiceBox1.getValue()-1).setTwixCount(twix += Integer.parseInt(quantity1.getText()));
    				twixStock.setText(twix + "");
    				twixStock2.setText(twix + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Pay Day"))
    			{
    				int payDay = aList.get(ChoiceBox1.getValue()-1).getPayDayCount();
    				aList.get(ChoiceBox1.getValue()-1).setPayDayCount(payDay+= Integer.parseInt(quantity1.getText()));
    				payDayStock.setText(payDay + "");
    			}
    		}
    		
    		else
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 1.00, "RT Goods & Services", "04/25/22", "dry"));
    			
    			if (ChoiceBox2.getValue().equals("Skittles"))
    			{
    				int skittles = aList.get(ChoiceBox1.getValue()-1).getSkittlesCount();
    				aList.get(ChoiceBox1.getValue()-1).setSkittlesCount(skittles += Integer.parseInt(quantity1.getText()));
					skittlesStock.setText(aList.get(ChoiceBox1.getValue()-1).getSkittlesCount() + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("M&Ms"))
    			{
    				int mms = aList.get(ChoiceBox1.getValue()-1).getMmsCount();
    				aList.get(ChoiceBox1.getValue()-1).setMmsCount(mms += Integer.parseInt(quantity1.getText()));
    				mmsStock.setText(mms + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Sour Gummy"))
    			{
    				int sourGummy = aList.get(ChoiceBox1.getValue()-1).getSourGummyCount();
    				aList.get(ChoiceBox1.getValue()-1).setSourGummyCount(sourGummy += Integer.parseInt(quantity1.getText()));
    				sourGummyStock.setText(sourGummy + "");
    			}
    		}
    	}
    	
    	else
    	{
    		if(ChoiceBox2.getValue().equals("Coke")||ChoiceBox2.getValue().equals("Sprite")||ChoiceBox2.getValue().equals("Fanta"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 1.50, "RT Goods & Services", "04/25/22", "refrigerated", 45, 55));
    			
    			if (ChoiceBox2.getValue().equals("Coke"))
    			{
    				int coke = aList.get(ChoiceBox1.getValue()-1).getCokeCount();
    				aList.get(ChoiceBox1.getValue()-1).setCokeCount(coke += Integer.parseInt(quantity1.getText()));
    				cokeStock.setText(coke + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Sprite"))
    			{
    				int sprite = aList.get(ChoiceBox1.getValue()-1).getSpriteCount();
    				aList.get(ChoiceBox1.getValue()-1).setSpriteCount(sprite += Integer.parseInt(quantity1.getText()));
    				spriteStock.setText(sprite + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Fanta"))
    			{
    				int fanta = aList.get(ChoiceBox1.getValue()-1).getFantaCount();
    				aList.get(ChoiceBox1.getValue()-1).setFantaCount(fanta += Integer.parseInt(quantity1.getText()));
    				fantaStock.setText(fanta + "");
    			}
    		}
    		
    		else if(ChoiceBox2.getValue().equals("Starbucks")||ChoiceBox2.getValue().equals("Dr Pepper")||ChoiceBox2.getValue().equals("Pepsi"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 1.25, "RT Goods & Services", "04/25/22", "refrigerated", 45, 55));
    			
    			if (ChoiceBox2.getValue().equals("Starbucks"))
    			{
    				int starbucks = aList.get(ChoiceBox1.getValue()-1).getStarbucksCount();
    				aList.get(ChoiceBox1.getValue()-1).setStarbucksCount(starbucks += Integer.parseInt(quantity1.getText()));
    				starbucksStock.setText(starbucks + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Dr Pepper"))
    			{
    				int drPepper = aList.get(ChoiceBox1.getValue()-1).getDrPepperCount();
    				aList.get(ChoiceBox1.getValue()-1).setDrPepperCount(drPepper += Integer.parseInt(quantity1.getText()));
    				drPepperStock.setText(drPepper + "");
    			}
    			
    			else if (ChoiceBox2.getValue().equals("Pepsi"))
    			{
    				int pepsi = aList.get(ChoiceBox1.getValue()-1).getPepsiCount();
    				aList.get(ChoiceBox1.getValue()-1).setPepsiCount(pepsi += Integer.parseInt(quantity1.getText()));
    				pepsiStock.setText(pepsi + "");
    			}
    		}
    		
    		else if(ChoiceBox2.getValue().equals("Mountain Dew"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 2.25, "RT Goods & Services", "04/25/22", "refrigerated", 45, 55));
    			int mountainDew = aList.get(ChoiceBox1.getValue()-1).getMountainDewCount();
    			aList.get(ChoiceBox1.getValue()-1).setMountainDewCount(mountainDew += Integer.parseInt(quantity1.getText()));
    			mountainDewStock.setText(mountainDew + "");
    		}
    		
    		else if(ChoiceBox2.getValue().equals("Red Bull"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 2.50, "RT Goods & Services", "04/25/22", "refrigerated", 45, 55));
    			int redBull = aList.get(ChoiceBox1.getValue()-1).getRedBullCount();
    			aList.get(ChoiceBox1.getValue()-1).setRedBullCount(redBull += Integer.parseInt(quantity1.getText()));
    			redBullStock.setText(redBull + "");
    		}
    		
    		else if(ChoiceBox2.getValue().equals("Reign Energy"))
    		{
    			productLoad.add(new Product(ChoiceBox2.getValue(), 2.00, "RT Goods & Services", "04/25/22", "refrigerated", 45, 55));
    			int reignEnergy = aList.get(ChoiceBox1.getValue()-1).getReignEnergyCount();
    			aList.get(ChoiceBox1.getValue()-1).setReignEnergyCount(reignEnergy += Integer.parseInt(quantity1.getText()));
    			reignEnergyStock.setText(reignEnergy + "");
    		}
    	}
    }
    
    //allows user to remove any number of products from the machine's stock by choosing 
    //product's name as a value in a choicebox and entering the quantity to remove in related text field
    //upon button press, the number of products is removed from the machine
    @FXML
    public void remove1Pressed(ActionEvent event) 
    {
    	for (int i = 0; i < productLoad.size(); i++)
    	{
    		if (productLoad.get(i).getName().equals(ChoiceBox2.getValue()))
    		{
    			productLoad.remove(productLoad.get(i));
        		break;
    		}
    	}
    	
    	if (aList.get(ChoiceBox1.getValue()-1).getType().equals("dry")) 
    	{
    		if (ChoiceBox2.getValue().equals("Sun Chips"))
	    	{
    			int sunChips = aList.get(ChoiceBox1.getValue()-1).getSunChipsCount();
	    		aList.get(ChoiceBox1.getValue()-1).setSunChipsCount(sunChips -= Integer.parseInt(quantity1.getText()));
	    		sunChipsStock.setText(sunChips + "");		
	    	}
	    			
	    	else if (ChoiceBox2.getValue().equals("Takis"))
	    	{
	    		int takis = aList.get(ChoiceBox1.getValue()-1).getTakisCount();
	    		aList.get(ChoiceBox1.getValue()-1).setTakisCount(takis -= Integer.parseInt(quantity1.getText()));
	    		takisStock.setText(takis + "");
	    	}
	    			
	    	else if (ChoiceBox2.getValue().equals("Twix"))
	    	{
	    		int twix = aList.get(ChoiceBox1.getValue()-1).getTwixCount();
	    		aList.get(ChoiceBox1.getValue()-1).setTwixCount(twix -= Integer.parseInt(quantity1.getText()));
	    		twixStock.setText(twix + "");
	    		twixStock2.setText(twix + "");
	    	}
	    	
			else if (ChoiceBox2.getValue().equals("Sour Gummy"))
			{
				int sourGummy = aList.get(ChoiceBox1.getValue()-1).getSourGummyCount();
				aList.get(ChoiceBox1.getValue()-1).setSourGummyCount(sourGummy -= Integer.parseInt(quantity1.getText()));
				sourGummyStock.setText(sourGummy + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Skittles"))
			{
				int skittles = aList.get(ChoiceBox1.getValue()-1).getSkittlesCount();
				aList.get(ChoiceBox1.getValue()-1).setSkittlesCount(skittles -= Integer.parseInt(quantity1.getText()));
				skittlesStock.setText(skittles + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Pay Day"))
			{
				int payDay = aList.get(ChoiceBox1.getValue()-1).getPayDayCount();
				aList.get(ChoiceBox1.getValue()-1).setPayDayCount(payDay -= Integer.parseInt(quantity1.getText()));
				payDayStock.setText(payDay + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Doritos"))
			{
				int doritos = aList.get(ChoiceBox1.getValue()-1).getDoritosCount();
				aList.get(ChoiceBox1.getValue()-1).setDoritosCount(doritos -= Integer.parseInt(quantity1.getText()));
				doritosStock.setText(doritos + "");
			}
			
			else if (ChoiceBox2.getValue().equals("M&Ms"))
			{
				int mms = aList.get(ChoiceBox1.getValue()-1).getMmsCount();
				aList.get(ChoiceBox1.getValue()-1).setMmsCount(mms -= Integer.parseInt(quantity1.getText()));
				mmsStock.setText(mms + "");
			}
    	}
    			
		else
		{
			if (ChoiceBox2.getValue().equals("Coke"))
			{
				int coke = aList.get(ChoiceBox1.getValue()-1).getCokeCount();
				aList.get(ChoiceBox1.getValue()-1).setCokeCount(coke -= Integer.parseInt(quantity1.getText()));
				cokeStock.setText(coke + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Dr Pepper"))
			{
				int drPepper = aList.get(ChoiceBox1.getValue()-1).getDrPepperCount();
				aList.get(ChoiceBox1.getValue()-1).setDrPepperCount(drPepper -= Integer.parseInt(quantity1.getText()));
				drPepperStock.setText(drPepper + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Fanta"))
			{
				int fanta = aList.get(ChoiceBox1.getValue()-1).getFantaCount();
				aList.get(ChoiceBox1.getValue()-1).setFantaCount(fanta -= Integer.parseInt(quantity1.getText()));
				fantaStock.setText(fanta + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Mountain Dew"))
			{
				int mountainDew = aList.get(ChoiceBox1.getValue()-1).getMountainDewCount();
				aList.get(ChoiceBox1.getValue()-1).setMountainDewCount(mountainDew -= Integer.parseInt(quantity1.getText()));
				mountainDewStock.setText(mountainDew + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Pepsi"))
			{
				int pepsi = aList.get(ChoiceBox1.getValue()-1).getPepsiCount();
				aList.get(ChoiceBox1.getValue()-1).setPepsiCount(pepsi -= Integer.parseInt(quantity1.getText()));
				pepsiStock.setText(pepsi + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Red Bull"))
			{
				int redBull = aList.get(ChoiceBox1.getValue()-1).getRedBullCount();
				aList.get(ChoiceBox1.getValue()-1).setRedBullCount(redBull -= Integer.parseInt(quantity1.getText()));
				redBullStock.setText(redBull + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Reign Energy"))
			{
				int reignEnergy = aList.get(ChoiceBox1.getValue()-1).getReignEnergyCount();
				aList.get(ChoiceBox1.getValue()-1).setReignEnergyCount(reignEnergy -= Integer.parseInt(quantity1.getText()));
				reignEnergyStock.setText(reignEnergy + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Sprite"))
			{
				int sprite = aList.get(ChoiceBox1.getValue()-1).getSpriteCount();
				aList.get(ChoiceBox1.getValue()-1).setSpriteCount(sprite -= Integer.parseInt(quantity1.getText()));
				spriteStock.setText(sprite + "");
			}
			
			else if (ChoiceBox2.getValue().equals("Starbucks"))
			{
				int starbucks = aList.get(ChoiceBox1.getValue()-1).getStarbucksCount();
				aList.get(ChoiceBox1.getValue()-1).setStarbucksCount(starbucks -= Integer.parseInt(quantity1.getText()));
				starbucksStock.setText(starbucks + "");
			}
		}
    }
    
    //allows user to add any number of dollar bills, quarters, nickels, and/or dimes to the machine's stock 
    //by choosing currency type as a value in a choicebox and entering the quantity to stock in related text field
    //upon button press, the number of said currency type is added to the machine
    @FXML
    public void add2Pressed(ActionEvent event) 
    {
    	if (ChoiceBox3.getValue().equals("Dollar Bills"))
    	{
	        int dollar = aList.get(ChoiceBox1.getValue()-1).getDollarBillCount();
	    	aList.get(ChoiceBox1.getValue()-1).setDollarBillCount(dollar += Integer.parseInt(quantity2.getText()));
	    	dollarStock.setText(dollar + "");
    	}
    	
    	else if (ChoiceBox3.getValue().equals("Quarters"))
    	{
	        int quarter = aList.get(ChoiceBox1.getValue()-1).getQuarterCount();
	    	aList.get(ChoiceBox1.getValue()-1).setQuarterCount(quarter += Integer.parseInt(quantity2.getText()));
	    	quarterStock.setText(quarter + "");
    	}
    	
    	else if (ChoiceBox3.getValue().equals("Nickels"))
    	{
	        int nickel = aList.get(ChoiceBox1.getValue()-1).getNickelCount();
	    	aList.get(ChoiceBox1.getValue()-1).setNickelCount(nickel += Integer.parseInt(quantity2.getText()));
	    	nickelStock.setText(nickel + "");
    	} 
    	
    	else
    	{
    		int dime = aList.get(ChoiceBox1.getValue()-1).getDimeCount();
        	aList.get(ChoiceBox1.getValue()-1).setDimeCount(dime += Integer.parseInt(quantity2.getText()));
        	dimeStock.setText(dime + "");
    	}
    }
    
    //allows user to remove any number of dollar bills, quarters, nickels, and/or dimes from the machine's stock by choosing 
    //the currency type as a value in a choicebox and entering the quantity to remove 
    @FXML
    public void remove2Pressed(ActionEvent event) 
    {
    	if (ChoiceBox3.getValue() == "Dollar Bills")
    	{
	        int dollar = aList.get(ChoiceBox1.getValue()-1).getDollarBillCount();
	    	aList.get(ChoiceBox1.getValue()-1).setDollarBillCount(dollar -= Integer.parseInt(quantity2.getText()));
	    	dollarStock.setText(dollar + "");
    	}
    	
    	
    	if (ChoiceBox3.getValue() == "Quarters")
    	{
	        int quarter = aList.get(ChoiceBox1.getValue()-1).getQuarterCount();
	    	aList.get(ChoiceBox1.getValue()-1).setQuarterCount(quarter -= Integer.parseInt(quantity2.getText()));
	    	quarterStock.setText(quarter + "");
    	}
    	
    	if (ChoiceBox3.getValue() == "Nickels")
    	{
	        int nickel = aList.get(ChoiceBox1.getValue()-1).getNickelCount();
	    	aList.get(ChoiceBox1.getValue()-1).setNickelCount(nickel -= Integer.parseInt(quantity2.getText()));
	    	nickelStock.setText(nickel + "");
    	} 
    	
    	if(ChoiceBox3.getValue() == "Dimes")
    	{
    		int dime = aList.get(ChoiceBox1.getValue()-1).getDimeCount();
        	aList.get(ChoiceBox1.getValue()-1).setDimeCount(dime -= Integer.parseInt(quantity2.getText()));
        	dimeStock.setText(dime + "");
    	}
    }
    
    @FXML
    public void setPressed(ActionEvent event) 
    {
    	aList.get(ChoiceBox1.getValue()-1).setTemperature(spinner.getValue().toString());
    }
	
	public void showAddress(ActionEvent event)
	{
		int CurrentMachine = ChoiceBox1.getValue();
		showAddress.setText(aList.get(CurrentMachine -1).getLocation());
		dollarStock.setText(String.valueOf(aList.get(CurrentMachine-1).getDollarBillCount()));
    	quarterStock.setText(String.valueOf(aList.get(CurrentMachine-1).getQuarterCount()));
    	nickelStock.setText(String.valueOf(aList.get(CurrentMachine-1).getNickelCount()));
    	dimeStock.setText(String.valueOf(aList.get(CurrentMachine-1).getDimeCount()));
    	cokeStock.setText(String.valueOf(aList.get(CurrentMachine-1).getCokeCount()));
    	drPepperStock.setText(String.valueOf(aList.get(CurrentMachine-1).getDrPepperCount()));
    	fantaStock.setText(String.valueOf(aList.get(CurrentMachine-1).getFantaCount()));
    	mountainDewStock.setText(String.valueOf(aList.get(CurrentMachine-1).getMountainDewCount()));
    	pepsiStock.setText(String.valueOf(aList.get(CurrentMachine-1).getPepsiCount()));
    	redBullStock.setText(String.valueOf(aList.get(CurrentMachine-1).getRedBullCount()));
    	reignEnergyStock.setText(String.valueOf(aList.get(CurrentMachine-1).getReignEnergyCount()));
    	spriteStock.setText(String.valueOf(aList.get(CurrentMachine-1).getSpriteCount()));
    	starbucksStock.setText(String.valueOf(aList.get(CurrentMachine-1).getStarbucksCount()));
    	mmsStock.setText(String.valueOf(aList.get(CurrentMachine-1).getMmsCount()));
    	doritosStock.setText(String.valueOf(aList.get(CurrentMachine-1).getDoritosCount()));
    	payDayStock.setText(String.valueOf(aList.get(CurrentMachine-1).getPayDayCount()));
    	skittlesStock.setText(String.valueOf(aList.get(CurrentMachine-1).getSkittlesCount()));
    	sourGummyStock.setText(String.valueOf(aList.get(CurrentMachine-1).getSourGummyCount()));
    	sunChipsStock.setText(String.valueOf(aList.get(CurrentMachine-1).getSunChipsCount()));
    	takisStock.setText(String.valueOf(aList.get(CurrentMachine-1).getTakisCount()));
    	twixStock.setText(String.valueOf(aList.get(CurrentMachine-1).getTwixCount()));
    	vmID.setText(CurrentMachine + "");
    	vmType.setText(aList.get(CurrentMachine -1).getType());
    	
	}
	
	// switches to Home screen
		public void switchToHomeScene(ActionEvent event) throws IOException {
			root= FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
		}
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
		{
			SpinnerValueFactory <Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(45, 55, 50);
			this.spinner.setValueFactory(valueFactory);
			ChoiceBox2.getItems().addAll(products);
			ChoiceBox3.getItems().addAll(money);
		}
}