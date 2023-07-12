class MetrooTester{
public static void main(String stop[]){
	
       Metroo.createStation("Rajajinagar");
	   Metroo.createStation("Vijaynagar");
	   Metroo.createStation("Majestic");
	   Metroo.createStation("Mala Lakshmi layout");
	   Metroo.createStation("MG road");
	   Metroo.createStation("Yeshwantpur");
	   Metroo.createStation("AttiGuppe");
	   Metroo.createStation("Magdi road");
	   Metroo.getAllStationsAvailable();
	   
       boolean isUpdated =  Metroo.updateStationName("Magdi road", "HSR layout");
	   System.out.println("Is Station name updated " +isUpdated );
	   Metroo.getAllStationsAvailable();
}
}