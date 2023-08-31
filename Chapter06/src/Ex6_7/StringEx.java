package Ex6_7;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		System.out.println(a.contains("J"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		a = a.replace("C++", "Python");
		System.out.println(a);
		
		String[] s = a.split(",");
		for (int i = 0; i < s.length;i++)
			System.out.println(s[i]);
		
		a = a.substring(5);
		System.out.println(a);
		
		char ch = a.charAt(2);
		System.out.println(ch);
	}
}
