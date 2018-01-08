/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_29;

/**
 *
 * @author miquel
 */
public class Probabilidad {

    public static void probDado(int veces) {
        int[] dado = new int[7];
        boolean dadoZero = false;
        for (int i = 0; i < veces; i++) {
            int lanzaDado = (int)(Math.random() * 6);
            if (lanzaDado == 0) {
                dadoZero = true;
            }
            while (dadoZero) {
                lanzaDado = (int)(Math.random() * 6);
                if (lanzaDado != 0) {
                    dadoZero = false;
                }
            }
            dado[lanzaDado]++;
        }
        int total = dado[1] + dado[2] + dado[3] + dado[4] + dado[5] + dado[6];
        System.out.println(total);
        System.out.println("**** RESULTAT ****");
        System.out.println("1 -> " + dado[1] + " Probabilidad: " + dado[1] * total / 100);
        System.out.println("2 -> " + dado[2]);
        System.out.println("3 -> " + dado[3]);
        System.out.println("4 -> " + dado[4]);
        System.out.println("5 -> " + dado[5]);
        System.out.println("6 -> " + dado[6]);
    }

    public static void main(String[] args) {
        probDado(10);
    }
}
