/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_21;

/**
 *
 * @author Miquel
 */
public class Rombo {
    public static void dibujaRombo(int lado) {
        if (lado % 2 != 0 && lado >= 3) {
            for (int l = 0; l < (lado + 1) / 2; l++) {
                for (int x = 0; x < ((lado + 1) / 2) - l - 1; x++) {    //Espais en blanc
                    System.out.print(" ");
                }
                for (int x = 0; x < 2*l + 1; x++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int l = ((lado + 1) / 2) - 1; l > 0; l--) {
                for (int x = ((lado + 1)/ 2) - l - 1; x >= 0; x--) {
                    System.out.print(" ");
                }
                for (int x = 2*l - 1; x > 0; x--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        dibujaRombo(5);
    }
}
