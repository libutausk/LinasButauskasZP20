import java.util.Scanner;

public class Uzdavinys03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Įveskite intervalo pradžią: ");
		int a = reader.nextInt();
		System.out.println("Įveskite intervalo pabaigą: ");
		int b = reader.nextInt();

		for (int i = a; i >= b; i = i - 3) { // Kadangi reikia apskaičiuoti nuo -100 iki -199 parašiau i >= b ir i = i - 3
			System.out.println(i);
			reader.close();
		}
	}
}