package tesTCasesJava;

public class swapstring {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";
		System.out.println("the value of a is: "+a+" the value of b is: "+b);
		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		System.out.println("b is now: "+b);
		a=a.substring(b.length());
		System.out.println("a is now: "+a);
	}

}
