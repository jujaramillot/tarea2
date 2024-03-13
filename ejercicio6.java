package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int A = sc.nextInt();

        System.out.println("Ingrese un numero");
        int B = sc.nextInt();

        System.out.println("Ingrese un numero");
        int C = sc.nextInt();

        if (A > B && A > C){
            System.out.println("El nunmero de mayor valor es: " + A);
        }
        else{
            if (B > C){
                System.out.println("El nunmero de mayor valor es: " + B);
            }
            else{
                System.out.println("El nunmero de mayor valor es: " + C);
            }
        }
        sc.close();
    }
}
