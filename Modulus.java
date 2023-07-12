class Modulus{

public static void main(String mod[]){

mod(778,11,22);
mod(428,13,25);
mod(432,22,24);
mod(221,6,3);
mod(132,61,75);


}
public static void mod(int a, int b){
System.out.println(a%b);
}

public static void mod(int a, int b, int c){
System.out.println((a%b)%c);
} 
}