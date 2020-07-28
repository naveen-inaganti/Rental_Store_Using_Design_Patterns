
public class Buy{
	
	private ListObject object;
	private String buyObjectId;
	private String buyObjectName;
	private String buyObjectSubId;
	private StrategyForObjectsBuy strategyforobjectbuy;
	
	
	public Buy(String buyObjectId, String buyObjectName, String buyObjectSubId){
		object=new BuyObjectsList().getBuyObject(buyObjectId,buyObjectName,buyObjectSubId);
		this.buyObjectId=buyObjectId;
		this.buyObjectName=buyObjectName;
		this.buyObjectSubId=buyObjectSubId;
	}
	
	public ListObject getObject() {
		return object;
	}

	public void setObject(ListObject object) {
		this.object = object;
	}

	public String getBuyObjectId() {
		return buyObjectId;
	}

	public void setBuyObjectId(String buyObjectId) {
		this.buyObjectId = buyObjectId;
	}

	public String getBuyObjectName() {
		return buyObjectName;
	}

	public void setBuyObjectName(String buyObjectName) {
		this.buyObjectName = buyObjectName;
	}

	public String getBuyObjectSubId() {
		return buyObjectSubId;
	}

	public void setBuyObjectSubId(String butObjectSubId) {
		this.buyObjectSubId = butObjectSubId;
	}
	public StrategyForObjectsBuy getStrategyforobjectbuy() {
		return strategyforobjectbuy;
	}

	public void setStrategyforobjectbuy(StrategyForObjectsBuy strategyforobjectbuy) {
		this.strategyforobjectbuy = strategyforobjectbuy;
	}

	public double calculateObjectBuyAmount(){
		if(this.buyObjectId.toLowerCase().equals("ps4"))
			return new StrategyForBuyPS4Object().getBuyAmount();
		else if(this.buyObjectId.toLowerCase().equals("movie"))
			return new StrategyForBuyMovieObject().getBuyAmount();
		else if(this.buyObjectId.toLowerCase().equals("videogames"))
			return new StrategyForBuyVideogamesObject().getBuyAmount();
		else if(this.buyObjectId.toLowerCase().equals("xbox"))
			return new StrategyForBuyXboxObject().getBuyAmount();
		else if(this.buyObjectId.toLowerCase().equals("musiccd"))
			return new StrategyForBuyMusiccdObject().getBuyAmount();
		else
			return new StrategyForBuyBookObject().getBuyAmount();
		
	}
	
	public double calculateObjectBuyFP(){
		if(this.buyObjectId.toLowerCase().equals("ps4"))
			return new StrategyForBuyPS4Object().getFRPointsBuy(this.buyObjectSubId);
		else if(this.buyObjectId.toLowerCase().equals("movie"))
			return new StrategyForBuyMovieObject().getFRPointsBuy(this.buyObjectSubId);
		else if(this.buyObjectId.toLowerCase().equals("videogames"))
			return new StrategyForBuyVideogamesObject().getFRPointsBuy(this.buyObjectSubId);
		else if(this.buyObjectId.toLowerCase().equals("xbox"))
			return new StrategyForBuyXboxObject().getFRPointsBuy(this.buyObjectSubId);
		else if(this.buyObjectId.toLowerCase().equals("musiccd"))
			return new StrategyForBuyMusiccdObject().getFRPointsBuy(this.buyObjectSubId);
		else
			return new StrategyForBuyBookObject().getFRPointsBuy(this.buyObjectSubId);
		
	}
}