package tesTCasesJava;

public class ReverseNumber {

	public static void main(String[] args) {

		int i = 329734;
		int rev=0;
		
	while(i!=0)
	{
		rev = rev*10 + i%10;
		i = i/10;
	}
System.out.println(rev);
		
	}

}
