public class UserName{
	public static void main(String[]args){
		
		char c = 'a';
		int dayNum = 7;
		
		if(dayNum<=5){
			System.out.println(c);
		}
		else if(dayNum>=5 && dayNum<=7){
			for(int i=1; i<=5 ;i++){
				System.out.println(c);
			}
		}
		else{
			System.out.println("invalid weekday");
		}
	}
}