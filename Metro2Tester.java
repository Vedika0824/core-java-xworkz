class Metro2Tester{
	
 public static void main(String stations[]){
 Metro2.saveStations("Nagasandra");
 Metro2.saveStations("Dasarahalli");
 Metro2.saveStations("Yashwanthpur");
 Metro2.saveStations("Peenya");
 Metro2.saveStations("SandleSoap Factory");
 Metro2.saveStations("Mahalakshmipuram");
 Metro2.saveStations("Rajajinagar");
 
 Metro2.getAllStations();
 boolean isUpdated = Metro2.updateStationName("Peenya","Peenya industry");
   System.out.println("Is station name updated "+ isUpdated);
   Metro2.getAllStations();
   
   
   int newLength = Metro2.deleteStationName("Dasarahalli");
   System.out.println("Calling getAllStationNamesPostDeletion");
   Metro2.getAllStationNamesPostDeletion(newLength);
   
   
   String sName=Metro2.searchStationNameByName("Rajajinagar");
   System.out.println("Calling searchStationNameByName:"+ sName);
   Metro2.searchStationNameByName();
   }
}