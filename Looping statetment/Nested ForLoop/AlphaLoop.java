public class AlphaLoop{
	public static void main(String[]args){
		
		char a = 65;
		char b = 97;
		for(int i = 1; i<=3 ;i++){
			for(int j = 1;j<=i ;j++){
				System.out.print(a);
				System.out.print(b);
				a++;
				b++;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}