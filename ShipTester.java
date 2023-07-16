class ShipTester{
	
public static void main(String ship[]){
   
	  System.out.println("Creating 1st copy of ship");
	  Ship ship1 = new Ship();
	  ship1.name = "Titanic";
	  ship1.purpose = "transportation";
	  ship1.noOfCompartments = 11;
	  ship1.toSailShips();
	  System.out.println(ship1.name + " " + ship1.purpose + " " + ship1.noOfCompartments);
	  
	  System.out.println("Creating 2nd copy of ship");
	  Ship ship2 = new Ship();
	  ship2.name = "Destroyer";
	  ship2.purpose = "adventure";
	  ship2.noOfCompartments = 9;
	  ship2.toSailShips();
	  System.out.println(ship2.name + " " + ship2.purpose + " " + ship2.noOfCompartments);
	  
	  System.out.println("Creating 3rd copy of ship");
	  Ship ship3 = new Ship();
	  ship3.name = "Bomb vessel";
	  ship3.purpose = "war";
	  ship3.noOfCompartments = 13;
	  ship3.toSailShips();
	  System.out.println(ship3.name + " " + ship3.purpose + " " + ship3.noOfCompartments);
	  
	  System.out.println("Creating 4th copy of ship");
	  Ship ship4 = new Ship();
	  ship4.name = "USS Monitor";
	  ship4.purpose = "transportation";
	  ship4.noOfCompartments = 5;
	  ship4.toSailShips();
	  System.out.println(ship4.name + " " + ship4.purpose + " " + ship4.noOfCompartments);
	  
	  System.out.println("Creating 5th copy of ship");
	  Ship ship5 = new Ship();
	  ship5.name = "Cutty Sark";
	  ship5.purpose = "adventure";
	  ship5.noOfCompartments = 6;
	  ship5.toSailShips();
	  System.out.println(ship5.name + " " + ship5.purpose + " " + ship5.noOfCompartments);
	  
	  System.out.println("Creating 6th copy of ship");
	  Ship ship6 = new Ship();
	  ship6.name = "Kraken";
	  ship6.purpose = "war";
	  ship6.noOfCompartments = 14;
	  ship6.toSailShips();
	  System.out.println(ship6.name + " " + ship6.purpose + " " + ship6.noOfCompartments);
	  
	  System.out.println("Creating 7th copy of ship");
	  Ship ship7 = new Ship();
	  ship7.name = "Mayflower";
	  ship7.purpose = "transportation";
	  ship7.noOfCompartments = 9;
	  ship7.toSailShips();
	  System.out.println(ship7.name + " " + ship7.purpose + " " + ship7.noOfCompartments);
	  
	  System.out.println("Creating 8th copy of ship");
	  Ship ship8 = new Ship();
	  ship8.name = "Santa Maria";
	  ship8.purpose = "adventure";
	  ship8.noOfCompartments = 13;
	  ship8.toSailShips();
	  System.out.println(ship8.name + " " + ship8.purpose + " " + ship8.noOfCompartments);
	  
	  System.out.println("Creating 9th copy of ship");
	  Ship ship9 = new Ship();
	  ship9.name = "Imagination";
	  ship9.purpose = "transportation";
	  ship9.noOfCompartments = 9;
	  ship9.toSailShips();
	  System.out.println(ship9.name + " " + ship9.purpose + " " + ship9.noOfCompartments);
	  
	  System.out.println("Creating 10th copy of ship");
	  Ship ship10 = new Ship();
	  ship10.name = "Wanderlust";
	  ship10.purpose = "adventure";
	  ship10.noOfCompartments = 18;
	  ship10.toSailShips();
	  System.out.println(ship10.name + " " + ship10.purpose + " " + ship10.noOfCompartments);

}

}