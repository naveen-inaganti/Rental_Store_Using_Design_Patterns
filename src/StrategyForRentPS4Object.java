
public class StrategyForRentPS4Object implements StrategyForObjectsRental {
	
	
	@Override
	public double getRentAmount(int _daysRented) {
		
		return _daysRented*4.0;
				
	}
	
	@Override
	public double getFRPointsRental(int _daysRented, String rentObjectSubId) {
		
		if(rentObjectSubId.equals(ListObject.CHILDRENS))
		{
			return _daysRented*4.0*2;
		}
		else if(rentObjectSubId.equals(ListObject.REGULAR)) {
			return _daysRented*4.0*1;
		}
		else {  
			return _daysRented*4.0*1.5;
		}
	}
}
