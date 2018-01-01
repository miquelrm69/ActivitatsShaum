/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_15;

/**
 *
 * @author Miquel
 */
public class Pares {
    public static void sumPares(int numPares) {
        int sumaTotal = 0;
        for (int i = 0; i < numPares; i++) {
            sumaTotal += 2;
        }
        System.out.println("La suma dels primers " + numPares + " nombres parells és de: " + sumaTotal);
    }
    
    public static void main(String[] args) {
        sumPares(3);
    }
}


