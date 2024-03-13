package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A");
        int a = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B");
        int b = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("La esfera mas grande es la A");
        }
        else{
            if(b>a && b>c){
                System.out.println("La esfera mas grande es la B");
            }
            else{
                System.out.println("La esfera mas grande es la C");
            }
        }
        sc.close();
    }
}
