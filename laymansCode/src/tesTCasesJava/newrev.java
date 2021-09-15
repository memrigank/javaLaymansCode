package tesTCasesJava;

public class newrev {

	public static void main(String[] args) {

		String s="Orbital Torque";
		String one=s.replaceAll(" Orbital", " Torque");
		String two=s.replaceAll(" Torque", " Orbital");
		s=one+two;
		System.out.println(s);
	}

}
