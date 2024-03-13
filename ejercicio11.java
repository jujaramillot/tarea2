package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el salario por hora");
        double val_hora = sc.nextDouble();

        System.out.println("Ingresa el numero de horas");
        int horas = sc.nextInt();

        double salario = horas * val_hora;

        if (salario > 450000){
            System.out.println("El salario de "+ nombre + " es: " + salario);
        }
        else{
            System.out.println("El nombre es: " + nombre);
        }
        sc.close();
    }
}
