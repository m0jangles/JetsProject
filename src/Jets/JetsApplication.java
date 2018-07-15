package Jets;

import java.util.Scanner;

public class JetsApplication {
	Airfield af = new Airfield();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.displayUserMenu();

	}

	public void launch() {

	}

	public void displayUserMenu() {

//		Airfield af = new Airfield();
		Scanner sc = new Scanner(System.in);

		CargoPlane cb = new CargoPlane("C17", 500, 6456, (long) 218000000);
		FighterJet fj = new FighterJet("F22", 1522, 1600, (long) 339000000);
		HipHopPlane hhp = new HipHopPlane("Missy", 45, 600, (long) 899);
		CargoPlane cp = new CargoPlane("C130", 45, 600, (long) 11900000);
		FighterJet ff = new FighterJet("F35", 1200, 1367, (long) 94600000);

		af.addJet(cb);
		af.addJet(fj);
		af.addJet(hhp);
		af.addJet(cp);
		af.addJet(ff);

		Jet[] jets = af.getJets();

		int choice = 0;

		System.out.println("Jet Menu");
		while (choice != 8) {

			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Quit!");
			System.out.print("\nYour choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("____________________________");
				System.out.println(jets.length);

				for (Jet jet : jets) {
					jet.displayData();
				}
				pickAgain();
				break;
			case 2:
				System.out.println("____________________________");
				for (Jet jet : jets) {
					jet.fly();
				}
				pickAgain();
				break;
			case 3:
				System.out.println("____________________________");
//				af.getFastestJet();
				pickAgain();
				break;
			case 4:
//				view jet with longest range
				break;
			case 5:
				System.out.println("____________________________");
				cp.loadCargo();
				cb.loadCargo();
				pickAgain();
				break;
			case 6:
				System.out.println("____________________________");
//			Dogfight!
				pickAgain();
				break;
			case 7:
				System.out.println("____________________________");
				addJet(sc);
				pickAgain();
				break;
			case 8:
				System.out.println("____________________________");
				System.exit(0);
				break;
			default:
				System.out.println("____________________________");
				System.out.println("INVALID ENTRY");
				pickAgain();
				break;

			}

		}
	}

	public void pickAgain() {
		System.out.println("____________________________");
		System.out.println();
		System.out.println("Pick something else");
		System.out.println("____________________________");
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
		Jet jet = new JetImpl(model, speed, range, price);
//		Airfield af = new Airfield();
		af.addJet(jet);
	}
}


