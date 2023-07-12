class WashingMachine1{
 static String name="samsung";
 static  int lowRotation;
 static int mediumRotation ;
 static  int highRotation=7;
 static boolean isConnected;
    
  //method
   public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter" + 0);
 
 if(isConnected==false){
isConnected=true;
System.out.println("WashingMachine1 is Turned onn...");
}

else if(isConnected==true){
isConnected=false;
System.out.println("WashingMachine1 is Turned off");
}
return isConnected;
}


//increaseRotation
public static void increaseRotation(){
	System.out.println("start of increaseDegree");
	
	if(isConnected =true){
	if (mediumRotation<highRotation){
		mediumRotation=mediumRotation+1;
		System.out.println("The medium Rotation  is"+mediumRotation);	
	}else {
		System.out.println(" high Rotation reached");
	}
	}else{
	System.out.println("hey.... WashingMachine1 on madu firstu");
}

}

//decreaseRotation
public static void decreaseRotation(){
	System.out.println("start of decreaseRotation");
if(isConnected = true){
	if (mediumRotation>lowRotation){
		mediumRotation=mediumRotation-1;
		System.out.println("The medium Degree is"+mediumRotation);
		
	}else {
		System.out.println(" low Rotation reached");
	}
	}else{
	System.out.println("WashingMachine1 turned of...degree cannot be decreased");
}

}

}