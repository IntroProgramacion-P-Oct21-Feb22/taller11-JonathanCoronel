/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author JonathanCoronel
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //obtenerMultiplicacion(10, 20);
        //obtenerSuma();
        String miNombre = obtenerNombre();
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s",miCiudad);
    }

    public static void obtenerSuma() {

    }

    public static void obtenerMultiplicacion(int tabla, int limite) {

    }

    public static String obtenerNombre() {
        return "Jonathan";
    }

    public static String obtenerCiudadMayuscula(String a) {
        String mayuscula = a.toUpperCase();
        return mayuscula;
    }
}
