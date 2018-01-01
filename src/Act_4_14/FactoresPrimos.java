/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_14;

/**
 *
 * @author Miquel
 */
public class FactoresPrimos {

    public static void factPrimos(int num) {
        String factorizacion = num + " = ";
        int avança = 2;
        for (int i = 2; i <= num; i = avança) {
            if (num % i == 0) {
                num /= i;
                factorizacion += i + " ";
                avança = i;
            } else {
                avança++;
            }
        }
        System.out.println(factorizacion);
    }

    public static void main(String[] args) {
        factPrimos(12);
    }
}
