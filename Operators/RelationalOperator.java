public class RelationalOperator{
	public static void main(String[]args)
	{
		
		
		int i = 10;
		int j = 20;
		boolean b;
		
		{
			 b = i == j;
			System.out.println("For == "+b);
		}
		{
			b = i != j;
			System.out.println("For !== "+b);
		}
		{
			 b = i < j;
			System.out.println("For < "+b);
		}
		{
			 b = i > j;
			System.out.println("For > "+b);
		}
		{
			 b = i >= j;
			System.out.println("For >= "+b);
		}
		{
			b = i <= j;
			System.out.println("For <= "+b);
		}
		
		{
			int a = 66 ;
			char c = 'A';
			 b = a == c;
			System.out.println("For == "+b);
			
			b = a >= c;
			System.out.println("For >= "+b);
		}
}}