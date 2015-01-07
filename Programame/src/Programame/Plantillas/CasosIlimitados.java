package Programame.Plantillas;

public class CasosIlimitados {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n;
		n = in.nextInt();
		if(!in.hasNext())
			return false;
		if ((n % 2) == 0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		
		return true;

	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while ( casoDePrueba ());

	}

}

