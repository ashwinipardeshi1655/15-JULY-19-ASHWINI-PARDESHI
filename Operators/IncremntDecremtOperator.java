public class IncremntDecremtOperator{
	public static void main(String[]args){
		//post increment
		int i = 10;
		i++ ;
		System.out.println("i = "+i);
		
		//pre increment
		++i ;
		System.out.println("i = "+i);
		
		
		
		int x = 20;
		int y ;
		y = x++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		y = ++x ;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
		int a = 50 ;
		a--;
		System.out.println("a = "+a);
		
		--a;
		System.out.println("a = "+a);
		
		int u = 5;
		int v ;
		v = u-- ;
		System.out.println("u = "+u);
		System.out.println("v = "+v);
		
		v = --u;
		System.out.println("u = "+u);
		System.out.println("v = "+v);
		
}} 
