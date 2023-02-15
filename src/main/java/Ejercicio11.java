import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio11 {

    //Primero, escriba una función que tome un número entero de dos cifras y retorne la cifra de las decenas de
    //ese número.
    static int findTens(int number){
        LinkedList<Integer> numbers = new LinkedList<Integer>();
            String newNumber = String.valueOf(number);
            if(newNumber.length() == 2){
                String[] stringsDigits = newNumber.split("(?<=.)");

                for (int i = 0; i < stringsDigits.length; i++){
                    numbers.add(Integer.parseInt(stringsDigits[i]));
                }

                int ten = numbers.getFirst();
                return ten;
            }

            return 0;

    }

    static int findUnits(int number){
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        String newNumber = String.valueOf(number);
        if(newNumber.length() == 2){
            String[] stringsDigits = newNumber.split("(?<=.)");

            for (int i = 0; i < stringsDigits.length; i++){
                numbers.add(Integer.parseInt(stringsDigits[i]));
            }

            int unit = numbers.getLast();
            return unit;
        }

        return 0;
    }

     static String romanUnits(int number){
        String romanNumber = "";
        String romanUnity = "I";
        String romanFive = "V";
        String romanX = "X";

         if(number < 4){
             for (int i = 1; i <= number; i++){
                  romanNumber += romanUnity;
             }
         } else if ( number == 4) {
              romanNumber = romanUnity+romanFive;
         } else if (number == 5) {
             romanNumber = romanFive;
         } else if (number > 5) {
             romanNumber = romanNumber + romanFive;
             for (int i = 6; i <= number; i++ ){
                  romanNumber += romanUnity;
             }
         }else if(number == 9){
             romanNumber = romanUnity + romanX;
         }

         return romanNumber;

    }

    static String decenaRomano(int number){
        String romanNumber = "";
        String ten = "X";
        String fifty = "L";
        String oneHundred = "C";

        if(number < 4){
            for (int i = 1; i <= number; i++){
                romanNumber += ten;
            }
        } else if ( number == 4) {
            romanNumber = ten+fifty;
        } else if (number == 5) {
            romanNumber = fifty;
        } else if (number > 5) {
            romanNumber = romanNumber + fifty;
            for (int i = 6; i <= number; i++ ){
                romanNumber += ten;
            }
        }else if(number == 9){
            romanNumber = ten + oneHundred;
        }

        return romanNumber;
    }


    static String getRomanNumber(int number){
        String romanNumber = "";
        int tenNumber = findTens(number);
        int unitNumber = findUnits(number);
        String unitRomanNumber = romanUnits(unitNumber);
        String tenRomanNumber = decenaRomano(tenNumber);
        romanNumber =  tenRomanNumber +unitRomanNumber;
        return romanNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int number = scanner.nextInt();
        if(number > 99){
            System.err.println("Asegurate que sea un número de dos cifras. ");
        }else if(number < 10){
            System.out.println("El número romano es: " + romanUnits(number));
        }
        else{
            System.out.println("El número romano es: " + getRomanNumber(number));
        }


    }

}
