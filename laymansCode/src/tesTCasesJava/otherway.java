package tesTCasesJava;

import java.util.ArrayList;
import java.util.List;

public class otherway {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		list.add(3);
		list.add(6);
		list1.add(2);
		list1.add(4);
		list1.add(8);
		System.out.println(list);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		
		
	}
}
