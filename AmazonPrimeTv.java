class AmazonPrimeTv{

   static String movieNames[]={"Bhola" , "razzi" , "ram setu" , "chak de india" , "Pathan" , "runway34" , "jalsa" , "Thappad" ,"Shershaah" , "section375" ,
"jab we met" , "Hindi medium" , "thank god" , "3idiots" , "sultan" , "ghazi" , "toofan" , "phone bhoot" , "kapoor and sons" , "mardaaani2" , "trapped" , "kalank" ,
 " maja ma" , "satiya" , "jugjugg jeeyo" , "kgf" , "kesari"};
 
 
 public static void main(String movie[]){
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    getmovieNames();
}
public static void getmovieNames(){
System.out.println("Inside getmovieNames");
 for(String movieName:movieNames){
System.out.println(movieName);
}
}
} 