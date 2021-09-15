package tesTCasesJava;

public class Encalulation {

	private int EmpID;

	public void setEmpID(int empid) {

		EmpID=empid;
	}
	public int getEmpID() {
		return EmpID;
	}
	public static void main(String[] args) {

		Encalulation encap = new Encalulation();
		encap.setEmpID(324);
		System.out.println(encap.getEmpID());
	}

}
