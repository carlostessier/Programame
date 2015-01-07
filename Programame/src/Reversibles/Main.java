package Reversibles;

public class Main {

	static java.util.Scanner in;

	public static boolean casosDePrueba() {

		String sNumero;
		int numero, reverso;
		int suma;

		/*
		 * if (!in.hasNext()) return false;
		 */
		try {

			sNumero = in.nextLine();

		

			numero = Integer.parseInt(sNumero);
			
			if (numero == 0)
				return false;
			
			reverso = invertir(numero);

			if (sNumero.length() != contarDigitos(reverso)) {
				// System.out.println(numero+"-"+reverso);
				System.out.println("NO");
				return true;
			}

			suma = numero + reverso;

			// System.out.println(numero+"-"+reverso+":"+suma);

			if (sonTodosImpares(suma))
				System.out.println("SI");
			else
				System.out.println("NO");

		} catch (Exception e) {

			return false;
		}

		return true;

	}

	private static boolean sonTodosImpares(int n) {

		while (n != 0) {
			if (!esImpar(n))
				return false;
			n /= 10;

		}
		return true;
	}

	private static int contarDigitos(int n) {
		int numDigitos = 0;
		while (n != 0) {
			n /= 10;
			++numDigitos;
		}
		return numDigitos;
	}

	private static boolean esImpar(int digito) {
		return (digito % 2 != 0);
	}

	private static int invertir(int n) {
		int invertido = 0;

		while (n != 0) {
			invertido *= 10;
			invertido += +n % 10;
			n = n / 10;
		}

		return invertido;
	}

	public static void main(String args[]) {

		in = new java.util.Scanner(System.in);

		while (casosDePrueba())
			;

	}
}
