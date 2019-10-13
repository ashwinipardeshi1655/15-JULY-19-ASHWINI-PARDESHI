public class StarPattern{
public static void main(String []args)
{ 
	int s=2;
	for (int i=1;i<=3;i++)
	{
		for (int j=1;j<=s;j++)
		{
			System.out.print(" ");
		}
		s--;
		for (int j=1; j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	s=1;
	for (int i=1;i<=2;i++)
	{
		for (int j=1;j<= s;j++)
		{
			System.out.print(" ");
		}
		s++;
		for (int j=1;j<= 2*(3-i)-1;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
}