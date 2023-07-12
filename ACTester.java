class ACTester{

public static void main (String test[]){
	 System.out.println("///////////////////////////////////////////////////////////");
System.out.println("main Started");

boolean connected=AC.onOrOff();
System.out.println("Is AC connected"+connected);

AC.increaseTemperature();
AC.increaseTemperature();
AC.increaseTemperature();
AC.increaseTemperature();
AC.increaseTemperature();
AC.increaseTemperature();
AC.increaseTemperature();

System.out.println("///////////////////////////////////////////////////////////");
boolean connected1=AC.onOrOff();
System.out.println("Is AC connected"+connected1);
AC.decreaseTemperature();
AC.decreaseTemperature();
AC.decreaseTemperature();
AC.decreaseTemperature();
AC.decreaseTemperature();
AC.decreaseTemperature();
AC.decreaseTemperature();
System.out.println("main ended");

}
}