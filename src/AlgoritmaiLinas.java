
public class AlgoritmaiLinas {

	//Metodas PRINT
	public static void print(int[] array) {
		System.out.print("["); //Pradžioje laužtinis skliaustas
		for (int i = 0; i < array.length; ++i) {
			if (i == 0) { //Pirmąją reikšmę atspausdinam be kablelio
				System.out.print(array[0]);
			} else { //Toliau spausdinsim su kableliais
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]"); //Pabaigoje laužtinis skliaustas
	}

	//Metodas EQUALS
	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length != array2.length) { //Pradioje palyginam masyvų ilgį
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) //Toliau lyginam masyvų reikšmes
				return false;
		}
		return true;
	}
}
