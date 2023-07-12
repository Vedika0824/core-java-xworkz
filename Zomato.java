class Zomato{
	
	public static double search(String foodName){

      if("pizza"==foodName){
	  System.out.println("searched food name is "+ foodName);
      return 99.0 ;	
	   }
	 
	   return 0.0;
}

public static double search(String foodName,int quantity){

      if("pizza"==foodName){
	  System.out.println("searched food name is "+ foodName +"quantity of food is"+ quantity);
      return 99.0 * quantity;	
	   }
	 
	   return 0.0;
}
}


