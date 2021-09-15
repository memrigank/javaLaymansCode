package tesTCasesJava;

public class misnum {
	
	static int sum=0;
	static int realsum=0;
	static int missingnum=0;
	public static void main(String[] args) {
//finding missing number in an array
	int i;		
		
	int[] a= {2,4,8,10};
	int len=a.length;
	System.out.println("length of the array is: "+len);
	for(i=0;i<len;i++) {
		sum=sum+a[i];
	}
	System.out.println("sum: "+sum);
	for(i=0;i<6;i++) {
		realsum= realsum+i*2;
	}
	System.out.println("realsum: "+realsum);
	missingnum=realsum-sum;
	System.out.println("the missing number is: "+ missingnum);
	}

}
