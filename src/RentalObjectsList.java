
public class RentalObjectsList{

	public ListObject getRentalObject(String rentObjectID, String rentObjectName, String rentObjectSubId)
	{
		
		if(rentObjectID==null)
			return null;
		else if(rentObjectID.toLowerCase().equals("ps4")){
			return new Ps4(rentObjectName,rentObjectSubId);	
		}
		else if(rentObjectID.toLowerCase().equals("movie")){
			return new Movie(rentObjectName,rentObjectSubId);	
		}
		else if(rentObjectID.toLowerCase().equals("videogame")){
			return new Videogames(rentObjectName,rentObjectSubId);	
		}
		else if(rentObjectID.toLowerCase().equals("musiccd")){
			return new Musiccd(rentObjectName,rentObjectSubId);	
		}
		else if(rentObjectID.toLowerCase().equals("xbox")){
			return new Xbox(rentObjectName,rentObjectSubId);	
		}
		else if(rentObjectID.toLowerCase().equals("book")){
			return new Book(rentObjectName,rentObjectSubId);	
		}
		else
			return null;
		
			
		
	}
}