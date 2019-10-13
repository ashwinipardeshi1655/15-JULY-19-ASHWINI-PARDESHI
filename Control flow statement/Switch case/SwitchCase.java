public class SwitchCase{
	public static void main(String[]args){
		
		int dayNum = 1;
		
		switch(dayNum){
			
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
			System.out.println("Tuesday");
			break;
			
			case 3:
			System.out.println("Wedesday");
			break;
			
			case 4:
			System.out.println("Thursday");
			break;
			
			case 5:
			System.out.println("Friday");
			break;
			
			case 6:
			System.out.println("Saturday");
			break;
			
			case 7:
			System.out.println("Sunday");
			break;
			
			default:
			System.out.println("Invalid Input");
		}
		System.out.println("code outside switch statement");
}}



//If you didnt write break statement after each switch code then all the statement after executing condition will display
//eg. here input is 1 , so if we didnt write break statement here then all the statement after monday will be executed.