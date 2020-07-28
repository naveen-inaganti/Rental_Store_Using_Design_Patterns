public class Rental {
	
	private ListObject object;
	private String rentObjectID;
	private String rentObjectName;
	private String rentObjectSubId;
	private StrategyForObjectsRental strategyforobjectsrental;
	private int _daysRented;
	
	public Rental(int _daysRented, String rentObjectID, String rentObjectName, String rentObjectSubId) {
		object=new RentalObjectsList().getRentalObject(rentObjectID, rentObjectName, rentObjectSubId);
		this.rentObjectID = rentObjectID;
		this._daysRented = _daysRented;
		this.rentObjectName=rentObjectName;
		this.rentObjectSubId=rentObjectSubId;
	}

	public ListObject getObject() {
		return object;
	}

	public void setObject(ListObject object) {
		this.object = object;
	}

	public String getRentObjectID() {
		return rentObjectID;
	}

	public void setRentObjectID(String rentObjectID) {
		this.rentObjectID = rentObjectID;
	}

	public StrategyForObjectsRental getStrategyforobjectsrental() {
		return strategyforobjectsrental;
	}

	public void setStrategyforobjectsrental(StrategyForObjectsRental strategyforobjectsrental) {
		this.strategyforobjectsrental = strategyforobjectsrental;
	}

	public int get_daysRented() {
		return _daysRented;
	}

	public void set_daysRented(int _daysRented) {
		this._daysRented = _daysRented;
	}
	
	public String getRentObjectName() {
		return rentObjectName;
	}

	public void setRentObjectName(String rentObjectName) {
		this.rentObjectName = rentObjectName;
	}
	
	public String getRentObjectSubId() {
		return rentObjectSubId;
	}

	public void setRentObjectSubId(String rentObjectSubId) {
		this.rentObjectSubId = rentObjectSubId;
	}

public double calculateObjectRentAmount() {
		
		if(this.rentObjectID.toLowerCase().equals("ps4"))
			return new StrategyForRentPS4Object().getRentAmount(this._daysRented);
		else if(this.rentObjectID.toLowerCase().equals("movie"))
			return new StrategyForRentMovieObject().getRentAmount(this._daysRented);
		else if(this.rentObjectID.toLowerCase().equals("videogames"))
			return new StrategyForRentVideogamesObject().getRentAmount(this._daysRented);
		else if(this.rentObjectID.toLowerCase().equals("xbox"))
			return new StrategyForRentXboxObject().getRentAmount(this._daysRented);
		else if(this.rentObjectID.toLowerCase().equals("musiccd"))
			return new StrategyForRentMusiccdObject().getRentAmount(this._daysRented);
		else
			return new StrategyForRentBookObject().getRentAmount(this._daysRented);
	}

public double calculateObjectRentFP() {
	
	if(this.rentObjectID.toLowerCase().equals("ps4"))
		return new StrategyForRentPS4Object().getFRPointsRental(this._daysRented, this.rentObjectSubId);
	else if(this.rentObjectID.toLowerCase().equals("getFPRental"))
		return new StrategyForRentMovieObject().getFRPointsRental(this._daysRented,this.rentObjectSubId);
	else if(this.rentObjectID.toLowerCase().equals("videogames"))
		return new StrategyForRentVideogamesObject().getFRPointsRental(this._daysRented,this.rentObjectSubId);
	else if(this.rentObjectID.toLowerCase().equals("xbox"))
		return new StrategyForRentXboxObject().getFRPointsRental(this._daysRented,this.rentObjectSubId);
	else if(this.rentObjectID.toLowerCase().equals("musiccd"))
		return new StrategyForRentMusiccdObject().getFRPointsRental(this._daysRented,this.rentObjectSubId);
	else
		return new StrategyForRentBookObject().getFRPointsRental(this._daysRented,this.rentObjectSubId);
}
	
	

}