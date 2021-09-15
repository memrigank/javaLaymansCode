package tesTCasesJava;

public class loopme {

	public static void main(String[] args) {

		char[] arr= {'a','p','p','l','e','y'};
		char temp=arr[0];
		int len =arr.length;
		System.out.println(len);
		for(int i=0;i<len-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[len-1]=temp;
		System.out.println(arr);
		
		
	}

}
