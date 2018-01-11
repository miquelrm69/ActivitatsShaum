/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_03;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class MainPalillos {
    private static int turnoAnterior = 2;
    private static String j1 = "", j2 = "";
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] filesJoc = {7, 5, 3};
        JuegoPalillos juego1 = new JuegoPalillos(filesJoc);
        
        while (juego1.finDeJuego() == false) {
            System.out.println(juego1.toString());
            if (turnoAnterior == 2) {
                System.out.print("JUGADOR 1 -> Fila: ");
                int fJ1 = input.nextInt();
                System.out.print("JUGADOR 1 -> Quita palilolos: ");
                int qJ1 = input.nextInt();
                if (juego1.quitaPalillos(fJ1, qJ1)) {
                    turnoAnterior = 1;
                }
                if (juego1.finDeJuego()) {
                    break;
                }
            } else if (turnoAnterior == 1) {
                System.out.print("JUGADOR 2 -> Fila: ");
                int fJ2 = input.nextInt();
                System.out.print("JUGADOR 2 -> Quita palilolos: ");
                int qJ2 = input.nextInt();
                juego1.quitaPalillos(fJ2, qJ2);
                turnoAnterior = 2;
                if (juego1.finDeJuego()) {
                    break;
                }
            }
        }
        System.out.println("Ganador: " + turnoAnterior);
    }
}
