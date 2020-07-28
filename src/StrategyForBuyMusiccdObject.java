public class StrategyForBuyMusiccdObject implements StrategyForObjectsBuy{

	@Override
	public double getBuyAmount() {
		
		return 6.0;
		
	}
	
	@Override
	public double getFRPointsBuy(String buyObjectSubId) {
		
		if(buyObjectSubId.equals(ListObject.CHILDRENS))
		{
			return 6.0*2;
		}
		else if(buyObjectSubId.equals(ListObject.REGULAR)) {
			return 6.0*1;
		}
		else {  
			return 6.0*1.5;
		}
	}
}
