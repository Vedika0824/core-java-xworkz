class WashingMachine1Tester{

public static void main(String test[]){
System.out.println("Main Statrted");
WashingMachine1.name="philips";

boolean connected= WashingMachine1.onOrOff();
System.out.println("Is WashingMachine connected"+ connected);
WashingMachine1.increaseRotation();
WashingMachine1.increaseRotation();
WashingMachine1.increaseRotation();
WashingMachine1.increaseRotation();
 
 boolean connected1= WashingMachine1.onOrOff();
System.out.println("Is WashingMachine connected  "+ connected);
WashingMachine1.decreaseRotation();
WashingMachine1.decreaseRotation();
WashingMachine1.decreaseRotation();
WashingMachine1.decreaseRotation();
 
    
System.out.println("Main ended");
}
}