import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio5 {


    //Escriba una función que halle el área de un círculo de acuerdo con la siguiente fórmula: 𝐴 = 𝜋𝑟^2;
    static double hallarAreaCirculo(double radio) {

        double PI = Math.PI;
        double radioElevadoAlCuadrado = Math.pow(radio,2);
        double areaCirulo = PI * radioElevadoAlCuadrado;

        return areaCirulo;
    }

    static double areaCoronaCircular(double radioCirculoPequeño, double radioCirculoGrande) {

       double circuloPequeño = hallarAreaCirculo(radioCirculoPequeño);
       double circuloGrande = hallarAreaCirculo(radioCirculoGrande);

       return circuloGrande-circuloPequeño;

    }

    public static void main(String[] args) {
        //Instanciamos scanner
        Scanner scanner = new Scanner(System.in);

        //Se solicita el radio del circulo pequeño
        System.out.println("Ingrese el radio en metros de el circulo pequeño: ");
        double radioCirculoPequeño = scanner.nextDouble();

        //Se solicita el radio del circulo grande
        System.out.println("Ingrese el radio en metros de el circulo grande: ");
        double radioCirculoGrande = scanner.nextDouble();

        //Validacion
        if(radioCirculoPequeño == radioCirculoGrande){
            System.out.println("Lo siento los valores de no deben ser iguales.");
        }else if (radioCirculoPequeño > radioCirculoGrande){
            System.out.println("Lo siento el valor del circulo pequeño es mayor que el del circulo grande");
        }else if(radioCirculoGrande < radioCirculoPequeño){
            System.out.println("Lo siento el valor del circulo grande es menor que el del circulo pequeño");
        }else{
             double resultado = areaCoronaCircular(radioCirculoPequeño,radioCirculoGrande);
            System.out.println("El area de la corona es: " + resultado + "m^2");
        }

    }


}