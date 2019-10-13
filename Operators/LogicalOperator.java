public class LogicalOperator{
	public static void main(String[]args){
		boolean b = true;
		boolean c = false;
		
		boolean d = b&&c;
		System.out.println("For AND = "+d);
		
		d = b || c;
		System.out.println("For OR = "+d);
		
		d = !(b || c);
		System.out.println("For NOR = "+d);
		
		d = !(b && c);
		System.out.println("For NAND = "+d);
		
		
}}