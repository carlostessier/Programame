package Saltos;

public class Main {

	static java.util.Scanner in;
	
	final static int NUM_JUECES = 7;
	final static float FACTOR_DIFICULTAD = 2.0f;
	static java.util.ArrayList<Float> votos ;



	public static boolean casosDePrueba() {

	    float nota = 0.0f;

		votos = new java.util.ArrayList<Float>() ;
		 if (!in.hasNext()) return false;
		 
		try {

			for(int i=0; i<NUM_JUECES; i++)
				votos.add(in.nextFloat());
	
			java.util.Collections.sort(votos);

		} catch (Exception e) {

			return false;
		}

		nota = (votos.get(2)+ votos.get(3)+ votos.get(4) ) * FACTOR_DIFICULTAD;
		
		System.out.println((int)nota);
		
		return true;

	}

	public static void main(String args[]) {

		in = new java.util.Scanner(System.in);

		while (casosDePrueba())
			;
		
		

	}
}
