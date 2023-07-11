class TeleCommunicationn1Tester{

public static void main(String sim[]){
          TeleCommunicationn1.addSimCard("Jio");
		  TeleCommunicationn1.addSimCard("Airtel");
		  TeleCommunicationn1.addSimCard("Bsnl");
		  TeleCommunicationn1.addSimCard("Idea");
		  TeleCommunicationn1.addSimCard("Vodafone");
          TeleCommunicationn1.getAllSimsAvailable();
	    boolean isUpdated =  TeleCommunicationn1.updateSimName("Airtel", "Tata docomo");
	    System.out.println("Is sim name updated " +isUpdated );
		TeleCommunicationn1.getAllSimsAvailable();
		int newLength =	TeleCommunicationn1.deleteSimName("Idea");
			System.out.println("Calling getAllSimNamePostDeletion");
			TeleCommunicationn1.getAllSimNamePostDeletion(newLength);


		
}
}