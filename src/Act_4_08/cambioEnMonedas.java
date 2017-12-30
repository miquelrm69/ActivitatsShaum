/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_08;

/**
 *
 * @author miquel
 */
public class cambioEnMonedas {

    public static void cambio(double pago, double precio) {
        if (pago >= precio) {
            pago = pago * 100;
            precio = precio * 100;
            pago = pago - precio;
            System.out.println(pago);
            int Dos = 0, Un = 0, cincuenta = 0, veinte = 0, diez = 0, cinco = 0, dos = 0, un = 0;
            while (true) {
                while (pago >= 200) {
                    Dos++;
                    pago -= 200;
                }
                while (pago >= 100) {
                    Un++;
                    pago -= 100;
                }
                while (pago >= 50) {
                    cincuenta++;
                    pago -= 50;
                }
                while (pago >= 20) {
                    veinte++;
                    pago -= 20;
                }
                while (pago >= 10) {
                    diez++;
                    pago -= 10;
                }
                while (pago >= 5) {
                    cinco++;
                    pago -= 5;
                }
                while (pago >= 2) {
                    dos++;
                    pago -= 2;
                }
                while (pago >= 1) {
                    un++;
                    pago -= 1;
                }
                if (pago == 0) {
                    break;
                }
            }
            String cambio = "2€     x" + Dos + "\n1€    x" + Un + "\n50c    x" + cincuenta + "\n20c     x" + veinte + "\n10c    x" + diez + "\n5c   x" + cinco + "\n2c  x" + dos + "\n1c    x" + un;
            System.out.println(cambio);
        } else {
            System.err.println("Dinero insuficiente para el pago.");
        }
    }

    public static void main(String[] args) {
        cambio(5, 3);
    }

}
