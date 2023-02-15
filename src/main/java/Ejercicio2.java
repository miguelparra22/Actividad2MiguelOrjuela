import java.util.Scanner;

public class Ejercicio2 {


    static int cantidadDeBuses(int estudiantesGordos, int estudiantesFlacos, int puestos){
        int busesNecesitados = (int) Math.ceil((estudiantesGordos * 2 + estudiantesFlacos) / (double) puestos);
        return busesNecesitados;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de estudiantes gordos");
        int gordos = scanner.nextInt();
        System.out.println("Ingrese cantidad de estudiantes flacos");
        int flacos = scanner.nextInt();
        System.out.println("Ingrse cantidad de sillas del bus");
        int sillas = scanner.nextInt();

        int resultado = cantidadDeBuses(gordos,flacos,sillas);
        System.out.println("La cantidad de buses necesarios son: " + resultado);
    }
}
