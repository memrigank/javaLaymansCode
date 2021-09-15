package interfacespro;

interface Mobile {
	
	String color = "Space Gray";
	void charge();
	int batteryPer();	
}

public abstract class Interfacefun implements Mobile {	
	
	public static void main(String[] args) {
		
		overrides ors = new overrides();
		System.out.println(ors.batteryPer());
		ors.charge();
		System.out.println(color);

	}

}

