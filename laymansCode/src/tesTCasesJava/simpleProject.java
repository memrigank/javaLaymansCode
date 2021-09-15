package tesTCasesJava;

public class simpleProject {
	int a;
	int b;
	public simpleProject(int a, int b) {
		this.a=a;
		this.b=b;
		
	}

	public int add()
	{
		int sum= a+b;
		return sum;
	}
	
	public int subtract() {
		int sub= a-b;
		return sub;
	}
}
