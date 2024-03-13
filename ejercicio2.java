package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double altura, area, lado, perimetro;

            System.out.println("Ingrese el valor del lado");
            lado = sc.nextDouble();

            altura = (lado * Math.sqrt(3)) / 2;
            perimetro = 3 * lado;
            area = (lado * altura) / 2;
            
            System.out.println("La altura es:" + altura);
            System.out.println("El perimetro es:" + perimetro);
            System.out.println("El area es:" + area);

            sc.close();
        }
    }

