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
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades;
        ciudades = obtenerCiudades();
        presentarCaracteres(ciudades);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        int indice;
        System.out.println("Ingrese el numero de elementos del arreglo");
        indice = entrada.nextInt();
        entrada.nextLine();
        String[] ciudades = new String[indice];
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese la ciudad");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }

    public static void presentarCaracteres(String[] datos) {
        String mensaje = "";
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].length() == 4 || datos[i].length() == 5) {
                mensaje = String.format("%s%s\n", mensaje,
                        datos[i]);

            }
        }
        System.out.printf("la ciudades que tienen 4 0 5 caracteres son:\n%s",
                mensaje);
    }
}
