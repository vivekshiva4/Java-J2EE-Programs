package comn;

public class Test {

	public static void main(String[] args) {
		String str="hi boss";
		System.out.println(str.hashCode());
		System.out.println(str);
		
		
		StringBuilder s=new StringBuilder("hi vivek");
		System.out.println(s.hashCode());
		s.append("how are you");
		System.out.println(s.hashCode());
		s.insert(3, "Hi ");
		System.out.println(s.hashCode());
		System.out.println(s);
		
		System.out.println("capacity of string is: "+s.capacity());
		System.out.println("string length is :  "+s.length());
	}

}
