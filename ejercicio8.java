package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el color de la pelota en mayusculas");
        String color = sc.nextLine();

        System.out.println("Ingrese el valor de la compra");
        int valcom = sc.nextInt();

        int valpag, pdes;

        if (color.equals("BLANCO")){
            pdes = 0;
        }
        else{
            if (color.equals("VERDE")){
                pdes = 10;
            }
            else{
                if (color.equals("AMARILLO")){
                    pdes = 25;
                }
                else{
                    if (color.equals("AZUL")){
                        pdes = 50;
                    }
                    else{
                        pdes = 100;
                    }
                }
            }
        }
        valpag = valcom-((valcom*pdes)/100);
        System.out.println(pdes);
        System.out.println("El cliente debe pagar: $" + valpag);
        sc.close();
    }
}
