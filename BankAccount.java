class BankAccount{


 static  String bankName="sbi";
 static   double credit=10000.00;
  static  double debit=5000.62;
   static boolean balance;
   
  public static void main(String bank[]){
  System.out.println("main started");
 
System.out.println("Invoking balance()");


if(balance==false){
balance=true;
System.out.println("amount credited is "+ credit);
}

if(balance==true){
balance=false;
System.out.println("amount debited is " + debit);
 
  }
  
}}