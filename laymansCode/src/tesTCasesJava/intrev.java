package tesTCasesJava;

import java.util.Scanner;

public class intrev {

	static int num=0;
	public static void main(String[] args) {

		System.out.println("enter a digit to be reversed");
		Scanner in = new Scanner(System.in);
		int dig=in.nextInt();
		System.out.println("the number you hav entered is: "+dig);
		while(dig!=0) {
			num=num*10+dig%10;
			dig=dig/10;
			
		}
		System.out.println("the reverse of the number you hav entered is: "+num);
	}

}
