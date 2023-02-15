import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {





    static int mayorEdad(List<Integer> edades){

        int edad = edades.get(0);

        for (int x =0; x < edades.size(); x++){
            edades.get(x);
            int edadActual = edad;
            if(edadActual > edad){
                edad = edadActual;
            }
        }

        return edad;
    }

    static void nombreHermanoMayor(List<Hermanos> Hermanos, int age){
        List<Hermanos> listaHermanos = Hermanos;
        String hermanoMayor = "";
        for (int x =0; x < listaHermanos.size(); x++){
            Hermanos nombreHermano = listaHermanos.get(x);
            if(nombreHermano.edad == age){
                System.out.println("El hermano mayor es " + nombreHermano.name +" con "+ nombreHermano.edad);
            }
        }
    }




    public static void main(String[] args) {

        List<Hermanos> listaHermanos = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();
        int[] edadesList = {};
        Scanner scanner = new Scanner(System.in);
        int[] ages = {};
        int contador = 0;

        while (contador < 3){
            //Tomar datos
            System.out.println("Ingresa el nombre");
            String name = scanner.next();
            System.out.println("Ingresa la edad");
            int age = scanner.nextInt();
            listaHermanos.add(new Hermanos(name,age));
            contador++;
        }

        for (int x =0; x < listaHermanos.size(); x++){
            Hermanos edadesHermanos = listaHermanos.get(x);
            edades.add(edadesHermanos.edad);
        }
        int edadMayor = mayorEdad(edades);
        nombreHermanoMayor(listaHermanos,edadMayor);


    }


}
