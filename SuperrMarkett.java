class SuperrMarkett{

        //static variable
         // list of vegetables 
       static String vegatables[]={"Potato","Carrot", "beans" ,"brinjal","onion", "tomato", "ladiesfinger","cabbage","califlower","bitterguard"};
	   
	   
	   // list of biscuits
       static String biscuits[]={"parle","marie gold","oreo","moms magic","sunfeast","hide and seek" , "goodday","crackjack","darkfantasy","unibic"};
	   
	   // list of perfumes
	   static String perfumes[]={"fog","engage" ,"yardley" ,"setwet","graphite","ks","eva","something something","once more","park avenue"};
	   
	  
        public static void main (String market[]){
		   System.out.println("///////////////////////////////////////////////////////////");
		   System.out.println("Main Started");
		   System.out.println("List of vegatables are:");
		   getVegatables();
		   
		    System.out.println("///////////////////////////////////////////////////////////");
		   System.out.println("List of biscuits are:");
		   getBiscuits();
		   
		    System.out.println("///////////////////////////////////////////////////////////");
		   System.out.println("List of perfumes are:");
		   getPerfumes();
		   
		    System.out.println("Main ended");
		}
		    //for
        public static void getVegatables(){
	    System.out.println("Inside getVegatables");
	     for(String vegatable:vegatables){
		 System.out.println(vegatable);
		 		 }
		}
		   
		   //for
        public static void getBiscuits(){
	    System.out.println("Inside getBiscuits");
	     for(String biscuit:biscuits){
		 System.out.println(biscuit);
		   
		 }
		}
		   //for
        public static void getPerfumes(){
	    System.out.println("Inside getPerfumes");
	     for(String perfume:perfumes){
		 System.out.println(perfume);
		   
		 }
		}
		 
}
		 
		