public class NumAlphaPattern{
public static void main(String []args)
{ 
	int s=2;
	char c =65;
	int a= 1;
	for (int j=1;j<=3;j++)
	{
		for (int i=1;i<=s;i++)
		{
			System.out.print(" ");
		}
		s--;
		for (int i=1; i<=2*j-1;i++)
		{
			System.out.print(c);
			c++;
		}
		System.out.println(" ");
	}
	s=1;
	for (int j=1;j<=2;j++)
	{
		for (int i=1;i<= s;i++)
		{
			System.out.print(" ");
		}
		s++;
		for (int i=1;i<= 2*(3-j)-1;i++)
		{
			System.out.print(a);
			a++;
		}
		System.out.println("");
	}
}
}