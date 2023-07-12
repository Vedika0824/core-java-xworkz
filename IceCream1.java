class IceCream1{
	static String flavours[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addFlavour(String flavour){
		boolean isAdded = false;
		if(flavour != null){
			flavours[index] = flavour;
			index++;
			isAdded = true;
			
		}else {
			System.out.println("cannot add flavour , as it is a null value");
		}
		return isAdded;
	}
	public static void getAllFlavorName(){
		System.out.println("Invoking getAllFlavorName");
		for(int flavour=0; flavour< flavours.length;flavour++){
			String reference = flavours[flavour];
			System.out.println("Accessing flavour " + reference + " at" +flavour);
		}
		System.out.println("end of getAllFlavorName");
	}
	public static boolean updateFlavourName(String existingFlavourName , String updatedFlavourName){
		boolean isUpdated = false;
		for(int flavourIndex=0; flavourIndex < flavours.length; flavourIndex++){
			if(flavours[flavourIndex].equals(existingFlavourName)){
				flavours[flavourIndex] = updatedFlavourName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	public static int deleleFlavourName(String deletedFlavourName){
		System.out.println("Invoking updateFlavourName");
		System.out.println("No of parameter : 3 , type of parameter : String , String");
		boolean isDeleted = false;
		int flavourIndex;
	int noOfElements = flavours.length;
		for(flavourIndex=0; flavourIndex < flavours.length; flavourIndex++){
			if(flavours[flavourIndex].equals(deletedFlavourName)){
				break;
				
		}
		
	}
	if(flavourIndex<noOfElements){
		noOfElements = noOfElements -1;
		for(int newFlavourIndex= flavourIndex; newFlavourIndex<noOfElements;newFlavourIndex++){
			flavours[newFlavourIndex]=flavours[newFlavourIndex+1];
		}
	}
	return noOfElements;
	}
	
	public static void getAllFlavorNamePostDeletion(int newLength){
		for(int flavourIndex= 0; flavourIndex<newLength ; flavourIndex++){
			System.out.println(flavours[flavourIndex]);
		}
	}
}