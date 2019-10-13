public class Operator{	
public static void main(String[]args){
	int i = 100;
	int j = 20; 
	boolean b = true ;
	boolean d = false ;
	boolean o ;
	int result ;
	
	result = i % j ;
	System.out.println("modulus = " +result);

	result ++;
	result = ++result;
	System.out.println("increment = " +result);
	
	result += j;
	System.out.println("Assignment = " +result);
	
	b = i <= j;
	System.out.println("Relational = " +b);
	
	o = b && d;
	System.out.println("logical = " +o);
	
	result = i | j ;
	System.out.println("increment = " +result);
	
}}