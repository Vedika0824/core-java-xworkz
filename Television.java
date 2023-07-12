class Television{

static String name ="MI";
static  int lowVolume;
static  int mediumVolume;
static  int highVolume=8;
static boolean isConnected;
//method

public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter"+0);

if(isConnected==false){
isConnected=true;
System.out.println("Television is Turned onn...");
}

else if(isConnected==true){
isConnected=false;
System.out.println("Television is Turned off");
}
return isConnected;
}


//increase Volume
public static void increaseVolume(){
	System.out.println("start of increaseVolume");
	
	if(isConnected =true){
	if (mediumVolume<highVolume){
		mediumVolume=mediumVolume+1;
		System.out.println("The medium Volume  is"+mediumVolume);	
	}else {
		System.out.println(" high Volume reached");
	}
	}else{
	System.out.println("hey.... Television on madu firstu");
}

}

//decrease Volume
public static void decreaseVolume(){
	System.out.println("start of decreaseVolume");
if(isConnected = true){
	if (mediumVolume>lowVolume){
		mediumVolume=mediumVolume-1;
		System.out.println("The medium Volume is"+mediumVolume);
		
	}else {
		System.out.println("low Volume reached");
	}
	}else{
	System.out.println("Television turned of...Volume cannot be decreased");
}

}

}




















