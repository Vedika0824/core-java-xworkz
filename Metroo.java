class Metroo{

static String stationNames[]={null,null,null,null,null,null,null,null};
static int index;

//create Method
public static boolean createStation(String station){


//create or add operation
boolean isAdded=false;
if(station !=null){
	
	stationNames[index]=station;
	index++;
	isAdded=true;	
}else{
	System.out.println("Cannot create stations,as it indicates null value");	
}
return isAdded;
}
public static void getAllStationsAvailable(){
	System.out.println("Invoking getAllStationsAvailable");
	
	for(int station=0;station<stationNames.length;station++){
		String reference=stationNames[station];
	System.out.println("Metro station of " + reference +"is at " + station);
	}
		System.out.println("End of getAllStationsAvailable");
	}
	
	public static boolean updateStationName(String existingStationName , String updatedStationName){
		boolean isUpdated = false;
		for(int stationIndex=0; stationIndex < stationNames.length; stationIndex++){
			if(stationNames[stationIndex].equals(existingStationName)){
				stationNames[stationIndex] = updatedStationName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	public static int deleleStationName(String deletedStationName){
		System.out.println("Invoking updateStationName");
		System.out.println("No of parameter : 3 , type of parameter : String , String");
		boolean isDeleted = false;
		int stationIndex;
	    int noOfElements = stations.length;
		for(stationIndex=0; stationIndex <stations.length; stationIndex++){
	    if(stations[stationIndex].equals(deletedStationName)){
	    break;
				
		}
		
	}
	if(stationIndex<noOfElements){
		noOfElements = noOfElements -1;
		for(int newStationIndex= stationIndex; newStationIndex<noOfElements;newStationIndex++){
			stations[newStationIndex]=stations[newStationIndex+1];
		}
	}
	return noOfElements;
	}
	
	public static void getAllStationNamePostDeletion(int newLength){
		for(int stationIndex= 0; stationIndex<newLength ; stationIndex++){
			System.out.println(stations[stationIndex]);
		}
	}
}
