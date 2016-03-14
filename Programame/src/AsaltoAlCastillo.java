
public class Main {

	static java.util.Scanner in;
	static int grupos;

	static boolean procesa() {
		int soldados = in.nextInt();
		boolean fin = soldados != 0;
		grupos = 2;
		if (soldados == 1)
			System.out.println(1);

		else if (fin) {
			for (int i = 2; i <= Math.sqrt(soldados); i++) {
				if (soldados % i == 0) {
					if (i == Math.sqrt(soldados))
						grupos++;
					else
						grupos += 2;
				}

			}
			if (soldados > 1) {
				System.out.println(grupos);
			}

		}
		return fin;
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (procesa())
			;
	}

}
