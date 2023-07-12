class TeleCommunicationnTester{

public static void main(String sim[]){
          TeleCommunicationn.addSimCard("Jio");
		  TeleCommunicationn.addSimCard("Airtel");
		  TeleCommunicationn.addSimCard("Bsnl");
		  TeleCommunicationn.addSimCard("Idea");
		  TeleCommunicationn.addSimCard("Vodafone");
          TeleCommunicationn.getAllSimsAvailable();
	    boolean isUpdated =  TeleCommunicationn.updateSimName("Airtel", "Tata docomo");
	    System.out.println("Is sim name updated " +isUpdated );
		TeleCommunicationn.getAllSimsAvailable();		
}
}