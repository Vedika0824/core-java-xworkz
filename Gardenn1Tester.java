class Gardenn1Tester{

public static void main(String flower[]){
          Gardenn1.addFlower("Rose");
		  Gardenn1.addFlower("Jasmin");
		  Gardenn1.addFlower("Sunflower");
		  Gardenn1.addFlower("Mogra");
		  Gardenn1.addFlower("Hibiscus");
		  Gardenn1.addFlower("Lotus");
		  Gardenn1.getAllFlowersAvailable();
		  
	     boolean isUpdated =  Gardenn1.updateFlowerName("Mogra", "Lily");
	     System.out.println("Is Flower name updated " +isUpdated );
		 Gardenn1.getAllFlowersAvailable();
		 int newLength =Gardenn1.deleteFlowerName("Lotus");
			System.out.println("Calling getAllFlowerNamePostDeletion");
			Gardenn1.getAllFlowerNamePostDeletion(newLength);
		  
}
}