import java.util.Scanner;

public class Ejercicio10 {
    static int calcular(int numero1, int numero2, String operador){
        int resultado = 0;
        switch (operador){
            case "*":
                resultado = numero1*numero2;
               break;
            case "+":
                resultado = numero1+numero2;
                break;
            case "-":
                resultado = numero1-numero2;
                break;
            case "/":
                resultado = numero1/numero2;
                break;
            case "%":
                resultado = numero1%numero2;
                break;
            case "**":
                System.out.println("No es posible una operación con está asignación");
                break;
            default:
                System.out.println("Por favor ingrese un operador valido.");

        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el operador");
        String operador = scanner.next();
        int response = calcular(numero1, numero2, operador);
        System.out.println("La respuesta es :" + response);
    }
}
