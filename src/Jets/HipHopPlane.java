package Jets;

public class HipHopPlane extends Jet {

	public HipHopPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	@Override
	public void fly() {
		System.out.println("Is it worth it? Let me work it.  I put my thang down flip it");
		System.out.println(" and reverse it.  It's Ti esrever dna ti pilf, nwod gniht ym tup.");
	}

}
