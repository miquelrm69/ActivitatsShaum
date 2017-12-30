/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_10;

/**
 *
 * @author Miquel
 */
public class Potencias {
    public static int potencia(int base, int elev) {
        int valor = 1;
        for (int v = 0; v < elev; v++) {
            valor = base * valor;
        }
        return valor;
    }
    
    public static void main(String[] args) {
        System.out.println(potencia(-2, 2));
        System.out.println(Math.pow(-2, 2));
    }
}
