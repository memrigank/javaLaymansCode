package tesTCasesJava;

public class StringReverse {

	public static void main(String[] args) {

		String str = "NooN";
		String rev = "";
		int len;
		
		len = str.length();
		for(int i=len-1 ;i>=0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		System.out.println("the reverse of "+str+" is "+ rev);
		
		
	if(str.equals(rev))
	{
		System.out.println("the string is palindrome");
	}
	else
		System.out.println("its not palindrome");
	}

}
