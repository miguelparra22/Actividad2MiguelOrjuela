import java.util.Scanner;

public class Ejercicio6 {

    //Escriba una función que halle el área de un rectángulo a partir de su base y su altura
    static double areaRectangulo(double ladoA, double ladoB){
        return ladoA * ladoB;
    }


    //Escriba una función que halle la hipotenusa de un triángulo rectángulo a partir de los catetos del triángulo.
    static  double hallarHipotenusa(double cateto1, double cateto2){
        return Math.ceil(Math.pow(cateto1,2) + Math.pow(cateto2,2));
    }

    //Encuentre el área de un triángulo a partir de su base y su altura
    static double areaTriangulo(double ladoA, double ladoB){
        return (ladoA * ladoB)/2;
    }

    static double perimetroFigura(double ladoA, double ladoB, double ladoC){
        //en la funcion enviaremos como parametro la base y altura de la figura.
        double alturaFigura = ladoA - ladoC;
        double hipotenusaFigura = hallarHipotenusa(alturaFigura,ladoC);
        return ladoA + ladoB + ladoC + hipotenusaFigura;
    }

    static double areaFigura( double ladoA, double ladoB, double ladoC){
        double alturaFigura = ladoA - ladoC;
        double area1 = areaTriangulo(alturaFigura,ladoB);
        double area2 = areaRectangulo(ladoB,ladoC);
        return area1+area2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado A");
        double ladoA = scanner.nextDouble();
        System.out.println("Ingrese el lado B");
        double ladoB = scanner.nextDouble();
        System.out.println("Ingrese el lado C");
        double ladoC = scanner.nextDouble();

        double perimetro = perimetroFigura(ladoA,ladoB, ladoC);
        System.out.println("El perimetro es: " + perimetro);

        double area = areaFigura(ladoA, ladoB , ladoC);
        System.out.println("El area es: " + area);


    }
}
