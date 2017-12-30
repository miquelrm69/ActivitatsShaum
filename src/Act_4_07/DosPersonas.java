/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_07;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class DosPersonas {

    public static void ordenaPersonas(String p1, String p2) {
        String[] menor = new String[2];
        if (p1.length() < p2.length()) {
            menor[0] = p1;
            menor[1] = "" + p1.length();
        } else {
            menor[0] = p2;
            menor[1] = "" + (p2.length());
        }
        for (int i = 0; i < menor[0].length(); i++) {
            char a = p1.charAt(i), b = p2.charAt(i);
            if (a < b) {
                System.out.println(p1 + " \n" + p2);
                break;
            } else if (a > b) {
                System.out.println(p2 + "\n" + p1);
                break;
            }
            if (i == menor[0].length() - 1) {
                System.out.println(menor[0]);
            }
        }

    }

    public static void main(String[] args) {
        ordenaPersonas("Rossell", "Rossela");
    }
}
