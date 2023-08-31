package Pr6_2;

class Circle {
	// 필드
	private int x, y, radius;
	
	// 생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// 메소드
	public String toString() {
		return "Circle(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		
		return (this.x == c.x && this.y == c.y && this.radius == c.radius) ? true : false;
		
		/*if (this.x == c.x && this.y == c.y)
			return true;
		else
			return false;*/
	}
	
}

public class CircleEx {
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : "+a);
		System.out.println("원 b : "+b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
