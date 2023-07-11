class TeleCommunicationn1{

static String simPresent[]={null,null,null,null,null};
static int index;

//create Method
public static boolean addSimCard(String sim){


//create or add operation
boolean isAdded=false;
if(sim !=null){
	
	simPresent[index]=sim;
	index++;
	isAdded=true;	
	
	
}else{
	System.out.println("Cannot add sim,as it indicates null value");	
}
return isAdded;
}
public static void getAllSimsAvailable(){
	System.out.println("Invoking getAllSimsAvailable");
	
	for(int sim=0;sim<simPresent.length;sim++){
		String reference=simPresent[sim];
	System.out.println("Asscessing sim " + reference +"is at " + sim);
	}
	}
	public static boolean updateSimName(String existingSimName , String updatedSimName){
		boolean isUpdated = false;
		for(int simIndex=0; simIndex < simPresent.length; simIndex++){
			if(simPresent[simIndex].equals(existingSimName)){
				simPresent[simIndex] = updatedSimName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	public static int deleteSimName(String deletedSimName){
		System.out.println("Invoking updateSimName");
		System.out.println("No of parameter : 3 , type of parameter : String , String");
		boolean isDeleted = false;
		int simIndex;
	    int noOfElements = simPresent.length;
		for(simIndex=0; simIndex < simPresent.length; simIndex++){
	    if(simPresent[simIndex].equals(deletedSimName)){
	    break;
				
		}
		
	}
	if(simIndex<noOfElements){
		noOfElements = noOfElements -1;
		for(int newSimIndex= simIndex; newSimIndex<noOfElements;newSimIndex++){
			simPresent[newSimIndex]=simPresent[newSimIndex+1];
		}
	}
	return noOfElements;
	}
	
	public static void getAllSimNamePostDeletion(int newLength){
		for(int simIndex= 0; simIndex<newLength ; simIndex++){
			System.out.println(simPresent[simIndex]);
		}
	}

	
}
