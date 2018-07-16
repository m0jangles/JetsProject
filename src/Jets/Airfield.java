package Jets;

import java.util.Scanner;

public class Airfield {

	private Jet[] jets;
	final private static int MAX_JETS = 15;
	private int fleetIndex = 0;

	public Airfield() {
		jets = new Jet[MAX_JETS];
		Jet cb = new CargoPlane("C17", 500, 6456, 218000000);
		Jet fj = new FighterJet("F22", 1522, 1600, 339000000);
		Jet hhp = new HipHopPlane("Missy", 45, 600, 899);
		Jet cp = new CargoPlane("C130", 45, 600, 11900000);
		Jet ff = new FighterJet("F35", 1200, 1367, 94600000);

		addJet(cb);
		addJet(fj);
		addJet(hhp);
		addJet(cp);
		addJet(ff);
	}

	public void addJet(Jet jet) {

		if (fleetIndex == jets.length) {
			System.out.println("No space for a new jet: ");
			return;
		}
		jets[fleetIndex] = jet;
		fleetIndex++;
	}

	public void addJet(Scanner sc) {
		sc.nextLine();
		System.out.println("\t Enter the model: ");
		String model = sc.nextLine();
		System.out.println("\tEnter the speed in mph: ");
		double speed = sc.nextDouble();
		System.out.println("\tEnter the range: ");
		int range = sc.nextInt();
		System.out.println("\tEnter the price: ");
		long price = sc.nextLong();
		Jet newJet = new JetImpl(model, speed, range, price);

		addJet(newJet);
	}

	public Jet[] getJets() {
		Jet[] copy = new Jet[fleetIndex];
		for (int j = 0; j < fleetIndex; j++) {
			copy[j] = jets[j];
		}

		return copy;
	}

	public void getFastestJet() {

		Jet minSpeed = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > minSpeed.getSpeed()) {
					minSpeed = jets[i];
				}
			}

		}
		System.out.println(minSpeed.toString());

	}

	public void getLongestRange() {
		Jet minRange = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange()> minRange.getRange()) {
					minRange = jets[i];
				}
			}

		}
		System.out.println(minRange.toString());
	}
}
