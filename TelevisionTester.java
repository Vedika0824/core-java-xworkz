class TelevisionTester{

public static void main (String test[]){
	 System.out.println("///////////////////////////////////////////////////////////");
System.out.println("main Started");

boolean connected=Television.onOrOff();
System.out.println("Is Television connected"+connected);

Television.increaseVolume();
Television.increaseVolume();
Television.increaseVolume();
Television.increaseVolume();
Television.increaseVolume();

System.out.println("///////////////////////////////////////////////////////////");
boolean connected1=Television.onOrOff();
System.out.println("Is Television connected"+connected1);
Television.decreaseVolume();
Television.decreaseVolume();
Television.decreaseVolume();
Television.decreaseVolume();
System.out.println("main ended");

}
}