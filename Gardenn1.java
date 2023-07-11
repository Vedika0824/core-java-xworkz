class Gardenn1{

static String flowersPresent[]={null,null,null,null,null,null};
static int index;

//create Method
public static boolean addFlower(String flower){


//create or add operation
boolean isAdded=false;
if(flower !=null){
	
	flowersPresent[index]=flower;
	index++;
	isAdded=true;	
	
	
}else{
	System.out.println("Cannot add flowers,as it indicates null value");	
}
return isAdded;
}
public static void getAllFlowersAvailable(){
	System.out.println("Invoking getAllFlowersAvailable");
	
	for(int flower=0;flower<flowersPresent.length;flower++){
		String reference=flowersPresent[flower];
	System.out.println("Asscessing flower " + reference +"is at " + flower);
	}
	}
		
	
	public static boolean updateFlowerName(String existingFlowerName , String updatedFlowerName){
		boolean isUpdated = false;
		for(int flowersIndex=0; flowersIndex < flowersPresent.length; flowersIndex++){
			if(flowersPresent[flowersIndex].equals(existingFlowerName)){
				flowersPresent[flowersIndex] = updatedFlowerName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	public static int deleteFlowerName(String deletedFlowerName){
		System.out.println("Invoking updateFlowerName");
		System.out.println("No of parameter : 3 , type of parameter : String , String");
		boolean isDeleted = false;
		int flowersIndex;
	    int noOfElements = flowersPresent.length;
		for(flowersIndex=0; flowersIndex < flowersPresent.length; flowersIndex++){
	    if(flowersPresent[flowersIndex].equals(deletedFlowerName)){
	    break;
				
		}
		
	}
	if(flowersIndex<noOfElements){
		noOfElements = noOfElements -1;
		for(int newFlowerIndex= flowersIndex; newFlowerIndex<noOfElements;newFlowerIndex++){
			flowersPresent[newFlowerIndex]=flowersPresent[newFlowerIndex+1];
		}
	}
	return noOfElements;
	}
	
	public static void getAllFlowerNamePostDeletion(int newLength){
		for(int flowersIndex= 0; flowersIndex<newLength ; flowersIndex++){
			System.out.println(flowersPresent[flowersIndex]);
		}
	}

}
