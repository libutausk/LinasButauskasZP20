import java.util.Scanner;

public class Uzdavinys02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite dėžių skaičių: ");
		int d = reader.nextInt();
		System.out.println("Įveskite knygų skaičių: ");
		int k = reader.nextInt();
		System.out.println("Įveskite, kelios knygos telpa į dėžę: ");
		int n = reader.nextInt();

		int deziuSk = d * n; // Apskaičiuojame kiek knygų galime sutalpinti į turimas dėžes;

		if (deziuSk >= k) { // Jeigu turimas dežių skaičius yra didesnis arba lygus nei reikiamas;
			System.out.println("Knygos telpa į dėžes.");
		} else {
			System.out.println("Knygos netelpa į dėžes.");
			System.out.println("Į dėžes netilpo: " + (k - deziuSk)); // Apskaičiuojame kiek knygų netilpo
		}
		reader.close();
	}

}
