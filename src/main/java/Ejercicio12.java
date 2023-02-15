import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {

    public static String dayOfWeek(String day) {

        String[] arreglo = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo"};

        for (int x = 0; x < arreglo.length; x++) {
                if(arreglo.equals("domingo")){
                    return arreglo[0];
                } else {
                    if (arreglo[x].equals(day)) {

                        try{
                            return arreglo[x+1];
                        }catch (Exception e){
                            return arreglo[0];
                        }

                    }
                }


        }

        return "No existe";
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día");
        String  day = scanner.next().toLowerCase();
        String posicionDeElementoBuscado = dayOfWeek(day);
        System.out.println(posicionDeElementoBuscado);
    }
}
