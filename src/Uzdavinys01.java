import java.util.Scanner;

public class Uzdavinys01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Kiek pamokų yra pirmadienį?");
		int pirm = reader.nextInt();
		System.out.println("Kiek pamokų yra antradienį?");
		int antr = reader.nextInt();
		System.out.println("Kiek pamokų yra trečiadienį?");
		int trec = reader.nextInt();
		System.out.println("Kiek pamokų yra ketvirtadienį?");
		int ketv = reader.nextInt();
		System.out.println("Kiek pamokų yra penktadienį?");
		int penkt = reader.nextInt();

		int pamokuSk = pirm + antr + trec + ketv + penkt; // Apskaičiuojame pamoku skaičių

		System.out.println("Pamokų skaičius per savaitę: " + pamokuSk);
		System.out.println("Tai sudaro minučių: " + pamokuSk * 45); // Pamokų skaičių konvertuojame į minutes
		reader.close();
	}
}
