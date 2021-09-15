package tesTCasesJava;

import java.util.Scanner;

public class onecharatatime {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter a string");
		String text = in.nextLine();
		fundo(text);
		
	}

	public static void fundo(String txt) {
		
		for(int i=0;i<txt.length();i++) {
			System.out.println(txt.substring(i, i+1));
		}
		
	}
}
