class Karnatakaa{
	static String cityNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addCity(String city){
		boolean isAdded = false;
		if(index < cityNames.length){
		if(city != null && cityNames.length>0){
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


}