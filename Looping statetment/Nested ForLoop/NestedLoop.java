public class NestedLoop{
	public static void main(String[]args){
		
		
		for(int i=1;i<=4;i++){
			int n = i;
			for(int j=1;j<=i;j++){
				System.out.print(n);
				System.out.print(" ");
				n=n+4-j;
			}
			System.out.println();
		}
	}
}
			