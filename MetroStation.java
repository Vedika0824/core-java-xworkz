class MetroStation{ 


static String noOfStations[]={"rajajinagar" , "vijaynagar", "attiguppe" , "magestic" ,"chikpete", "nagsandra", "magdi road"};
 static double priceofTickets[]={20.00,25.45,45.98,22.00,10.00,55.00,18.90};
 
 public static void main(String metro[]){
  System.out.println("Main Started");
  
  for(String noOfStation:noOfStations){
  System.out.println(noOfStation);
  
  
  for(double priceofTicket:priceofTickets ){
  System.out.println(priceofTicket);
  
 
  }
  
  }
 
 }

}