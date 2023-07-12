class Laptop{
	// static variable 
   static String brandName;
   static String modelName;
   static int price;
   static String colour ;
   static String operatingSystem;
   static boolean  withCharger ;
   static String powerSource ;
    static String cellularTechnology ;
	static String storage ;
   
   public static void main(String lappi[]){
	   //local variable 
	   System.out.println("Main Started");
	   
    System.out.println("Name of the  brand is "+ brandName);
	System.out.println("price of the Laptop is "+ price);
	System.out.println("colour of the Laptop is "+ colour);
	System.out.println("is charger provided "+  withCharger );
	System.out.println("model name of Laptop"+ modelName  );
	System.out.println(" operatingSystem of Laptop  "+ operatingSystem);
	System.out.println(" storage of Laptop  "+ storage);
	System.out.println("power source  of Laptop  is  "+ powerSource );
	System.out.println("Main ended");
	
	  String brandName="HP";
     String modelName="15s-fq2717TU";
     int price=70999;
     String colour ="grey";
     String operatingSystem="Windows 11 Home";
     boolean  withCharger = true;
       String powerSource ="6000mAh Battery";
      String cellularTechnology ="5g";
	  String storage ="512GB";
	
	System.out.println("Name of the  brand is "+ brandName);
	System.out.println("price of the Laptop is "+ price);
	System.out.println("colour of the Laptop is "+ colour);
	System.out.println("is charger provided "+  withCharger );
	System.out.println("model name of Laptop"+ modelName  );
	System.out.println(" operatingSystem of Laptop  "+ operatingSystem);
	System.out.println(" storage of Laptop  "+ storage);
	System.out.println("power source  of Laptop  is  "+ powerSource );
	System.out.println("Main ended");
	
   }
  }