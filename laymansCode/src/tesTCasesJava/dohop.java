package tesTCasesJava;

import java.util.Scanner;

public class dohop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		int len = str.length();
		System.out.println(str);
		System.out.println(len);
		char[] a=new char[len];
		char temp=str.charAt(0);
		for(int i=0;i<len-1;i++) {
			a[i]=str.charAt(i+1);
		}
		a[len-1]=temp;
		System.out.println(a);
	}

}
