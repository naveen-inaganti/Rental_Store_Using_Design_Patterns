
public class StrategyForBuyVideogamesObject implements StrategyForObjectsBuy{

	@Override
	public double getBuyAmount() {
		
		return 9.5;
		
	}
	
	@Override
	public double getFRPointsBuy(String buyObjectSubId) {
		
		if(buyObjectSubId.equals(ListObject.CHILDRENS))
		{
			return 9.5*2;
		}
		else if(buyObjectSubId.equals(ListObject.REGULAR)) {
			return 9.5*1;
		}
		else {  
			return 9.5*1.5;
		}
	}
}
