package Jets;

import java.util.Scanner;

public class Airfield {

	private Jet[] jets;
	final private static int MAX_JETS = 15;
	int i = 0;

	public Airfield() {
		jets = new Jet[15];
	}
	

	public void addJet(Jet jet) {
		this.jets[i] = jet;
		i++; // increment to reflect that we have one more jet
	}

	public Jet[] getJets() {
		Jet[] copy = new Jet[this.i];
		for (int j = 0; j < this.i; j++) {
			copy[j] = jets[j];
		}

		return copy;
	}

	public getFastestJet() {

		Jet[] speeds = getJets();
		Jet minSpeed = speeds[0];
		for (Jet jet : speeds) {
			jet.getSpeed();
			System.out.println(jet.getSpeed());
		
				 
			}
		}

	}

}
