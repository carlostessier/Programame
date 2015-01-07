package ProblemasRico;

public class Main {

	static java.util.Scanner in;

	public static void casosDePrueba() {

		
		int numPeceras, capacidad, diferencia, total;

		try {			

			numPeceras = in.nextInt();
			capacidad = in.nextInt();
			diferencia = in.nextInt();

			total = calcularCapacidad(numPeceras, capacidad, diferencia);

		} catch (Exception e) {
			
			return;
		}

		System.out.println(total);

	}

	private static int calcularCapacidad(int numPeceras, int capacidad,
			int diferencia) {		
		int total, diferenciaAcumulada;
		total = capacidad;
		diferenciaAcumulada = diferencia;
		
		for (int i = 1; i < numPeceras; i++) {
			total += capacidad - diferenciaAcumulada;
			diferenciaAcumulada += diferencia;		

		}
	
		return total;
	}

	public static void main(String args[]) {

		in = new java.util.Scanner(System.in);

		int numCasos =  in.nextInt();

		for (int i = 0; i < numCasos; i++){
			
			casosDePrueba();
		}

	}
}
