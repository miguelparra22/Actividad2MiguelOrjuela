import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {


    static double distanciaEntrePuntos(double x1, double y1, double x2, double y2){
        double punto1 = Math.pow(y2-y1,2);
        double punto2 = Math.pow(x2-x1,2);
        double sumaPuntos = punto1 + punto2;
        return Math.sqrt(sumaPuntos);
    }
    static  double pendienteRecta(double x1, double x2, double y1, double y2){
        return  (y2-y1) / (x2-x1);
    }
    static void puntoMedio(double x1, double x2, double y1, double y2){
        double puntoMedioX = (x1 + x2) / 2;
        double puntoMedioY = (y1 + y2) / 2;
        double[] puntosMedios = {puntoMedioX, puntoMedioY};
        System.out.println("El punto medio de x es: " + puntosMedios[0]);
        System.out.println("El punto medio de y es: " + puntosMedios[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cordenada x1 ");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese cordenada x2 ");
        double x2 = scanner.nextDouble();
        System.out.println("Ingrese cordenada y2 ");
        double y1 = scanner.nextDouble();
        System.out.println("Ingrese cordenada y1 ");
        double y2 = scanner.nextDouble();
        double distanciaEntrePuntos = distanciaEntrePuntos(x1,y1,x2,y2);
        System.out.println("La distancia entre los puntos es: " + distanciaEntrePuntos );
        double pendiente = pendienteRecta(x1,x2,y1,y2);
        System.out.println("La pendiente es: " + pendiente);
        puntoMedio(x1,x2,y1,y2);



    }
}
