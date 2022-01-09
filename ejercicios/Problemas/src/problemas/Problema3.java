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
 * @author JonathanCoronel
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String promedioCualitativo;
        promedioCualitativo = obtenerPromedioCualitativo();
        System.out.printf("%s", promedioCualitativo);
    }

    public static String obtenerPromedioCualitativo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double not1;
        double not2;
        double not3;
        double not4;
        double promedio;
        String mensaje = "";
        String menFinal = "";
        System.out.println("Ingrese la Primera Nota");
        not1 = entrada.nextDouble();
        System.out.println("Ingrese la Segunda Nota");
        not2 = entrada.nextDouble();
        System.out.println("Ingrese la Tercera Nota");
        not3 = entrada.nextDouble();
        System.out.println("Ingrese la Cuarta Nota");
        not4 = entrada.nextDouble();
        promedio = (not1 + not2 + not3 + not4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            mensaje = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                mensaje = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    mensaje = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        mensaje = "Sobresaliente";
                    }
                }
            }
        }
        menFinal = String.format("El promedio de las notas %.2f,%.2f,%.2f,%.2f "
                + "es %s\n", not1, not2, not3, not4, mensaje);
        return menFinal;
    }
}
