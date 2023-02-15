import java.util.Scanner;

public class Ejercicio3 {
    /*
    * Datos de entrada angulo y altura
    *
    * */

    static double longitudEscalera(double x, double a){
        double sinOfa = Math.sin(a);
        return x/sinOfa;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera en metros");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el ángulo");
        double angulo = scanner.nextDouble();

        double response = longitudEscalera(altura,angulo);
        System.out.println( "La longitud de la escalera es: " + response + "m");
    }
}
