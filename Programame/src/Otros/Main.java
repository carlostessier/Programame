package Otros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	/*
	Your task is to find the intersection of two sets of positive integers.
	Input The input consists of two sets of positive integers A={a1, a2, ..., an} and B={b1, b2, ..., bk} represented as two whitespace-separated lists of numbers. 
	Each list ends with -1, that serves as an end-of-set marker. 
	Repetitions of elements are possible in the input, but not in the output. 
	You may assume that 0 < ai, bi < 106 and that the sets A and B are of size less than 1000.

	Output is list of numbers or word "empty" if intersection is empty.

	Input#1
	6 7 8 1 2 3 -1
	4 3 2 1 1 -1
	Output#1
	1 2 3
	Input#2
	1 2 3 -1
	4 4 5 5 6 6 -1
	Output#2
	empty

*/

	static java.util.Scanner in;

	public static void casoDePrueba() {
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();		
		
		Integer numero;

		numero = in.nextInt();
		a.add(numero);
		while (numero!=-1) {
			numero = in.nextInt();
			a.add(numero);
		}

		a.remove(-1);
		
		numero = in.nextInt();
		b.add(numero);
		while (numero!=-1) {
			numero = in.nextInt();
			b.add(numero);
		}
		
		b.remove(-1);
		
		Set<Integer> interseccion = new HashSet<Integer>(a);
		interseccion.retainAll(b);
		
		for(Integer num: interseccion)
			System.out.print(num+" ");
		
		if (interseccion.size()==0) System.out.println("empty");

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		/*
		 * int numCasos ; numCasos = in.nextInt(); for(int i=0;i<numCasos;i++
		 */
		casoDePrueba();
	}

}
