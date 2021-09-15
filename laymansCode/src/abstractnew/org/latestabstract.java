package abstractnew.org;

public class latestabstract {

	public static void main(String[] args) {
		newCalC cal = new newCalC();
		System.out.println(cal.add(5, 4));
		System.out.println(cal.sub(8, 2));


	}

}

abstract class claC{

	public abstract int add();
	public abstract int sub();
}

class newCalC{

	public int add(int i, int j) {
		int sum = i+j;
		return sum;
	}
	public int sub(int i, int j) {
		int subt= i-j;
		return subt;
	}
}