/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorLuz;
        double valorInmu;
        String nombres;
        String cedula;
        int num;
        System.out.println("Ingrese los Nombres del Cliente");
        nombres = entrada.nextLine();
        System.out.println("Ingrese la Cedula del Cliente");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el numero (1) si quiere calcular el valor de"
                + " la luz o (2) si queire calcular el Predio de un inmueble");
        num = entrada.nextInt();
        if (num == 1) {
            calcularValorLuz(nombres, cedula);
        } else {
            if (num == 1) {
                calcularPredio(nombres, cedula);
            } else {
                System.out.println("Ingrese un valor Permitido");
            }
        }
    }

    public static void calcularValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorKilo;
        double numKilo;
        double total;
        System.out.println("Ingrese el valor del Kilowatio");
        valorKilo = entrada.nextDouble();
        System.out.println("Ingrese los Jilowatios consumidos en el mes");
        numKilo = entrada.nextDouble();
        total = valorKilo * numKilo;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de:"
                + " $%.2f\n", a, b, total);
    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valInmueble;
        int porcentaje = 2;
        double predio;
        System.out.println("Ingrese el precio del Inmueble");
        valInmueble = entrada.nextDouble();
        predio = (valInmueble * porcentaje) / 100;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en:$ %.2f y tiene que pagar de predio: $%.2f\n",
                a, b, valInmueble, predio);
    }
}
