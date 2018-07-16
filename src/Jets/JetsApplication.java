package Jets;

import java.util.Scanner;

public class JetsApplication {
	Airfield af = new Airfield();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.displayUserMenu();

	}

	public void displayUserMenu() {

		Scanner sc = new Scanner(System.in);

		int choice = 0;

		System.out.println("Jet Menu");
		while (choice != 8) {
			Jet[] jets = af.getJets();

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
				af.calculateFlyTime();
				pickAgain();
				break;
			case 3:
				System.out.println("____________________________");
				af.getFastestJet();
				pickAgain();
				break;
			case 4:
				System.out.println("____________________________");
				af.getLongestRange();
				break;
			case 5:
				System.out.println("____________________________");
				af.loadCargo();
				pickAgain();
				break;
			case 6:
				System.out.println("____________________________");
				af.dogFight();
				pickAgain();
				break;
			case 7:
				System.out.println("____________________________");
				af.addJet(sc);
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

}
