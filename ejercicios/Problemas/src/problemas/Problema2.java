/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el 1 para obtener el Area de un Cuadrado ,"
                + " 2 para obtener el Area de un Triángulo y 3 si desea "
                + "Obtener el Area de un Rectángulo");
        num = entrada.nextInt();
        if (num == 1) {
            obtenerAreaCuadrado();
        } else {
            if (num == 2) {
                obtenerAreaTriangulo();
            } else {
                if (num == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Error ingrse un numero permitido");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double aCuadrado;
        System.out.println("Ingrese un lado del Cuadrado");
        lado = entrada.nextDouble();
        aCuadrado = lado * lado * lado * lado;
        System.out.printf("El Area del Cuadrado es: %.2f\n", aCuadrado);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double aTriangulo;
        System.out.println("Ingrese La base del Triángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la Altura del Triángulo");
        altura = entrada.nextDouble();
        aTriangulo = (base * altura) / 2;
        System.out.printf("El Area del Triángulo es: %.2f\n", aTriangulo);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double aRectangulo;
        System.out.println("Ingrese La base del Rectángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la Altura del Rectángulo");
        altura = entrada.nextDouble();
        aRectangulo = base * altura;
        System.out.printf("El Area del Rectángulo es: %.2f\n", aRectangulo);
    }
}
