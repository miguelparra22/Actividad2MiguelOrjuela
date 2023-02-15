import java.util.Scanner;

public class Ejercicio9 {

    static int  NumeroMayor(int numero1, int numero2){
        if (numero1 > numero2 ){
            return numero1;
        }else{
            return numero2;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa el primer numero ");
        int numero1 = scanner.nextInt();
        System.out.println("Por favor ingresa el segundo numero ");
        int numero2 = scanner.nextInt();
        int numeroMayor = NumeroMayor(numero1,numero2);

        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
