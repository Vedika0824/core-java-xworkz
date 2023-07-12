class Speaker{
 
static String name ="JBL"; 
static  int minVolume;
static  int currentVolume;
static  int maxVolume=6;
static boolean isConnected;
//method


public static boolean onOrOff(){
System.out.println("Invoking onOrOff()");
System.out.println("Parameter"+0);
//logic
  // false == false
if(isConnected==false){
isConnected=true;
System.out.println("Speaker is Turned onn...enjoy");
}

else if(isConnected==true){
isConnected=false;
System.out.println("Speaker is Turned off");
}
return isConnected;
}


//increase volume 
public static void increaseVolume(){
// true == true
	if(isConnected == true){
	if (currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		System.out.println("The current volume is"+currentVolume);	
	}else {
		System.out.println("max Volume reached");
	}
	}else{
	System.out.println("Gubee.... Speaker connect madu firstu");
}

}

//decrease volume
public static void decreaseVolume(){
	
if(isConnected == true){
	if (currentVolume>minVolume){
		currentVolume=currentVolume-1;
		System.out.println("The current volumeis"+currentVolume);
		
	}else {
		System.out.println("min Volume reached");
	}
	}else{
	System.out.println("Speaker turned of...volume cannot be decreased");
}

}

}




















