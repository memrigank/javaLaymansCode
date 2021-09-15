package tesTCasesJava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {

		String names[] = {"java", "Ruby", "java", "C", "Python"};
		int count = 1;
		String StrVal="";
		Set<String> Store = new HashSet<>();
		
		for(String name : names) {
			if(Store.add(name)==false) {
				System.out.println(name +" is the duplicate string");
				count = count+1;
				StrVal = name;
			}
		}
		System.out.println("the String "+ StrVal+" appeared "+count+" times");

		
	}

}
