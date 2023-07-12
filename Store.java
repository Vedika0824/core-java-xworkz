class Store{
  
  static String listOfThings[]={"oil" , "rice" , "biscuits" , "wafers", "groundnuts" , "flour" , "wheat", "colddrinks", "milk"};
  
 
 public static void main (String shop[]){
 System.out.println("Main started");
 
 for(int i=0;i<listOfThings.length;){ // to fetch all data at once //(dec & initi; condition)
 System.out.println(listOfThings[i]);
 i++;
 }
 System.out.println("main ended");
 
 }
 
 }