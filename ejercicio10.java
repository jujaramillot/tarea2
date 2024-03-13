package tarea_2.ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A");
        int A = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B");
        int B = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C");
        int C = sc.nextInt();

        System.out.println("Ingrese el peso de la esfera D");
        int D = sc.nextInt();

        if (A==B && A==C){
            if (A > D){
                System.out.println("La esfera D es diferente y tiene menor peso");
            }
            else{
                System.out.println("La esfera D es diferente y tiene mayor peso");
            }
        }
        else{
            if(A==B && A==D){
                if(A > C){
                    System.out.println("La esfera c es diferente y tiene menor peso");
                }
                else{
                    System.out.println("La esfera c es diferente y tiene mayor peso");

                }
            }
            else{
                if (A==C && A==D){
                    if(A > B){
                        System.out.println("La esfera B es diferente y tiene menor peso");

                    }
                    else{
                        System.out.println("La esfera B es diferente y tiene mayor peso");

                    }
                }else{
                    if(A > B){
                        System.out.println("La esfera A es diferente y tiene mayor peso");
                    }
                    else{
                        System.out.println("La esfera A es diferente y tiene menor peso");
                    }
                }
            }
        }
        sc.close();
    }
}
