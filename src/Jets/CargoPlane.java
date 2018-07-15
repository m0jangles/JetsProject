package Jets;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	public void loadCargo() {
		System.out.println(getModel() + " loading...cargo...");

	}

	@Override
	public void fly() {
		System.out.println("Cargo Plane flying!");
	}
	
	

}
