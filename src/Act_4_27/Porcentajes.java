/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_27;

/**
 *
 * @author miquel
 */
public class Porcentajes {

    public static void tiraMoneda(int veces) {
        double cara = 0, cruz = 0;
        for (int i = 0; i < veces; i++) {
            double tirada = Math.random() * 2;
            if (tirada < 1) {
                cara++;
            } else if (tirada >= 1) {
                cruz++;
            }
        }
        double porcentajeCara = (cara / veces) * 100;
        double porcentajeCruz = (cruz / veces) * 100;
        System.out.println("Cara: " + porcentajeCara + "%" + " Cruz: " + porcentajeCruz + "%");
    }
    
    public static void main(String[] args) {
        tiraMoneda(5);
    }
}
