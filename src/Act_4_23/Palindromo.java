/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_23;

/**
 *
 * @author Miquel
 */
public class Palindromo {
    public static boolean esPalindromo(String text) {
        text = text.toLowerCase();
        char[] cText = text.toCharArray();
        boolean palindromo = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == cText[text.length() - i - 1]) {
                palindromo = true;
            } else {
                palindromo = false;
            }
        }
        return palindromo;
    }
    
    public static void main(String[] args) {
        System.out.println(esPalindromo("Somos"));
    }
}
