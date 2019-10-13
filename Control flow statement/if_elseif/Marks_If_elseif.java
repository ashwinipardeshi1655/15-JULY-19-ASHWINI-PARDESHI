public class Marks_If_elseif{
	public static void main(String[]args){
		int marks = -2;
		
		if(marks<=100 && marks>=91){
			System.out.println("A grade");
		}
		else if(marks<=90 && marks>=81){
			System.out.println("B grade");
		}
		else if(marks<=80 && marks>=71){
			System.out.println("C grade");
		}
		else if(marks<=70 && marks>=61){
			System.out.println("D grade");
		}
		else if(marks<=60 && marks>=51){
			System.out.println("E grade");
		}
		else if(marks<=50 && marks>=41){
			System.out.println("RETEST");
		}
		else if(marks<=40 && marks>=0){
			System.out.println("FAIL");
		}
		else{
			System.out.println("Invlid Marks");
}}}