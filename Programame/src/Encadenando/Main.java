package Encadenando;

public class Main {

	static java.util.Scanner in;

	public static boolean casosDePrueba() {

		// java.util.ArrayList<String> palabras = new
		// java.util.ArrayList<String>();

		String palabras;
		java.util.StringTokenizer STpalabras;

		if (!in.hasNext())
			return false;

		try {

			palabras = in.nextLine();
			STpalabras = new java.util.StringTokenizer(palabras);

			System.out.println(encadenan(STpalabras));

		} catch (Exception e) {

			return false;
		}

		return true;

	}

	private static String encadenan(java.util.StringTokenizer STpalabras) {
		String pal1 , pal2;
		
	
		
		if (STpalabras.countTokens() == 1)
			return "SI";
	
		
		pal1 = STpalabras.nextToken();
		
		while (STpalabras.hasMoreTokens()) {
			pal2 = STpalabras.nextToken();
			if(!encadenanPal(pal1, pal2))
					return "NO"; ;
			pal1 = pal2;
		}
	
			return "SI";
		
	}

	private static boolean encadenanPal(String pal1, String pal2) {
	
		String sil1;
		String sil2;
		
		sil2 = pal2.substring(0, 2);
		sil1 = pal1.substring(pal1.length() - 2, pal1.length());
		
		return (sil1.equals(sil2));
			
	}

	public static void main(String args[]) {

		in = new java.util.Scanner(System.in);

		while (casosDePrueba())
			;

	}
}
