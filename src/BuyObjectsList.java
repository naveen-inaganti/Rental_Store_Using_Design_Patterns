

public class BuyObjectsList{

	public ListObject getBuyObject(String buyObjectID, String buyObjectName, String buyObjectSubId)
	{
		
		if(buyObjectID==null)
			return null;
		else if(buyObjectID.toLowerCase().equals("ps4")){
			return new Ps4(buyObjectName,buyObjectSubId);	
		}
		else if(buyObjectID.toLowerCase().equals("movie")){
			return new Movie(buyObjectName,buyObjectSubId);	
		}
		else if(buyObjectID.toLowerCase().equals("videogame")){
			return new Videogames(buyObjectName,buyObjectSubId);	
		}
		else if(buyObjectID.toLowerCase().equals("musiccd")){
			return new Musiccd(buyObjectName,buyObjectSubId);	
		}
		else if(buyObjectID.toLowerCase().equals("xbox")){
			return new Xbox(buyObjectName,buyObjectSubId);	
		}
		else if(buyObjectID.toLowerCase().equals("book")){
			return new Book(buyObjectName,buyObjectSubId);	
		}
		else
			return null;
		
			
		
	}
}