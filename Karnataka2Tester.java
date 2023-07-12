class Karnataka2Tester{
	public static void main(String args[]){
	Karnataka2.addCity("Chikmagalur");
	Karnataka2.addCity("Mysore");
	Karnataka2.addCity("Bangalore");
	Karnataka2.addCity("Udupi");
	Karnataka2.addCity("Mandya");
	Karnataka2.addCity("Mangalore");
	Karnataka2.addCity("Bidar");
	Karnataka2.addCity("Shimoga");
	Karnataka2.addCity("Hassan");
	Karnataka2.addCity("Davanagere");
	Karnataka2.addCity("Madikere");

	Karnataka2.getAllCityAvailable();
	Karnataka2.updateCityName("Bangalore", "Bengaluru");
	
		Karnataka2.getAllCityAvailable();
		
		int newLength =	Karnataka2.deleleCityName("Bidar");
			System.out.println("Calling getAllCityNamePostDeletion");
			Karnataka2.getAllCityNamePostDeletion(newLength);
			

	
	}

}