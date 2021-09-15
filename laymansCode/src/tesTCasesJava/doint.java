package tesTCasesJava;

import java.util.Scanner;

public class doint {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=0;
		System.out.println(num);
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		
	}

}
