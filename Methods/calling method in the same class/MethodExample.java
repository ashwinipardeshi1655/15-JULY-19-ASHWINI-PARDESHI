public class MethodExample{
	public static int calcArea(int side){
		int area = side * side;
		return area;
	}
	
	public static void main(String[]args){
		int a = calcArea(5);
		System.out.println("Area of Square = "+a);
		}
}