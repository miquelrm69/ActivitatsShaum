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
public class Hora {

    private int hora, minuto;

    public Hora(int hora, int minuto) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {
            this.hora = hora;
            this.minuto = minuto;
        } else {
            System.err.println("Error! Formato de hora incorrecto.");
        }
    }

    int getHora() {
        return hora;
    }

    int getMinuto() {
        return minuto;
    }

    public String toString() {
        return (hora < 10 ? "0" : "") + hora + ":" + (minuto < 10 ? "0" : "") + minuto;
    }
}
