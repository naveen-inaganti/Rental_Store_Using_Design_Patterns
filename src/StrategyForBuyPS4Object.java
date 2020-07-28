
public class StrategyForBuyPS4Object implements StrategyForObjectsBuy{

	@Override
	public double getBuyAmount() {
		
		return 8.0;
		
	}
	
	@Override
	public double getFRPointsBuy(String buyObjectSubId) {
		
		if(buyObjectSubId.equals(ListObject.CHILDRENS))
		{
			return 8.0*2;
		}
		else if(buyObjectSubId.equals(ListObject.REGULAR)) {
			return 8.0*1;
		}
		else {  
			return 8.0*1.5;
		}
	}
	
	
}
