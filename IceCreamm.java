class IceCreamm{

static String flavourNames[]={null,null,null,null,null,null,null};
static int index;

//create Method
public static boolean addFlavour(String flavour){


//create or add operation
boolean isAdded=false;
if(flavour !=null){
	
	flavourNames[index]=flavour;
	index++;
	isAdded=true;	
}else{
	System.out.println("Cannot add flavours,as it indicates null value");	
}
return isAdded;
}
public static void getAllFlavoursAvailable(){
	System.out.println("Invoking getAllFlavoursAvailable");
	
	for(int flavour=0;flavour<flavourNames.length;flavour++){
		String reference=flavourNames[flavour];
	System.out.println("Asscessing flavour " + reference +"is at " + flavour);
	}
		System.out.println("End of getAllFlavoursAvailable");
	}
	public static boolean updateFlavourName(String existingFlavourName , String updatedFlavourName){
		boolean isUpdated = false;
		for(int flavoursIndex=0; flavoursIndex < flavourNames.length; flavoursIndex++){
			if(flavourNames[flavoursIndex].equals(existingFlavourName)){
				flavourNames[flavoursIndex] = updatedFlavourName;
				isUpdated = true;
			}
		}
		return isUpdated;
		
	   public static boolean deleteFlavourName(String deletedFlavourName){
       System.out.println("Invoking deleteFlavourName");
       System.out.println("No of Parameters :1,type of Parameter:String,String");
       boolean isDeleted=false;
       for(int flavourindex=0;flavourindex<flavourNames.length;flavourindex++){
       if(flavourNames[flavourindex].equals(deletedFlavourName)){
	   flavourNames[flavourindex]=null;
	   isDeleted=true; 
  }
} 
return deleted;
	}
}
