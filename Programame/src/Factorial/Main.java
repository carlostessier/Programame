package Factorial;

public class Main {

	static java.util.Scanner in;

	public static boolean casosDePrueba() {

		int num, den;

		/*
		 * if (!in.hasNext()) return false;
		 */
		try {
			num = in.nextInt();
			den = in.nextInt();
		} catch (Exception e) {
			return false;
		}

		if (noProcesa(num, den))
			return false;

		System.out.println(divisionFactoriales(num, den));

		return true;

	}

	private static boolean noProcesa(int num, int den) {
		return num < den;
	}

	private static long divisionFactoriales(int num, int den) {

		long division;

		division = 1;

		for (int i = den + 1; i < num + 1; i++) {

			division *= i;
		}
		return division;
	}

	public static void main(String args[]) {

		in = new java.util.Scanner(System.in);

		while (casosDePrueba())
			;

	}
}
