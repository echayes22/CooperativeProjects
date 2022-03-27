package application;

import java.util.ArrayList;

public class VendingMachine {
	//initializes attributes with value
	private String location = " ";
	private String type;
	private String temperature = " ";
	private int dollarCount = 0;
	private int quarterCount = 0;
	private int dimeCount = 0;
	private int nickelCount = 0;
	int doritosCount = 0;
    int sunChipsCount = 0;
    int takisCount = 0;
    int twixCount = 0;
    int payDayCount = 0;
    int skittlesCount = 0;
    int mmsCount = 0;
    int sourGummyCount = 0;
    int cokeCount = 0;
    int spriteCount = 0;
    int fantaCount = 0;
    int starbucksCount = 0;
    int drPepperCount = 0;
    int pepsiCount = 0;
    int mountainDewCount = 0;
    int redBullCount = 0;
    int reignEnergyCount = 0;
	
    //refrigerated VM object
	public VendingMachine (String location,
			   String type,
			   String temperature, 
			   int dollarCount, 
			   int quarterCount, 
			   int dimeCount, 
			   int nickelCount,
			   int cokeCount,
			   int spriteCount,
			   int fantaCount,
			   int starbucksCount,
			   int drPepperCount,
			   int pepsiCount,
			   int mountainDewCount,
			   int redBullCount,
			   int reignEnergyCount,
			   ArrayList<Product> array) 
	{
		this.location = location;
		this.type = type;
		this.temperature = temperature;
		this.dollarCount = dollarCount;
		this.quarterCount = quarterCount;
		this.dimeCount = dimeCount;
		this.nickelCount = nickelCount;
		this.cokeCount = cokeCount;
		this.spriteCount = spriteCount;
		this.fantaCount = fantaCount;
		this.starbucksCount = starbucksCount;
		this.drPepperCount = drPepperCount;
		this.pepsiCount = pepsiCount;
		this.mountainDewCount = mountainDewCount;
		this.redBullCount = redBullCount;
		this.reignEnergyCount = reignEnergyCount;
	}
	//dry VM object
	public VendingMachine (String location,
			   String type,
			   int dollarCount, 
			   int quarterCount, 
			   int dimeCount, 
			   int nickelCount,
			   int doritosCount,
			   int sunChipsCount,
			   int takisCount,
			   int twixCount,
			   int payDayCount,
    		   int skittlesCount,
    		   int mmsCount,
    		   int sourGummyCount,
    		   ArrayList<Product> array) 
	{
		this.location = location;
		this.type = type;
		this.dollarCount = dollarCount;
		this.quarterCount = quarterCount;
		this.dimeCount = dimeCount;
		this.nickelCount = nickelCount;
		this.doritosCount = doritosCount;
		this.sunChipsCount = sunChipsCount;
		this.takisCount = takisCount;
		this.twixCount = twixCount;
		this.payDayCount = payDayCount;
		this.skittlesCount = skittlesCount;
		this.mmsCount = mmsCount;
	}
	
	//getter and setter methods for VM attributes and products
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getTemperature() 
	{
		return temperature;
	}
	
	public void setTemperature(String Temp) 
	{
		this.temperature = Temp;
	}
	
	public int getDollarBillCount() 
	{
		return dollarCount;
	}
	
	public void setDollarBillCount(int dollarBillCount) 
	{
		this.dollarCount = dollarBillCount;
	}
	
	public int getQuarterCount() 
	{
		return quarterCount;
	}
	
	public void setQuarterCount(int quarterCount) 
	{
		this.quarterCount = quarterCount;
	}
	
	public int getDimeCount() 
	{
		return dimeCount;
	}
	
	public void setDimeCount(int dimeCount) 
	{
		this.dimeCount = dimeCount;
	}
	
	public int getNickelCount() 
	{
		return nickelCount;
	}
	
	public void setNickelCount(int nickelCount) 
	{
		this.nickelCount = nickelCount;
	}

	public int getCokeCount() {
		return cokeCount;
	}
	
	public void setCokeCount(int cokeCount) {
		this.cokeCount = cokeCount;
	}

	public int getDrPepperCount() {
		return drPepperCount;
	}
	
	public void setDrPepperCount(int drPepperCount) {
		this.drPepperCount = drPepperCount;
	}

	public int getFantaCount() {
		return fantaCount;
	}
	
	public void setFantaCount(int fantaCount) {
		this.fantaCount = fantaCount;
	}

	public int getMountainDewCount() {
		return mountainDewCount;
	}
	
	public void setMountainDewCount(int mountainDewCount) {
		this.mountainDewCount = mountainDewCount;
	}

	public int getPepsiCount() {
		return pepsiCount;
	}
	
	public void setPepsiCount(int pepsiCount) {
		this.pepsiCount = pepsiCount;
	}

	public int getRedBullCount() {
		return redBullCount;
	}
	
	public void setRedBullCount(int redBullCount) {
		this.redBullCount = redBullCount;
	}

	public int getReignEnergyCount() {
		return reignEnergyCount;
	}
	
	public void setReignEnergyCount(int reignEnergyCount) {
		this.reignEnergyCount = reignEnergyCount;
	}

	public int getSpriteCount() {
		return spriteCount;
	}

	public void setSpriteCount(int spriteCount) {
		this.spriteCount = spriteCount;
	}
	
	public int getStarbucksCount() {
		return starbucksCount;
	}

	public void setStarbucksCount(int starbucksCount) {
		this.starbucksCount = starbucksCount;
	}
	
	public int getMmsCount() {
		return mmsCount;
	}

	public void setMmsCount(int mmsCount) {
		this.mmsCount = mmsCount;
	}
	
	public int getDoritosCount() {
		return doritosCount;
	}
	
	public void setDoritosCount(int doritosCount) {
		this.doritosCount = doritosCount;
	}

	public int getPayDayCount() {
		return payDayCount;
	}
	
	public void setPayDayCount(int payDayCount) {
		this.payDayCount = payDayCount;
	}

	public int getSkittlesCount() {
		return skittlesCount;
	}
	
	public void setSkittlesCount(int skittlesCount) {
		this.skittlesCount = skittlesCount;
	}

	public int getSourGummyCount() {
		return sourGummyCount;
	}
	
	public void setSourGummyCount(int sourGummyCount) {
		this.sourGummyCount = sourGummyCount;
	}

	public int getSunChipsCount() {
		return sunChipsCount;
	}
	
	public void setSunChipsCount(int sunChipsCount) {
		this.sunChipsCount = sunChipsCount;
	}

	public int getTakisCount() {
		return takisCount;
	}
	
	public void setTakisCount(int takisCount) {
		this.takisCount = takisCount;
	}

	public int getTwixCount() {
		return twixCount;
	}
	
	public void setTwixCount(int twixCount) {
		this.twixCount = twixCount;
	}

}
