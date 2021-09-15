package tesTCasesJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCheck {

	public static void main(String[] args) {

		List<Integer> val = new ArrayList<>();
		val.add(24);
		val.add(34);
		val.add(14);
		val.add(4);
		val.add(44);
		System.out.println(val);
		val.add(3, 74);
		System.out.println(val);
		Collections.sort(val);
		System.out.println(val);
		Collections.reverse(val);
		System.out.println(val);
		val.forEach(System.out::println);
		System.out.println("--------------");
		System.out.println(val.get(2));
		
	}

}
