package tarea_2.ejercicios;

import java.lang.Math;
import java.util.Scanner;

public class ejercicio12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese A");
        double a = sc.nextDouble();

        System.out.println("Ingrese B");
        double b = sc.nextDouble();

        System.out.println("Ingrese C");
        double c = sc.nextDouble();

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son " + solucion1 + " y " + solucion2);
        } else if (discriminante == 0) {
            double solucion = -b / (2 * a);
            System.out.println("La solución es " + solucion);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        sc.close();
    }
}
