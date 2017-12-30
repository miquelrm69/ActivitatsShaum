/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_11;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Miquel
 */
public class Edad {
    public static int calcEdad(int dia, int mes, int ano) {
        Calendar cal = new GregorianCalendar();
        System.out.println(Calendar.YEAR);
        boolean cumplido = false;
        int edad = 0;
        if (Calendar.MONTH < dia) {
            if (Calendar.DAY_OF_MONTH > mes) {
                cumplido = true;
            }
        } else {
            cumplido = true;
        }
        if (cumplido) {
            edad = Calendar.YEAR - ano;
        } else {
            edad = Calendar.YEAR - ano;
            edad--;
        }
        return edad;
    }
    
    public static void main(String[] args) {
        System.out.println(calcEdad(8, 8, 1998));
    }
}