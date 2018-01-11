/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_01;

/**
 *
 * @author miquel
 */
public class MainExamen {
    public static void main(String[] args) {
        Fecha fE1 = new Fecha(10, 4, 2017);
        Hora hE1 = new Hora(8, 0);
        Examen examenFP = new Examen("Programació", "D-209", fE1, hE1);
        System.out.println(examenFP.toString());
    }
}
