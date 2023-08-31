package Ex6_1;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj; // 다운캐스팅
		if (this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}
}
public class ObjectPropertyEx {
	/*public static void print(Object obj) { // 업캐스팅
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}*/
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		//print(p);
		//System.out.println(p.toString());
		//System.out.println(p);
		//System.out.println(p + "점입니다.");
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		//System.out.println(a==b);
		//System.out.println(b==c);
		//System.out.println(a==c);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
	}
}
