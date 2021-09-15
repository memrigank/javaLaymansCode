package interfacespro;

interface laptop{

	String color="grey";
	int RAM();
	int memmory();
}

public class newinterface {

	public static void main(String[] args) {

		laptop lp = new laptop() {

			@Override
			public int memmory() {
				System.out.println("memmory is 250 gb");
				return 0;
			}

			@Override
			public int RAM() {
				System.out.println("Ram is 4 GB");
				return 0;
			}
		};

		System.out.println(lp.color);
		lp.memmory();
		lp.RAM();
		
	}

}
