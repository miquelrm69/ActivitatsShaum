/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_20;

/**
 *
 * @author Miquel
 */
public class dibujaTriangulo3 {
    public static void dibuja(int lado) {
        int mid = (lado - 1) / 2;
        if (lado % 2 != 0) {
            for (int l = 0; l < (lado + 1) / 2; l++) {
                for (int w1 = 0; w1 <= mid - l - 1; w1++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < 2*l + 1; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        dibuja(7);
    }
}
