package Otros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author vensiere Uv3iKht
 *
 */
public class Eljudge01 {
	/* 
	 * Find the maximum element in a set of integers. List of integers ends with
	 * EOF. Intergers are separated by whitespace characters (SPACE, TAB,
	 * NEWLINE). There are at most 10000 integers in the list, their modulii
	 * being less than 230.
	 * 
	 * Input#1 1 2 3 4 5 1 Output#1 5
	 * 
	 * Input#2 23 100 1000 12 34 45 Output#2 1000
	 */

	static java.util.Scanner in;

	public static void casoDePrueba() {
		List<Integer> l = new ArrayList<Integer>();

		while (in.hasNext()) {
			l.add(in.nextInt());
		}

		Collections.sort(l);

		System.out.println(l.remove(l.size() - 1));

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		/*
		 * int numCasos ; numCasos = in.nextInt(); for(int i=0;i<numCasos;i++
		 */
		casoDePrueba();
	}

}
