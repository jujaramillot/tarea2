package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese un valor");
        double A = sc.nextInt();

        System.out.println("Ingrese un valor");
        double B = sc.nextInt();

        if (A>B) {
            System.out.println("El primer valor es mayor que el segundo");
        }
        else {
            if (A == B) {
                System.out.println("Los valores son iguales");
            }
            else {
                System.out.println("El segundo valor es mayor que el primero");
            }
        }
        sc.close();
    }
}
