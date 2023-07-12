class Movies{

static String englishMovies[]={"the wolf of wall street" , "inception" , "the northman" , "the lost city of Z" , "a beautiful mind" , "the big short" ,
 "train to busan" ,"creed iii" ,"the prestige" , "top gun" ,"dunkrik" , "smile" , "mad max" , "shutter island" , "interseller" , "creed" , "the dark knight" , "she said" , 
 "nope" , "candyman" ,"the courier" , "dune" , "voilent night" , "air" , "the big sick"};
 
 
 static String kannadaMovies[]={"Premadakanike" , "sanadiappanna" , "mourya" , "milana" , "amma" , "akash" ,"vasanthageeta" ,"hosabelaku" ,"gandhadaguddi" , "kantara" ,
 "yuvaratana" , "kranti" , "galipata" , "rider" , "pogaru" , "vikranthrona" , "robert" , "bajarangi" , "hero" , "diya" ,"aake" , "lovemock tail" , "love birds" };

static String telguMovies[]={"custody" , "shaakuntalla" , "sita ramam" , "ravanasura" , "v" , "ranga marathanda" ,"maharshi" ,"jathi ratnalu" ,"ugram" , "evaru" ,"hit" ,
 "ammu" , "thank you" , "pagal" , "saaho" , "master" , "achrya" , "majili" , "top gear" , "u turn" ,"sashi" , "bombat" , "fida" , "gatham" , "mahaanati"};
 
  public static void main(String movie[]){
	  System.out.println("/////////////////////////////////////////////////////////////////////////");
    getenglishMovies();
	
	 System.out.println("/////////////////////////////////////////////////////////////////////////");
    getkannadaMovies();
	
	 System.out.println("/////////////////////////////////////////////////////////////////////////");
    gettelguMovies();
}

public static void getenglishMovies(){
System.out.println("Inside getenglishMovies");
 for(String englishMovie:englishMovies){
System.out.println(englishMovie);
}
}

public static void getkannadaMovies(){
System.out.println("Inside getkannadaMovies");
 for(String kannadaMovie:kannadaMovies){
System.out.println(kannadaMovie);
}
}

public static void gettelguMovies(){
System.out.println("Inside gettelguMovies");
 for(String telguMovie:telguMovies){
System.out.println(telguMovie);
}
}
} 