package Ex7_1;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add( Integer.valueOf(5)); // v.add(5); index: 0
		v.add(4); // 자동박싱 index: 1
		
		Integer i = Integer.valueOf(-1);
		v.add(i); // -1 index: 3
		
		v.add(2, 100); // index: 2
		
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
