class IceCreammTester{
public static void main(String flavour[]){
	
       IceCreamm.addFlavour("Butterscotch");
	   IceCreamm.addFlavour("Vanilla");
	   IceCreamm.addFlavour("Chocolate");
	   IceCreamm.addFlavour("Strawberry");
	   IceCreamm.addFlavour("Kulfi");
	   IceCreamm.addFlavour("BlackCurrent");
	   IceCreamm.addFlavour("Mango");
	   IceCreamm.getAllFlavoursAvailable();
	   boolean isUpdated =  IceCreamm.updateFlavourName("Strawberry", "Rabdi");
	   System.out.println("Is flavour name updated " +isUpdated );
	   IceCreamm.getAllFlavoursAvailable();
	   IceCreamm.deleteFlavourName("BlackCurrent");
	   IceCreamm.getAllFlavoursAvailable();
}
}