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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos.length; col++) {
                System.out.printf("[%d][%d] = %d\n",
                        fila, col, datos[fila][col]);
            }
        }
    }

}
