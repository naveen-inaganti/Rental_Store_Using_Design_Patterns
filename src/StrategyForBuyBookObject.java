
public class StrategyForBuyBookObject implements StrategyForObjectsBuy{

	@Override
	public double getBuyAmount() {
		
		return 2.0;
		
	}
	
	@Override
	public double getFRPointsBuy(String buyObjectSubId) {
		
		if(buyObjectSubId.equals(ListObject.CHILDRENS))
		{
			return 2.0*2;
		}
		else if(buyObjectSubId.equals(ListObject.REGULAR)) {
			return 2.0*1;
		}
		else {  
			return 2.0*1.5;
		}
	}
}
