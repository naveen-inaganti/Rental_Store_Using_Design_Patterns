
public class StrategyForRentVideogamesObject implements StrategyForObjectsRental {
	
	
	@Override
	public double getRentAmount(int _daysRented) {
		
		return _daysRented*4.5;
				
	}
	
	@Override
	public double getFRPointsRental(int _daysRented, String rentObjectSubId) {
		
		if(rentObjectSubId.equals(ListObject.CHILDRENS))
		{
			return _daysRented*4.5*2;
		}
		else if(rentObjectSubId.equals(ListObject.REGULAR)) {
			return _daysRented*4.5*1;
		}
		else {  
			return _daysRented*4.5*1.5;
		}
	}
}
