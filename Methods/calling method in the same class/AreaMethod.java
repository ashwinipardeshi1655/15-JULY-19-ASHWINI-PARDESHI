public class AreaMethod{
	public static int areaRect(int l, int b){
		int rectangle_area = l*b;
		return rectangle_area;
	}
	
	public static void main(String[]args){
		int area = areaRect(2,4);
		System.out.println("Area of Rectagle = "+area);
	}
}