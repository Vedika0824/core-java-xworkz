class MiniMarket{
  
  static String listOfThings[]={"oil" , "rice" , "biscuits" , "wafers", "groundnuts" , "flour" , "wheat", "colddrinks", "milk"};
  
  static double priceOfThings[]={115.00,1270.45,120.00,50.00,45.36,300.00,450.12,20.00,25.00};
 public static void main (String shop[]){
 System.out.println("Main started");
 
 for(String listOfThing:listOfThings){ // to fetch all data at once //(dec & initi; condition)
 System.out.println(listOfThing);
getlistOfThings();
 
 //foreach
 for(double priceOfThing:priceOfThings){
 System.out.println(priceOfThing);
 }
 }
 System.out.println("main ended");
 
 
 public static void getlistOfThings(){
	 System.out.println("Inside getlistOfThings");
	 for(String listOfThing:listOfThings){
		 System.out.println(listOfThing);
 }
 }
 
 }                   