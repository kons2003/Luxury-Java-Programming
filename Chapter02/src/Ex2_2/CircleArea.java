package Ex2_2;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.141592;
		
		double radius, circleArea;
		
		radius = 10.0;
		circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = " + circleArea);
	}
}