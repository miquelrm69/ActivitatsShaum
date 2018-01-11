/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author miquel
 */
public class Fecha {

    private int dia, mes, ano;
    private Calendar calendario = new GregorianCalendar();

    public Fecha(int dia, int mes, int ano) {
        if (ano >= 0 && ano <= 2018) {
            if (mes >= 1 && mes <= 12) {
                if (dia >= 1) {
                    switch (mes) {
                        case 1:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            if (dia <= 31) {
                                this.dia = dia;
                                this.mes = mes;
                                this.ano = ano;
                            } else {
                                System.err.println("Error! Dia incorrecto.");
                            }
                            break;
                        case 3:
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (dia <= 30) {
                                this.dia = dia;
                                this.mes = mes;
                                this.ano = ano;
                            } else {
                                System.err.println("Error! Dia incorrecto.");
                            }
                            break;
                        case 2:
                            if (dia <= 28) {
                                this.dia = dia;
                                this.mes = mes;
                                this.ano = ano;
                            } else {
                                System.err.println("Error! Dia incorrecto.");
                            }
                            break;
                        default:
                            System.err.println("Error general en Fecha!");
                            break;
                    }
                }
            } else {
                System.err.println("Error! Mes incorrecto.");
            }
        } else {
            System.err.println("Error! Año incorrecto.");
        }
    }

    int getDia() {
        return dia;
    }

    int getMes() {
        return mes;
    }

    int getAno() {
        return ano;
    }

    public String toString() {
        return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
    }
}
