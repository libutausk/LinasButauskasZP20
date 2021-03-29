import java.util.Scanner;

public class Uzdavinys06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite kiek dienų Jonas mokosi anglų kalbos: ");
		int n = reader.nextInt();

		int kiekMin = 0; // Kintamasis, kuriame kaupsime minutes

		for (int i = 0; i < n; i++) { // Ciklas kartosis pagal įvestą N dienų skaičių
			System.out.println("Įveskite periodo pradžios h: ");
			int aVal = reader.nextInt();
			System.out.println("Įveskite periodo pradžios min: ");
			int aMin = reader.nextInt();
			System.out.println("Įveskite periodo pabaigos h: ");
			int bVal = reader.nextInt();
			System.out.println("Įveskite periodo pabaigos min: ");
			int bMin = reader.nextInt();

			kiekMin += gautiTrukmeMinutemis(aVal, aMin, bVal, bMin); // Sumuojame minutes
		}
		reader.close();
		System.out.println("Jonas per " + n + " dienas anglų kalbos mokėsi " + kiekMin + " min.");
		gautiLaikoFormata(2, 50);
	}

	// Metodas išvedantis laiko formatą su VAL ir MIN.
	private static void gautiLaikoFormata(int i, int j) {
		System.out.println(i + " val. " + j + " min.");
	}

	// Metodas išvedantis mokymosi trukmę minutėmis
	private static int gautiTrukmeMinutemis(int aVal, int aMin, int bVal, int bMin) {
		return (bVal * 60 + bMin) - (aVal * 60 + aMin);
	}
}
