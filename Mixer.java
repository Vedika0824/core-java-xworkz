class Mixer{

static String name ="Philips";
static  int lowSpeed;
static  int mediumSpeed;
static  int highSpeed=3;
static boolean isConnected;
//method

public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter"+0);

if(isConnected==false){
isConnected=true;
System.out.println("Mixer is Turned onn...");
}

else if(isConnected==true){
isConnected=false;
System.out.println("Mixer is Turned off");
}
return isConnected;
}


//increase volume 
public static void increaseSpeed(){
	
	if(isConnected =true){
	if (mediumSpeed<highSpeed){
		mediumSpeed=mediumSpeed+1;
		System.out.println("The medium Speed is"+mediumSpeed);	
	}else {
		System.out.println("high Speed reached");
	}
	}else{
	System.out.println("hey.... Mixer on madu firstu");
}

}

//decrease Speed
public static void decreaseSpeed(){
	
if(isConnected = true){
	if (mediumSpeed>lowSpeed){
		mediumSpeed=mediumSpeed-1;
		System.out.println("The medium Speed is"+mediumSpeed);
		
	}else {
		System.out.println("low Speed reached");
	}
	}else{
	System.out.println("Mixer turned of...Speed cannot be decreased");
}

}

}




















