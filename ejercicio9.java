package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las ventas del depto 1");
        double depto_1 = sc.nextDouble();
        
        System.out.println("Ingrese las ventas del depto 2");
        double depto_2 = sc.nextDouble();

        System.out.println("Ingrese las ventas del depto 3");
        double depto_3 = sc.nextDouble();

        System.out.println("Ingrese el salario de los empleados");
        double salario = sc.nextDouble();

        double totven = depto_1 + depto_2 + depto_3;

        double porven = totven * 0.33;

        double salario_1, salario_2, salario_3;

        if (depto_1 > porven){
            salario_1 = salario + (salario*0.2);
        }
        else{
            salario_1 = salario;
        }
        if (depto_2 > porven){
            salario_2 = salario + (salario*0.2);
        }
        else{
            salario_2 = salario;
        }
        if (depto_3 > porven){
            salario_3 = salario + (salario*0.2);
        }
        else salario_3 = salario;

        System.out.println("El salario del departamento uno es: $" + salario_1);
        System.out.println("El salario del departamento dos es: $" + salario_2);
        System.out.println("El salario del departamento tres es: $" + salario_3);
        sc.close();

    }
}
