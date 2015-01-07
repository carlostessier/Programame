package Otros;


public class Factorial {

	static java.util.Scanner in;

	public static long factorial(int a, int c) {
		long fact = 1;

		if (a == 0 || a == 1)
			return 0;

		for (int i = c; i < a; i++) {
			fact *= (a - i);
		}

		return fact;

	}

	public static boolean casoDePrueba() {
		int a, b;

		try {
			if (!in.hasNext())
				return false;
		//	a = in.nextInt();
		//	b = in.nextInt();

			System.out.println(factorial(1,2));

		} catch (Exception e) {
			System.out.println(0);
		}

		return true;

	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
		// System.out.println(factorial(5));
	}

}
