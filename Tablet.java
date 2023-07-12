class Tablet{
	
	
	
	// static variable 
   static String brandName="Lenovo";
   static String modelName="Lenovo Tab P11 5G FHD";
   static int price=19999;
   static String colour ="red";
   static String operatingSystem="Android 11";
   static boolean  withCharger = true;
   static String  screenSize	="11 Inches";
	static String storage ="256GB";
   
   public static void main(String lappi[]){
	   //local variable 
	   System.out.println("Main Started");
	   
    System.out.println("Name of the  brand is "+ brandName);
	
	System.out.println("price of the Tablet is "+ price);
	
	System.out.println("colour of the Tablet is "+ colour);
	System.out.println("is charger provided "+  withCharger );
	System.out.println("model name of Tablet"+ modelName  );
		
	System.out.println(" operatingSystem of Tablet  "+ operatingSystem);
	System.out.println(" storage of Tablet  "+ storage);
	
	System.out.println("screen size  of Tablet  is  "+ screenSize );
	
	
	
	System.out.println("Main ended");
	
   }
  }