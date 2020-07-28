import java.util.ArrayList;

public class Customer {
    private String _name;
	private ArrayList<Rental> _rentals;
	private ArrayList<Buy> _buys;
	public String outputstring;
	public String buyOutputString;
    Double frequentRenterPoints;
	double  rentToBePaid;
	double  buyAmountToBePaid;
	Double frequentBuyPoints;
	
    public Customer (String name) {
        _name = name;
		_rentals=new ArrayList<Rental>();
		_buys=new ArrayList<Buy>();
		frequentRenterPoints=0.0;
		frequentBuyPoints=0.0;
		rentToBePaid=0.0;
		buyAmountToBePaid=0.0;
		outputstring="\n"+"Rent Details for "+_name+"\n\n";
		buyOutputString="\n"+"Buy Details for "+_name+"\n\n";
    }
    
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
    
    public String getName() {
        return _name;
    }
	
	public double getRentToBePaid(){
		return rentToBePaid;
	}
	
	public ArrayList<Rental> getRentals(){
		return _rentals;
	}
	
	public void addBuy(Buy arg) {
        _buys.add(arg);
    }
	
	public double getBuyToBePaid(){
		return buyAmountToBePaid;
	}
	
	public ArrayList<Buy> getBuys(){
		return _buys;
	}
	
	public Double calculateFrequentRenterPoints(ArrayList<Rental> _rentals){
		double frequentPoints=0;
		for(Rental each_rental:_rentals)
		{
			frequentPoints=frequentPoints+each_rental.calculateObjectRentFP();
		}
		return frequentPoints;
	}
	
	public Double calculateFrequentBuyPoints(ArrayList<Buy> _buys){
		double frequentPoints=0;
		for(Buy each_buy:_buys)
		{
			frequentPoints=frequentPoints+each_buy.calculateObjectBuyFP();
		}
		
		return frequentPoints;
	}
	
	public double calculateEachRentPrice(Rental rental){
		double amount=0;
		amount=rental.calculateObjectRentAmount();
		return amount;
	}
	
	public double calculateEachBuyPrice(Buy buy){
		double amount=0;
		amount=buy.calculateObjectBuyAmount();
		return amount;
	}
    
    
	public double totalRentAmount(ArrayList<Rental> _rentals)
	{
		double totalRentAmount=0;
		double eachRentalAmount=0;
		for(Rental each_rental: _rentals)
		{
			eachRentalAmount= calculateEachRentPrice(each_rental);
			outputstring=outputstring +each_rental.getRentObjectID().toUpperCase()+" "+each_rental.getRentObjectName()+"----->" + String.valueOf(eachRentalAmount) + "\n";
			totalRentAmount=totalRentAmount+eachRentalAmount;
		}
		return totalRentAmount;
	}
	
	
	public double totalBuyAmount(ArrayList<Buy> _buys)
	{
		double totalBuyAmount=0;
		double eachBuyAmount=0;
		for(Buy each_buy: _buys)
		{
			eachBuyAmount= calculateEachBuyPrice(each_buy);
			buyOutputString=buyOutputString + each_buy.getBuyObjectId().toUpperCase()+" "+each_buy.getBuyObjectName()+"----->" + String.valueOf(eachBuyAmount) + "\n";
			totalBuyAmount=totalBuyAmount+eachBuyAmount;
		}
		return totalBuyAmount;
	}
	
	
	public String printOutput(){
		double totalRentAmount;
		double totalBuyAmount;
		totalRentAmount=totalRentAmount(_rentals);
		totalBuyAmount=totalBuyAmount(_buys);
		rentToBePaid=totalRentAmount;
		buyAmountToBePaid=totalBuyAmount;
		frequentRenterPoints=calculateFrequentRenterPoints(_rentals);
		frequentBuyPoints=calculateFrequentBuyPoints(_buys);
		outputstring=outputstring+"\n"+"Total Amount owed for rent is " + String.valueOf(totalRentAmount) + "\n";
		outputstring =outputstring+ "You Have Earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
		buyOutputString=buyOutputString+"\n"+"Total Amount owed for buying is " + String.valueOf(totalBuyAmount) + "\n";
		buyOutputString =buyOutputString+ "You Have Earned " + String.valueOf(frequentBuyPoints) + " frequent buyer points\n";
		String printoutput = outputstring+"\n\n"+buyOutputString+"\n"+"Total Amount owed is " + String.valueOf(totalBuyAmount+totalRentAmount) + "\n"+"You Have Earned " + String.valueOf(frequentBuyPoints+frequentRenterPoints) + " frequent renter and buyer points\n";
		outputstring="\n"+"Rental Details for " + getName() + "\n";
		buyOutputString="\n"+"Buy Details for "+getName()+"\n";
		return printoutput;
	}
	
    }





















































//import java.util.Enumeration;
//import java.util.ArrayList;
//
//public class Customer {
//    private String _name;
//	private ArrayList<Rental> _rentals;
//	private ArrayList<Buy> _buys;
//	
//	public Customer(String _name) {
//		this._name = _name;
//		_rentals=new ArrayList<Rental>();
//		_buys=new ArrayList<Buy>();
//		
//	}
//	public String get_name() {
//		return _name;
//	}
//	public void set_name(String _name) {
//		this._name = _name;
//	}
//
//	
//	public void addRental(Rental arg) {
//	        _rentals.add(arg);
//	    }
//	
//	public void addBuy(Buy arg) {
//        _buys.add(arg);
//    }
//	
//	public ArrayList<Buy> getBuys(){
//		return _buys;
//	}
//	
//	public ArrayList<Rental> getRentals(){
//		return _rentals;
//	}
//	
//	
//	public double calculateEachRentPrice(Rental rental){
//		
//		double amount=0;
//		amount=rental.calculateObjectRentAmount();
//		return amount;
//	}
//	
//	public double calculateEachBuyPrice(Buy buy){
//		double amount=0;
//		amount=buy.calculateObjectBuyAmount();
//		return amount;
//	}
//    
//    
//	public double totalRentAmount(ArrayList<Rental> _rentals)
//	{
//		double totalRentAmount=0;
//		double eachRentalAmount=0;
//		for(Rental each_rental: _rentals)
//		{
//			eachRentalAmount= calculateEachRentPrice(each_rental);
//			//outputstring=outputstring + each_rental.getMovie().getTitle()+"----->" + String.valueOf(eachRentalAmount) + "\n";
//			totalRentAmount=totalRentAmount+eachRentalAmount;
//		}
//		return totalRentAmount;
//	}
//	
//	
//	public double totalBuyAmount(ArrayList<Buy> _buys)
//	{
//		double totalBuyAmount=0;
//		double eachBuyAmount=0;
//		for(Buy each_buy: _buys)
//		{
//			eachBuyAmount= calculateEachBuyPrice(each_buy);
//			//buyOutputString=buyOutputString + each_buy.getMovie().getTitle()+"----->" + String.valueOf(eachBuyAmount) + "\n";
//			totalBuyAmount=totalBuyAmount+eachBuyAmount;
//		}
//		return totalBuyAmount;
//	}
//	
//	
//	public String printOutput(){
//		double totalRentAmount;
//		double totalBuyAmount;
//		totalRentAmount=totalRentAmount(_rentals);
//		totalBuyAmount=totalBuyAmount(_buys);
////		rentToBePaid=totalRentAmount;
////		buyAmountToBePaid=totalBuyAmount;
////		frequentRenterPoints=calculateFrequentRenterPoints(_rentals);
////		frequentBuyPoints=calculateFrequentBuyPoints(_buys);
////		outputstring=outputstring+"\n"+"Total Amount owed for rent is " + String.valueOf(totalRentAmount) + "\n";
////		outputstring =outputstring+ "You Have Earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
////		buyOutputString=buyOutputString+"\n"+"Total Amount owed for buying is " + String.valueOf(totalBuyAmount) + "\n";
////		buyOutputString =buyOutputString+ "You Have Earned " + String.valueOf(frequentBuyPoints) + " frequent buyer points\n";
////		String printoutput = outputstring+"\n\n"+buyOutputString+"\n"+"Total Amount owed is " + String.valueOf(totalBuyAmount+totalRentAmount) + "\n"+"You Have Earned " + String.valueOf(frequentBuyPoints+frequentRenterPoints) + " frequent renter and buyer points\n";
////		outputstring="\n"+"Rental Details for " + getName() + "\n";
////		buyOutputString="\n"+"Buy Details for "+getName()+"\n";
//		return String.valueOf(totalRentAmount)+" naveen "+String.valueOf(totalBuyAmount);
//	}
//	
//	
//    }
