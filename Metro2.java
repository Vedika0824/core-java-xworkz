class Metro2{

static String stationNames[] = {null , null , null , null , null , null ,null};
static int index;

 public static boolean saveStations(String stations){
 boolean isSave = false;
 if(stations != null){
 stationNames[index] = stations;
 index++;
 isSave=true;
 
 }else{
 
 System.out.println("can not save stations as it is a null");
 
 }
return isSave;

}

    public static void getAllStations(){
    System.out.println("Invoking getAllStations  ");
	
   for(int stations=0;stations<stationNames.length;stations++){
   String reference = stationNames[stations];
   System.out.println("Accessing stations "+ reference + "  at " + stations );
  }

   System.out.println("end of getAllStations");
}

   public static boolean updateStationName(String existingStationName , String updateStationName){
   boolean isUpdated=false;
   for(int stationIndex=0; stationIndex < stationNames.length; stationIndex++){
   if(stationNames[stationIndex].equals(existingStationName)){
   stationNames[stationIndex] = updateStationName;
   isUpdated= true;
		  }
	  }
	  return isUpdated;
  }

  public static int deleteStationName(String  deleteStationName){
	  System.out.println("Invoking  deleteStationName");
	  System.out.println("No of parameter :1 , type of parameter : String ");
	  boolean isDeleted =false;
	  int stationIndex;
	  int noOfElements=stationNames.length;
	  for(stationIndex =0; stationIndex < stationNames.length; stationIndex++){
		  if(stationNames[stationIndex].equals(deleteStationName)){
			 break;
		  }

	  }
	  
	  if(stationIndex < noOfElements){
	  noOfElements = noOfElements-1;
      for( int newStationIndex = stationIndex ; newStationIndex < noOfElements ; newStationIndex++){
	  stationNames[newStationIndex] = stationNames[newStationIndex+1];
		
   }
	  }
	  
	  return noOfElements;
  }
      public static void getAllStationNamesPostDeletion(int newLength){
	  for(int stationIndex =0;stationIndex < newLength ; stationIndex++){
	  System.out.println(stationNames[stationIndex]);
		   
	   }
   }
    public static void searchStationNameByName(String stationName){
	System.out.println("invoking searchStationNameByName ");
	System.out.println("No of parameter :1 , type of parameter : String ");
	String sName=null;
	
	
  for(String name: stationNames){
	  if(name.equals(name)){
		  sName=name;
		  System.out.println("station name found");
	  }
  }
  return sName;
}
}