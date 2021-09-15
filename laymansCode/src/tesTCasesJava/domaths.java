package tesTCasesJava;

public class domaths extends simpleProject{

	public domaths(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		simpleProject sp = new simpleProject(5, 4);
		System.out.println(sp.add());
		System.out.println(sp.subtract());
		
	}

}
