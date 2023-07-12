class Mobile{
	
	
	
	// static variable 
   static String brandName;
   static String modelName;
   static int price;
   static String colour ;
   static String operatingSystem;
   static boolean  withCharger;
   static String powerSource ;
    static String cellularTechnology ;
	static String storage;
   
   public static void main(String phone[]){
	   //local variable 
	   System.out.println("Main Started");
	   
    System.out.println("Name of the Mobile brand is "+ brandName);
System.out.println("price of the Mobile is "+ price);
	System.out.println("colour of the Mobile is "+ colour);
	System.out.println("is charger provided "+  withCharger );
	System.out.println("model name of mobile"+ modelName  );
	System.out.println(" operatingSystem of Mobile  "+ operatingSystem);
	System.out.println(" storage of Mobile  "+ storage);
	System.out.println("power source  of Mobile  is  "+ powerSource );
	System.out.println("Main ended");
	
	  String brandName="Samsung";
     String modelName="Samsung Galaxy M33 5G";
     int price=20999;
     String colour ="White";
     String operatingSystem="Android 12.0";
     boolean  withCharger = true;
     String powerSource ="6000mAh Battery";
      String cellularTechnology ="5g";
	  String storage ="128GB";
	
	 System.out.println("Name of the Mobile brand is "+ brandName);
System.out.println("price of the Mobile is "+ price);
	System.out.println("colour of the Mobile is "+ colour);
	System.out.println("is charger provided "+  withCharger );
	System.out.println("model name of mobile"+ modelName  );
	System.out.println(" operatingSystem of Mobile  "+ operatingSystem);
	System.out.println(" storage of Mobile  "+ storage);
	System.out.println("power source  of Mobile  is  "+ powerSource );
	System.out.println("Main ended");
	
	
   }
  }