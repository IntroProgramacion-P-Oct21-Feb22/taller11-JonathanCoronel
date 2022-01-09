/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author JonathanCoronel
 */
public class Problema5 {

    public static void main(String[] args) {
        int obSuma;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        obSuma = obtenerSuma(informacion);
        System.out.printf("La suma es: %d\n", obSuma);
    }

    public static int obtenerSuma(int[][] datos) {
        int suma = 0;
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                suma = suma + datos[fila][col];
            }
        }
        return suma;
    }
}
