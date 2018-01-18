/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_16;

import Act_5_15.*;
import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.print("Introdueix la matricula del cotxe: ");
        String matricula = input.nextLine();
        String cambio;
        Coche c1;
        System.out.println("Tipo cambio:");
        System.out.println("1 - Manual");
        System.out.println("2 - Automàtico");
        int tipoCambio = input.nextInt();
        if (tipoCambio == 2) {
            cambio = "Automàtico";
            c1 = new CocheCambioAutomatico(matricula);
        } else if (tipoCambio == 1) {
            cambio = "Manual";
            c1 = new CocheCambioManual(matricula);
        } else {
            throw new IllegalArgumentException("Opcion no vàlida!");
        }   
        System.out.print("A que velocidad quieres acelerar? ");
        double vel = input.nextDouble();
        if (c1 instanceof CocheCambioManual) {
            ((CocheCambioManual)c1).cambiaMarcha(3);
        }
        c1.acelerar(vel);
        System.out.println(c1.toString());
    }
}
