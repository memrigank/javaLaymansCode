package tesTCasesJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mywaysort {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		System.out.println("enter the number of digits that you want to store");
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int a[]=new int[num];
		System.out.println("enter the number that you want to store");
		
		for(int i=0;i<num;i++) {
			 a[i]=in.nextInt();
			 int b= a[i];
			 list.add(b);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		
		
	}

}
