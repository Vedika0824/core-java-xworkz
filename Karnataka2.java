class Karnataka2{
	static String cityNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addCity(String city){
		boolean isAdded = false;
		if(index < cityNames.length){
		if(city != null && cityNames.length>0 ){
			cityNames[index] = city;
			index++;
			isAdded = true;
			System.out.println("city added" + isAdded);
		}else{
			System.out.println("cannot add city , as it is null value");

		}
	    }
		else{
			System.out.println("size is null, cannot and city");
		}
	    
		return isAdded;
	}
	public static void getAllCityAvailable(){
		System.out.println("Invoking getAllCityAvailable");
		for(int city=0;city<cityNames.length;city++){
			String reference = cityNames[city];
		System.out.println("Accessing city "+ reference + " at " + city);
		}
		System.out.println("end of getAllCityAvailable ");
	}
	public static boolean updateCityName(String existingCityName , String updatedCityName){
		boolean isUpdated = false;
		for(int cityIndex=0; cityIndex < cityNames.length; cityIndex++){
			if(cityNames[cityIndex].equals(existingCityName)){
				cityNames[cityIndex] = updatedCityName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
		public static int deleleCityName(String deletedCityName){
		System.out.println("Invoking updateCityName");
		System.out.println("No of parameter : 3 , type of parameter : String , String");
		boolean isDeleted = false;
		int cityIndex;
	int noOfElements = cityNames.length;
		for(cityIndex=0; cityIndex < cityNames.length; cityIndex++){
			if(cityNames[cityIndex].equals(deletedCityName)){
				break;
				
		}
		
	}
	if(cityIndex<noOfElements){
		noOfElements = noOfElements -1;
		for(int newCityIndex= cityIndex; newCityIndex<noOfElements;newCityIndex++){
			cityNames[newCityIndex]=cityNames[newCityIndex+1];
		}
	}
	return noOfElements;
	}
	
	public static void getAllCityNamePostDeletion(int newLength){
		for(int cityIndex= 0; cityIndex<newLength ; cityIndex++){
			System.out.println(cityNames[cityIndex]);
		}
	}


}