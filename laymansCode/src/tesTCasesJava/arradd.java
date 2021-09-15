package tesTCasesJava;

public class arradd {
	
	public static void main(String[] args) {

		try {
			int arr[]= {1,2,3,4,5,6,7};
			System.out.println(arr.length);

			for(int i=0;i<arr.length-1;i++) 
			{
				for(int j= i+1;j<=arr.length-1;j++)
				{
					if(arr[i]+arr[j]==7)
					{
						System.out.println("the numbers are: "+arr[i]+ "and" +arr[j]);
					}
				}
			}
		}
		catch(Exception e) {
			e.getCause();
			e.printStackTrace();
			e.getMessage();
		}
		
	}


}
