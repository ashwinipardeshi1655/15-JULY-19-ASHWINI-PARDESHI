public class BitwiseOperator{
	public static void main(String[]args){
		byte i = 2;
		byte j = 3;
		int a = 1 ;
		int b = 5 ;
		
		int sum = i & j;
		System.out.println("For & = "+sum);
		
		int diff  = i | j;
		System.out.println("For | "+diff);
		
		int bitws = i ^ j;
		System.out.println("bitwise = " +bitws);
		
		int bit = a ^ b;
		System.out.println("bitwise2 = " +bit);
}}