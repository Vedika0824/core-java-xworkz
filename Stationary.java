class Stationary{

static  String stationaryItems[]={null,null,null,null,null,null,null,null};
int index=0;


public static boolean addStationaryItems(String itemName){
System.out.println("Invoking addStationaryItems");
System.out.println("No of Parameters :1,type of parameter:String");
boolean isAdded=false;

if(itemName !=null){
if(index<stationaryItems.length){
stationaryItems[index++]=itemName;
isAdded=true;

}else{
System.out.println("ItemName cannot be null");
}
}else{
	System.out.println("ohh...Elli jaaga kaali egide");

}
return isAdded;
}
public static void getAllStationaryItems(){
	System.out.println("List of stationary Items are:");
	for(String itemName:stationaryItems){
		System.out.println(itemName);
}
}

public static boolean editStationaryItemsName(String updatedItemName ,String existingItemName)
System.out.println("Invoking editStationaryItemsName");
System.out.println("No of Parameters :2,type of Parameter:String,String");
boolean isUpdated=false;
    for(int itemName=0;itemIndex<stationaryItems.length;itemIndex++){
	if(stationaryItems[itemIndex].equals(existingItemName)){
		break;
		isUpdated=true;
		
	}
}
return isUpdated;
}



public static boolean deleteStationaryItemsName(String deletedItemName)
System.out.println("Invoking deleteStationaryItemsName");
System.out.println("No of Parameters :1,type of Parameter:String,String");
boolean isDeleted=false;
int itemIndex;
for(int itemName=0;itemIndex<stationaryItems.length;itemIndex++){
  if(stationaryItems[itemIndex].equals(deletedItemName)){
	 
	break; 
  }
	
	
}
if(itemIndex<noOfElements){
	noOfElements=noOfElements-1;
	for(int newItemIndex=itemIndex;newItemNames<noOfElements;newItemIndex++){
	stationaryItems[newItemIndex]=stationaryItems[4+1];
}
	
}
System.out.println(noOfElements);
return noOfElements;
}

public static void getAllStationaryItemsPostDeletion(int  newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(stationaryItems[itemIndex]);
		
	}
}}
}





 















