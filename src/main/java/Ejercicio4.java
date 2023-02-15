import java.util.Scanner;

public class Ejercicio4 {

    static void calcularSueldo(double sueldo){
        double arriendo = 0.40 * sueldo;
        double comida = 0.15 * sueldo;
        double sobrante = sueldo - (arriendo + comida);

       double[] balance = {arriendo, comida, sobrante};
        System.out.println("El gasto en arriendo es:  " + balance[0]);
        System.out.println("El gasto en comida es: " + balance[1]);
        System.out.println("El restante es: " + balance[2]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        double sueldo = scanner.nextDouble();
        calcularSueldo(sueldo);
    }
}
