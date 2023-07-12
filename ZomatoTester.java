class ZomatoTester{

public static void main (String foodDelivery[]){
	

double priceOfFoodName=Zomato.search("pizza");
System.out.println("The food price  is"+ priceOfFoodName);


double priceWithGivenQuantity=Zomato.search("pizza",4);
System.out.println("The food price with quantity "+ priceWithGivenQuantity);

}
}