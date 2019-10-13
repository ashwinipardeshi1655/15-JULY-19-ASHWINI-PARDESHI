public class AssignmentOperators{
	public static void main(String[]args){
		int i ;
		int j ;
		i = 10 ;
		j = 20 ;
		System.out.println("i = " +i);
		System.out.println("j = "  +j);
		
		j += i;            //value of j will be stored in i.....and i's value will be terminated.
		System.out.println("j = "+j);
		
		j -= i; 
		System.out.println("j = " +j);
		j *= i; 
		System.out.println("j = " +j);
		j /= i; 
		System.out.println("j = " +j);
		j %= i; 
		System.out.println("j = " +j);
		
}}