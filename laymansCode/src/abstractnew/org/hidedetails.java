package abstractnew.org;

public class hidedetails {

	public static void main(String[] args) {

				phoneme pm = new latestme();
				pm.call();
				pm.dance();
				pm.kill();
				pm.move();

	}
}


abstract class phoneme{

	public void call() {
		System.out.println("calling....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void kill();
}

abstract class newme extends phoneme{

	public void move() {
		System.out.println("moving....");
	}
}

class latestme extends newme{

	public void dance() {
		System.out.println("dancing....");
	}
	public void kill() {
		System.out.println("Killing...");
	}
}