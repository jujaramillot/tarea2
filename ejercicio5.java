package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double patrimonio, matricula;
        int estrato, numInscripcion;
        String nombre;

        System.out.println("Ingres el nombre del estudiante");
        nombre = sc.nextLine();
        
        System.out.println("Ingre el numero de inscripcion");
        numInscripcion = sc.nextInt();

        System.out.println("Ingrese el patrimonio del estudiante");
        patrimonio = sc.nextDouble();

        System.out.println("Ingrese el estarato del estudiante");
        estrato = sc.nextInt();

        matricula = 50000;

        if (patrimonio > 2000000 && estrato > 3) {
            matricula = 0.03*patrimonio;
        }
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numInscripcion + " Y NOMBRE" + nombre + " DEBE PAGAR: $" + matricula);
        sc.close();
    }
}
