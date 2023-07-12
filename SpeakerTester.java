class SpeakerTester{

public static void main (String test[]){
	 System.out.println("///////////////////////////////////////////////////////////");
System.out.println("main Started");

boolean connected=Speaker.onOrOff();
System.out.println("Is Speaker connected"+connected);

Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();

System.out.println("///////////////////////////////////////////////////////////");
boolean connected1=Speaker.onOrOff();
System.out.println("Is Speaker connected"+connected1);
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
System.out.println("main ended");

}
}