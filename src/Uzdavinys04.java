import java.util.Scanner;

public class Uzdavinys04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int shirts = 0; // Kintamasis, kuriame kaupsime reikalingą marškinėlių skaičių

		System.out.println("Įveskite intervalo pradžią: ");
		int a = reader.nextInt();
		System.out.println("Įveskite intervalo pabaigą: ");
		int b = reader.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 6 == 0) { // Jeigu skaičius dalinas iš 6 - sumuojam marškinėlius
				shirts++;
			}
			reader.close();
		}
		System.out.println("Reikalingų marškinėlių skaičius: " + shirts);
	}
}
