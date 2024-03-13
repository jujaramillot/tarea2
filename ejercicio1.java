package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double horas_tr, vl_hora, retencion, bruto, neto, retenido;
            String nombre;
            int id;
            
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();

            System.out.println("Ingrese el codigo de empleado");
            id = sc.nextInt();

            System.out.println("Ingrese las horas trabajadas");
            horas_tr = sc.nextDouble();

            System.out.println("Ingrese el valor de las horas");
            vl_hora = sc.nextDouble();

            System.out.println("Ingrese el porcentaje de retencion");
            retencion = sc.nextDouble();

            bruto = vl_hora * horas_tr;

            retenido = bruto * (12.5/100);
            
            neto = bruto - retenido;

            System.out.println("El codigo de empleado es:" + id);
            System.out.println("El nombre es:" + nombre);
            System.out.println("El valor bruto es:" + bruto);
            System.out.println("La retencion es:" + retencion);
            System.out.println("El valor neto es:" + neto);
            sc.close();
        }
    }
