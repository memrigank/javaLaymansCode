package tesTCasesJava;

public class JunkRemoval {

	public static void main(String[] args) {

		String str = "/[~`!@#$%^&*()+={}\\[\\]|\\\\:;\\\"'<>,.?\\/]/\", \"@ah meng";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}
