class SatelliteTester{

public static void main(String satellite[]){
   
	  System.out.println("Creating 1st copy of satellite");
	  Satellite satellite1 = new Satellite();
	  satellite1.name = "Sputnik 1";
	  satellite1.type = "communication";
	  satellite1.communicationCost = 15000;
	  satellite1.launchSatellites();
	  System.out.println(satellite1.name + " " + satellite1.type + " " + satellite1.communicationCost);
	  
	  System.out.println("Creating 2nd copy of satellite");
	  Satellite satellite2 = new Satellite();
	  satellite2.name = "Cartosat-2A";
	  satellite2.type = "earth observation";
	  satellite2.communicationCost = 50000;
	  satellite2.launchSatellites();
	  System.out.println(satellite2.name + " " + satellite2.type + " " + satellite2.communicationCost);
	  
	  System.out.println("Creating 3rd copy of satellite");
	  Satellite satellite3 = new Satellite();
	  satellite3.name = "Cartosat-2B";
	  satellite3.type = "navigation";
	  satellite3.communicationCost = 35000;
	  satellite3.launchSatellites();
	  System.out.println(satellite3.name + " " + satellite3.type + " " + satellite3.communicationCost);
	  
	  System.out.println("Creating 4th copy of satellite");
	  Satellite satellite4 = new Satellite();
	  satellite4.name = "IRNSS-1D";
	  satellite4.type = "astronomical";
	  satellite4.communicationCost = 95000;
	  satellite4.launchSatellites();
	  System.out.println(satellite4.name + " " + satellite4.type + " " + satellite4.communicationCost);
	  
	  System.out.println("Creating 5th copy of satellite");
	  Satellite satellite5 = new Satellite();
	  satellite5.name = "Megha-Tropiques";
	  satellite5.type = "communication";
	  satellite5.communicationCost = 100000;
	  satellite5.launchSatellites();
	  System.out.println(satellite5.name + " " + satellite5.type + " " + satellite5.communicationCost);
	  
	  System.out.println("Creating 6th copy of satellite");
	  Satellite satellite6 = new Satellite();
	  satellite6.name = "SARAL";
	  satellite6.type = "earth observation";
	  satellite6.communicationCost = 28000;
	  satellite6.launchSatellites();
	  System.out.println(satellite6.name + " " + satellite6.type + " " + satellite6.communicationCost);
	  
	  System.out.println("Creating 7th copy of satellite");
	  Satellite satellite7 = new Satellite();
	  satellite7.name = "RISAT-1";
	  satellite7.type = "astronomical";
	  satellite7.communicationCost = 150000;
	  satellite7.launchSatellites();
	  System.out.println(satellite7.name + " " + satellite7.type + " " + satellite7.communicationCost);
	  
	  System.out.println("Creating 8th copy of satellite");
	  Satellite satellite8 = new Satellite();
	  satellite8.name = "GSAT-3";
	  satellite8.type = "navigation";
	  satellite8.communicationCost = 55000;
	  satellite8.launchSatellites();
	  System.out.println(satellite8.name + " " + satellite8.type + " " + satellite8.communicationCost);
	  
	  System.out.println("Creating 9th copy of satellite");
	  Satellite satellite9 = new Satellite();
	  satellite9.name = "chandrayaan-1";
	  satellite9.type = "astronomical";
	  satellite9.communicationCost = 195000;
	  satellite9.launchSatellites();
	  System.out.println(satellite9.name + " " + satellite9.type + " " + satellite9.communicationCost);
	  
	  System.out.println("Creating 10th copy of satellite");
	  Satellite satellite10 = new Satellite();
	  satellite10.name = "Kalpana-1";
	  satellite10.type = "communication";
	  satellite10.communicationCost = 156000;
	  satellite10.launchSatellites();
	  System.out.println(satellite10.name + " " + satellite10.type + " " + satellite10.communicationCost);
}

}