/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_25;

/**
 *
 * @author Miquel
 */
public class Vocales {
    public static int cuentaVocales(String text) {
        int numVocales = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVocales++;
                    break;
            }
        }
        return numVocales;
    }
    
    public static void quinesVocals(String text) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int x = 0; x < text.length(); x++) {
            switch (text.charAt(x)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }
        System.out.println("A: " + a + "\n E: " + e + "\n I: " + i + "\nO: " + o + "\nU: " + u);
    }
    
    public static void main(String[] args) {
        System.out.println(cuentaVocales("Holaa"));
        quinesVocals("Holaa");
    }
}
