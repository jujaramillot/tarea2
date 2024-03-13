package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int salario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado");
        String NOMBRE = sc.nextLine();
        
        System.out.println("Ingrese las horas trabajadas");
        int Horas = sc.nextInt();

        System.out.println("Ingrese el valor de la hora");
        int vl_hora = sc.nextInt();

        if (Horas > 40){
            int VHE = Horas-40;
            if (VHE > 8){
                int VAEE8 = VHE-8;
                    salario = (40*vl_hora) + (8*(vl_hora*2)) + (VAEE8*(vl_hora*3));
            }
            else{
                salario = (40*vl_hora)+(VHE*(vl_hora*2));
            }
        }
        else{
            salario = vl_hora*Horas;
        }
        System.out.println("El trabajador " + NOMBRE + " debengo: $" + salario);
        sc.close();
    }
}
