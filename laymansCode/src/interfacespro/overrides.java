package interfacespro;

public class overrides extends Interfacefun{
	
	@Override
	public void charge() {
		System.out.println("Already charged");		
	}

	@Override
	public int batteryPer() {
		return 100 ;
	}

}
