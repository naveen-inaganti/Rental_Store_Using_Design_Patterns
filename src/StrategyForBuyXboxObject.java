
public class StrategyForBuyXboxObject implements StrategyForObjectsBuy{

	@Override
	public double getBuyAmount() {
		
		return 11.5;
		
	}
	
	@Override
	public double getFRPointsBuy(String buyObjectSubId) {
		
		if(buyObjectSubId.equals(ListObject.CHILDRENS))
		{
			return 11.5*2;
		}
		else if(buyObjectSubId.equals(ListObject.REGULAR)) {
			return 11.5*1;
		}
		else {  
			return 11.5*1.5;
		}
	}
}
