class Oven{

static String name ="philips";
static  int lowDegree;
static  int mediumDegree;
static  int highDegree=5;
static boolean isConnected;
//method

public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter"+0);

if(isConnected==false){
isConnected=true;
System.out.println("oven is Turned onn...");
}

else if(isConnected==true){
isConnected=false;
System.out.println("oven is Turned off");
}
return isConnected;
}


//increase Degree
public static void increaseDegree(){
	System.out.println("start of increaseDegree");
	
	if(isConnected =true){
	if (mediumDegree<highDegree){
		mediumDegree=mediumDegree+1;
		System.out.println("The medium Degree  is"+mediumDegree);	
	}else {
		System.out.println(" high Degree reached");
	}
	}else{
	System.out.println("hey.... oven on madu firstu");
}

}

//decrease Degree
public static void decreaseDegree(){
	System.out.println("start of decreaseDegree");
if(isConnected = true){
	if (mediumDegree>lowDegree){
		mediumDegree=mediumDegree-1;
		System.out.println("The medium Degree is"+mediumDegree);
		
	}else {
		System.out.println(" low Degree reached");
	}
	}else{
	System.out.println("oven turned of...degree cannot be decreased");
}

}

}




















