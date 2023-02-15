import java.util.Scanner;

public class Ejercicio13 {

    static int salaryIncrease(int salary){
        int newSalary ;
        if(salary <= 800000){
             newSalary = (int) Math.ceil(salary * (1 + 0.10));
        } else if ( salary > 800000 && salary <= 1200000) {
             newSalary = (int) Math.ceil(salary * (1 + 0.08));
        }else{
             newSalary = (int) Math.ceil(salary * (1 + 0.05));
        }

        return newSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo actual, sin puntos");
        int salary = scanner.nextInt();
        if(salary <= 800000){
            System.out.println("Felicidades tuvo un aumento del 10%");
            System.out.println("Su nuevo sueldo es: " + salaryIncrease(salary));
        } else if ( salary > 800000 && salary <= 1200000) {
            System.out.println("Felicidades tuvo un aumento del 8%");
            System.out.println("Su nuevo sueldo es: " + salaryIncrease(salary));
        }else{
            System.out.println("Felicidades tuvo un aumento del 5%");
            System.out.println("Su nuevo sueldo es: " + salaryIncrease(salary));
        }
    }
}
