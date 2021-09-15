package tesTCasesJava;

import java.util.Scanner;

public class sortingnum {
	
static int len=0;

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.println("enter a number to sort");
		int num= in.nextInt();
		System.out.println(lencount(num));
		
	}
	
	public static int lencount(int num) {
		while(num>0) {
		num=num/10;
		len++;	
	}
		return len;
}
	public static void dosort(int len,int num) {
		int a[]=new int[num];
		for(int i=0;i<len;i++) {
			if(a[i]>a[i+1]) {
			}
		}
		
	}
	
	
}