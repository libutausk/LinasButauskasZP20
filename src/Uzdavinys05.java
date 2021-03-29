import java.util.Scanner;

public class Uzdavinys05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite pirmojo vairavimo rezultatą: ");
		int p1 = reader.nextInt();
		System.out.println("Įveskite antrojo vairavimo rezultatą: ");
		int p2 = reader.nextInt();
		System.out.println("Įveskite trečiojo vairavimo rezultatą: ");
		int p3 = reader.nextInt();
		reader.close();

		System.out.println("Rezultatas: " + gautiGeriausiIvertinima(p1, p2, p3));
	}

	// Metodas grąžinantis maksimalų įvertinimą
	private static int gautiGeriausiIvertinima(int p1, int p2, int p3) {
		return Math.max(p1, Math.max(p2, p3));
	}
}
