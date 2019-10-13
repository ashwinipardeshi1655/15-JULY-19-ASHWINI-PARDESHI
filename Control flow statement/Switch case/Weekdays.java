public class Weekdays{
public static void main(String[]args){
	int dayNum = 2;
	
	switch(dayNum){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("Weekdays");
		break;
		
		default:
		System.out.println("Invalid day Num");
		break;
		
		case 6:
		case 7:
		System.out.println("Weekends");
		break;
}}}


//we can write default statement anywhere in the code but just we have to write break statement over there.
//because we normally write default at the last . so there is no need to add break statement of here.