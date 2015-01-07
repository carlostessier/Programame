package Por3oMas5;

import java.util.Collections;

public class Main {

	static java.util.Scanner in;
	// static String sol;

	static final int MAX = 20000;
	static final int NIVEL = 10;

	static java.util.ArrayList<Integer> sol;
	static java.util.Map<Integer, String> mapSol;

	public static java.util.Map<Integer, String> calculaMap() {

		java.util.ArrayList<Integer> lista = new java.util.ArrayList<Integer>();
		java.util.Map<Integer, String> mapSolParcial = new java.util.TreeMap<Integer, String>();

		mapSolParcial.put(1, "1");
		lista.add(1);

		for (int i = 1; i < NIVEL; i++) {
			calcularMapSolParcial(mapSolParcial, lista);
		}

		return mapSolParcial;

	}

	public static java.util.ArrayList<Integer> calcula() {

		// java.util.Set<Integer> sol = new java.util.HashSet<Integer>();
		java.util.ArrayList<Integer> solParcial = new java.util.ArrayList<Integer>();
		java.util.ArrayList<Integer> lista = new java.util.ArrayList<Integer>();

		solParcial.add(1);
		lista.add(1);

		for (int i = 1; i < NIVEL; i++) {
			calcularSolParcial(solParcial, lista);

		}

		Collections.sort(solParcial);
		/*
		 * for(int i=0; i< sol.size(); i++)
		 * System.out.println(i+":"+sol.get(i));
		 */

		// sol.addAll(solParcial);

		return solParcial;

	}

	private static void calcularMapSolParcial(
			java.util.Map<Integer, String> solParcial,
			java.util.ArrayList<Integer> lista) {

		java.util.ArrayList<Integer> listaAux = new java.util.ArrayList<Integer>();
		int aux;
		String ope = "";
		while (!lista.isEmpty()) {
			aux = lista.remove(0);
			// System.out.print(aux+" ");
			if (!solParcial.containsKey(aux+5)) {
				listaAux.add(aux+5);
				ope = "(" + solParcial.get(aux) + "+5)";
				solParcial.put(aux+5, ope);
			}
			if (!solParcial.containsKey(aux * 3)) {
				listaAux.add(aux * 3);
				ope = solParcial.get(aux) + "*3";
				solParcial.put(aux*3, ope);
			}

		}
		lista.addAll(listaAux);
		// System.out.println();

	}

	private static void calcularSolParcial(
			java.util.ArrayList<Integer> solParcial,
			java.util.ArrayList<Integer> lista) {

		java.util.ArrayList<Integer> listaAux = new java.util.ArrayList<Integer>();
		int aux;
		while (!lista.isEmpty()) {
			aux = lista.remove(0);
			// System.out.print(aux+" ");
			calcular(solParcial, listaAux, aux * 3);
			calcular(solParcial, listaAux, aux + 5);

		}
		lista.addAll(listaAux);
		// System.out.println();

	}

	private static void calcular(java.util.ArrayList<Integer> solParcial,
			java.util.ArrayList<Integer> listaAux, int aux) {
		if (!solParcial.contains(aux)) {
			listaAux.add(aux);
			solParcial.add(aux);
		}
	}

	public static boolean resuelve(int num) {
		return sol.contains(num);
	}

	/*
	 * public static void resuelveBT(int num, int solParc, String ope) {
	 * 
	 * //System.out.println(ope+"="+solParc);
	 * 
	 * if (num == solParc) {
	 * 
	 * sol = "SI"; return; }
	 * 
	 * if(num<solParc) return; // return true; // para devolver una única
	 * solución
	 * 
	 * if (factible(num,solParc*3)) resuelveBT(num,solParc*3,ope+" * 3"); if
	 * (factible(num,solParc+5)) resuelveBT(num,solParc+5,ope+" + 5");
	 * 
	 * return;
	 * 
	 * }
	 */
	public static boolean casosDePrueba() {

		String sNumero;
		int numero;

		/*
		 * if (!in.hasNext()) return false;
		 */
		try {

			sNumero = in.nextLine();
			numero = Integer.parseInt(sNumero);

			if (numero == 0)
				return false;
			/*
			 * sol = "NO"; resuelve(numero,1,"1 "); System.out.println(sol);
			 */
			if (numero < 1 || numero > MAX)
				throw new Exception();

			if (resuelve(numero))
				System.out.println("SI");
			else
				System.out.println("NO");

		} catch (Exception e) {

			return false;
		}

		return true;

	}

	public static void main(String args[]) {

		in = new java.util.Scanner(System.in);

		sol = calcula();
		/*
		mapSol = calculaMap();

		java.util.Iterator it = mapSol.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: "
					+ mapSol.get(key));
		}
*/
		while (casosDePrueba())
			;

	}
}
