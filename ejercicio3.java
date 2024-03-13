package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la longitud del primer lado del triángulo:");
        double lado1 = sc.nextDouble();

        System.out.println("Ingresa la longitud del segundo lado del triángulo:");
        double lado2 = sc.nextDouble();

        System.out.println("Ingresa la longitud del tercer lado del triángulo:");
        double lado3 = sc.nextDouble();

        double perimeter = lado1 + lado2 + lado3;

        double s = perimeter / 2;

        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("Perímetro del triángulo: " + perimeter);
        System.out.println("Semiperímetro del triángulo: " + s);
        System.out.println("Área del triángulo: " + area);

        sc.close();
    }
}
