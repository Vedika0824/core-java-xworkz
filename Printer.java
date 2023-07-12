class Printer{
	
	
	
	// static variable 
   static String brandName ;
   static int price;
   static String colour ;
   static String printingTechnology;
   static boolean isAutoDuplex ;
   static String  maximumPrintSpeed ;
	static String connectivityTechnology;
	static String recommendedUsesForProduct	="Office, Home";


   
   public static void main(String lappi[]){
	   //local variable 
    System.out.println("Main Started");   
    System.out.println("Name of the  brand is "+ brandName);
	System.out.println("price of the Printer is "+ price);
	System.out.println("colour of the Printer is "+ colour);
	System.out.println("is autoDuplex "+  isAutoDuplex );
	System.out.println(" name of printingTechnology"+ printingTechnology  );	
	System.out.println(" connectivity Technology of Printer  "+ connectivityTechnology);
	System.out.println(" maximum Print Speed of Printer  "+ maximumPrintSpeed);
	System.out.println("Printer  is used in  "+ recommendedUsesForProduct );
	System.out.println("Main ended");
	
	
	  String brandName="Canon";
     int price=10999;
     String colour ="black";
     String printingTechnology	="Inkjet";
     boolean isAutoDuplex = true;
     String  maximumPrintSpeed ="4.4ppm";
	  String connectivityTechnology	="Wi-Fi";
	  String recommendedUsesForProduct	="Office, Home";
	
	    System.out.println("Main Started");   
    System.out.println("Name of the  brand is "+ brandName);
	System.out.println("price of the Printer is "+ price);
	System.out.println("colour of the Printer is "+ colour);
	System.out.println("is autoDuplex "+  isAutoDuplex );
	System.out.println(" name of printingTechnology"+ printingTechnology  );	
	System.out.println(" connectivity Technology of Printer  "+ connectivityTechnology);
	System.out.println(" maximum Print Speed of Printer  "+ maximumPrintSpeed);
	System.out.println("Printer  is used in  "+ recommendedUsesForProduct );
	System.out.println("Main ended");
	
   }
  }