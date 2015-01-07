package Programame.Plantillas;

class Main {

static java.util.Scanner in;

public static void casoDePrueba() {
    
    int a, b;
    a = in.nextInt();
    b = in.nextInt();

    System.out.println(a + b);

}

public static void main(String[] args) {

    in = new java.util.Scanner(System.in);


    casoDePrueba() ;
}

}
