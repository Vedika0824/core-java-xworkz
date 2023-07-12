class IceCream1Tester{
	public static void main(String args[]){
		IceCream1.addFlavour("vanilla");
		IceCream1.addFlavour("chocolate");
		IceCream1.addFlavour("butter scotch");
		IceCream1.addFlavour("blue berry");
		IceCream1.addFlavour("black current");
		IceCream1.addFlavour("mango ice cream");
		IceCream1.addFlavour("tender coconut");
		IceCream1.addFlavour("pista");
		IceCream1.addFlavour("oreo ice cream");
		IceCream1.addFlavour("Strawberry");
		IceCream1.getAllFlavorName();
		
		IceCream1.updateFlavourName("black current" , "rabdi");
		IceCream1.getAllFlavorName();
		int newLength =	IceCream1.deleleFlavourName("chocolate");
		System.out.println("Calling getAllFlavorNamePostDeletion");
		IceCream1.getAllFlavorNamePostDeletion(newLength);
			
				
		}

}