package Ex7_9;

class GStack<T> {
	// 필드
	private int tos;
	private int size;
	private Object[] stck;
	
	// 생성자
	public GStack() {
		tos = 0;
		this.size = 10;
		stck = new Object[10];
	}
	
	public GStack(int size) {
		tos = 0;
		this.size = size;
		stck = new Object[this.size];
	}
	
	// push() 메소드
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos++] = item;
	}
	
	// pop() 메소드
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
	
	// reverse() 메소드
	public static <T> GStack<T> reverse(GStack<T> a) {
		GStack<T> s = new GStack<T>();
		
		while (true) {
			T tmp;
			tmp = a.pop();
			if(tmp == null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<>();
		
		stringStack.push("Seoul");
		stringStack.push("Busan");
		stringStack.push("LA");
		
		for(int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<>();
		
		intStack.push(Integer.valueOf(1));
		intStack.push(3);
		intStack.push(5);
		
		for(int n = 0; n < 3; n++)
			System.out.println(intStack.pop());
		
		GStack<Double> gs = new GStack<>();
		for(int i = 0;i < 5; i++) {
			gs.push(Double.valueOf(i));
		}
		
		gs = GStack.reverse(gs);
		for(int i = 0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}
}
