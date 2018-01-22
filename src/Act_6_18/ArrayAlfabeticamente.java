/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_18;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class ArrayAlfabeticamente {
    public static String[] obtenArrayAlfab(String[] aCad) {
        String[] cadOrd = new String[aCad.length];
        for (int x = 0; x < aCad.length; x++) {
            aCad[x] = aCad[x].toLowerCase();
            char[] arrCh = aCad[x].toCharArray();
            char[] arrChOrd = new char[arrCh.length];
            for (int y = 0; y < arrCh.length; y++) {
                for (int compare = y; compare < arrCh.length; compare++) {
                    if (arrCh[y] > arrCh[compare]) {
                        char change = arrCh[y];
                        arrChOrd[y] = arrCh[compare];
                        arrChOrd[compare] = change;
                        arrCh[y] = arrChOrd[y];
                        arrCh[compare] = arrChOrd[compare];
                    } else {
                        arrChOrd[y] = arrCh[y];
                    }
                }
            }
            cadOrd[x] = Arrays.toString(arrChOrd);
        }
        return cadOrd;
    }
    
//    private static char getPetit(char[] c) {
//        int inferior = 0;
//        for (int i = 0; i < c.length - 1; i++) {
//            if (c[inferior] < c[i + 1]) {
//                inferior = i;
//            }
//        }
//        return c[inferior];
//    }
    
    public static void main(String[] args) {
        String[] c = {"yjaio", "abcde", "aeiou"};
        System.out.println(Arrays.toString(obtenArrayAlfab(c)));
    }
}
