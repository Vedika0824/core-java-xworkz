class MixerTester{

public static void main (String test[]){
	 System.out.println("///////////////////////////////////////////////////////////");
System.out.println("main Started");

boolean connected=Mixer.onOrOff();
System.out.println("Is Mixer connected"+connected);


Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();

System.out.println("///////////////////////////////////////////////////////////");
boolean connected1=Mixer.onOrOff();
System.out.println("Is Mixer connected"+connected1);
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
System.out.println("main ended");

}
}