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
public class Problema6 {

    public static void main(String[] args) {
        double mediaAritmetica;
        double desviEstandar;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        mediaAritmetica = obtenerMediaAritmetica(informacion);
        desviEstandar = obtenerDesviacionEstandar(informacion, mediaAritmetica);
        System.out.printf("La Media aritmetica es: %.2f\nLa Desviación "
                + "Estandar es: %.2f\n", mediaAritmetica, desviEstandar);
    }

    public static double obtenerMediaAritmetica(int[] datos) {
        double suma = 0;
        double mediaArit;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        mediaArit = suma / datos.length;
        return mediaArit;
    }

    public static double obtenerDesviacionEstandar(int[] datos, double media) {
        double sumatoria;
        double varianza = 0;
        double desviacion;
        for (int i = 0; i < datos.length; i++) {
            sumatoria = Math.pow(datos[i] - media, 2);
            varianza = varianza + sumatoria;
        }
        varianza = varianza / (datos.length - 1);
        desviacion = Math.sqrt(varianza);
        return desviacion;
    }
}
