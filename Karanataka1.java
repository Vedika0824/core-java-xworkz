class Karanataka1{

static String cityNames[]={"null","null","null","null","null","null","null","null"};

static int index;

public static boolean addCityName(String cityName){
	boolean isAdded=false;
	
	if(addCityName.length >index ){
		
	if(cityName !=null){
		
		cityName[index]=cityNames;
		index++;
      isAdded=true;
 System.out.println("city added"+isAdded);
	}else{
		System.out.println("city named cannot be null");	 
	}
	else{
		System.out.println("Size is full, cannot add city anymore");
	}
	return isAdded;
}
public static void getAllCityNames(){
	System.out.println("Invoking getAllCityNames");
	System.out.println("List of all cities :");
	for(String cityName:cityNames){
		System.out.println(cityName);
	}
		System.out.println("End of getAllCityNames");
	
	
}
}