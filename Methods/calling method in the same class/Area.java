public class Area{
	public static double circleArea(int r){
		double circle = 3.142*r*r;
		return circle;
	}
	
	public static double triangleArea(int l , int h){
		double triangle = 0.5 *l*h;
		return triangle;
	}
	
	public static void main(String[]args){
		double a = circleArea(2);
		System.out.println("Area of circle = "+a);
		
		double b = triangleArea(2,4);
		System.out.println("Area of triangle = "+b);
	}
}

		