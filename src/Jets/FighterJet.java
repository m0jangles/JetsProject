package Jets;

public class FighterJet extends Jet {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	public void fight() {
		System.out.println("PEW PEW PEW, I'M FIGHTING, MOVE OUT THE WAY");
	}

	@Override
	public void fly() {
		System.out.println("Fighter Jet flying!");
	}

}
