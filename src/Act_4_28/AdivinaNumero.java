/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_28;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class AdivinaNumero {

    static Scanner input = new Scanner(System.in);

    public static void adivina() {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.MINUTE) + ":" + Calendar.SECOND);
        int intentos = 0, adivina = (int)(Math.random() * 100);
        boolean repeat = true;
        while (repeat) {
            System.out.print("Valor: ");
            int v = input.nextInt();
            if (v < adivina) {
                System.out.println("El numero introduït és inferior!");
                intentos++;
            } else if (v > adivina) {
                System.out.println("El numero introduït és superior!");
                intentos++;
            } else if (v == adivina) {
                Calendar finish = Calendar.getInstance();
                String diff = (finish.get(Calendar.MINUTE) - now.get(Calendar.MINUTE)) + ":" + (finish.get(Calendar.SECOND) - now.get(Calendar.SECOND));
                System.out.println("Enhorabona, has endevinat el número!");
                intentos++;
                System.out.println("***** RESUM *****");
                System.out.println("Intents: " + intentos);
                System.out.println("Número a adivinar: " + adivina);
                System.out.println("Temps emprat: " + diff);
                repeat = false;
            } else {
                System.err.println("Error.");
            }
        }
    }
    
    public static void main(String[] args) {
        adivina();
    }
}
