package tarea_2.prueba_figuras;

import java.util.Scanner;

public class pruebafiguras {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int radio, lado, base_rec, altura_rec, base_tri, altura_tri;

            System.out.println("Ingrese el radio del circulo:");
            radio = entrada.nextInt();

            System.out.println("Ingrese la base del rectangulo:");
            base_rec = entrada.nextInt();

            System.out.println("Ingrese la altura del rectangulo:");
            altura_rec = entrada.nextInt();

            System.out.println("Ingrese el lado del cuadrado");
            lado = entrada.nextInt();

            System.out.println("Ingrese la base del triangulo");
            base_tri = entrada.nextInt();

            System.out.println("ingrese la altura del triangulo");
            altura_tri = entrada.nextInt();

            circulo figura1 = new circulo(radio);
            rectangulo figura2 = new rectangulo(base_rec,altura_rec);
            cuadrado figura3 = new cuadrado(lado);
            triangulo figura4 = new triangulo(base_tri,altura_tri);

            System.out.println("El área del círculo es = " + figura1.
            calcularArea());
            System.out.println("El perímetro del círculo es = " + figura1.
            calcularPerimetro());
            System.out.println();
            System.out.println("El área del rectángulo es = " + figura2.
            calcularArea());
            System.out.println("El perímetro del rectángulo es = " + figura2.
            calcularPerimetro());
            System.out.println();
            System.out.println("El área del cuadrado es = " + figura3.
            calcularArea());
            System.out.println("El perímetro del cuadrado es = " + figura3.
            calcularPerimetro());
            System.out.println();
            System.out.println("El área del triángulo es = " + figura4.
            calcularArea());
            System.out.println("El perímetro del triángulo es = " + figura4.
            calcularPerímetro());
            figura4.determinarTipoTriángulo();
        }
    }

}
