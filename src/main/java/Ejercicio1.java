import java.util.Scanner;

/*
*
* Escriba una función o método estatico y luego un programa que use esa funcion, que encuentre
* el valor de la siguiente función: f(x,y) = 𝑥^2 + 2𝑥𝑦 + 𝑦^2
* */
public class Ejercicio1 {
    static int funcionAlgebraica(int x,int y){
        //Usamos Math pow para elevar al cuadrado
        //Se divide la ecuacion entre expresiones
        int firstTerm = (int) Math.pow(x,2);
        int secondTerm = 2*x*y;
        int ThirdTerm = (int) Math.pow(y,2);
        int result = firstTerm+secondTerm+ThirdTerm;
        return result;
    }

    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        int x,y,result;
        System.out.println("Ingresa el valor de x");
        x = scann.nextInt();
        System.out.println("Ingrese el valor de y");
        y = scann.nextInt();

        result = funcionAlgebraica(x,y);
        System.out.println("El resultado es: " + result);
    }
}
