package Ex5_1;

class Point {
	private int x, y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		
		ColorPoint cp2 = new ColorPoint(5, 6, "blue");
		cp2.showColorPoint();
	}
}
