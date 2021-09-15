package tesTCasesJava;

public class spacedelete {

	public static void main(String[] args) {

		String s = "Quapitol QA";
		System.out.println(s);
		s=s.replaceAll(" ","");
		System.out.println(s);
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);

	}
}
