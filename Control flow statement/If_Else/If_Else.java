public class If_Else{
public static void main(String[]args){
	int i = 10;
	int j = 100;
	
	if(i>j)
		System.out.println("i is greater");
	else{
		System.out.println("j is greater");
		System.out.println("statement inside else block");
	}
	System.out.println("statement outside If_Else block");
}}



//if you have only one condition inside if block or else block then there is no need to add {}
//but if you have multiple conditions inside if block or else block then you should add {}