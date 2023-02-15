import java.util.Scanner;

public class Ejercicio8 {
    /*
    *  Datos de entrada = cantidad de estudiantes, capacidad salon y numero salones
    * */

    static void getClassRooms(int students, int classRoomCapacity, int classRoomForFloor){
       int capacityForFloor = classRoomForFloor * classRoomCapacity;
       int numberFloors = (int) Math.ceil((students/ (double) capacityForFloor));
       int numberClassRooms = numberFloors * classRoomForFloor;

        int[] data = {numberFloors, numberClassRooms};

        System.out.println("El número de pisos es:  " + data[0]);
        System.out.println("El número de salones  es: " + data[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de estudiantes que tiene la universidad: ");
        int students = scanner.nextInt();
        System.out.println("Ingrese la capacidad del salon");
        int capacityClassRoom = scanner.nextInt();
        System.out.println("Ingrese cantidad de salones por piso: ");
        int numberClassRooms = scanner.nextInt();

        getClassRooms(students,capacityClassRoom,numberClassRooms);
    }
}
