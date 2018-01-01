/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_4_12;

/**
 *
 * @author Miquel
 */
public class FechaValida {

    public static boolean esFechaValida(int dia, int mes, int ano) {
        if (ano >= 0) {
            if (mes >= 1 && mes <= 12) {
                if (dia >= 1) {
                    switch (mes) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            if (dia <= 31) {
                                return true;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (dia <= 30) {
                                return true;
                            }
                            break;
                        case 2:
                            if (dia <= 28) {
                                return true;
                            }
                            break;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(esFechaValida(31, 1, 1998));
    }
}
