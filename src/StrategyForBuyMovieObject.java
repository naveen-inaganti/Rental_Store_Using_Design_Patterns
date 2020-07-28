
public class StrategyForBuyMovieObject implements StrategyForObjectsBuy{

	@Override
	public double getBuyAmount() {
		
		return 4.0;
		
	}
	
	@Override
	public double getFRPointsBuy(String buyObjectSubId) {
		
		if(buyObjectSubId.equals(ListObject.CHILDRENS))
		{
			return 4.0*2;
		}
		else if(buyObjectSubId.equals(ListObject.REGULAR)) {
			return 4.0*1;
		}
		else {  
			return 4.0*1.5;
		}
	}
}
