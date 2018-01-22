/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_07;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class completarArray3 {
    public static void completaArray(int[] aInt) {
        int parells = 0;
        for (int i = 0; i < aInt.length; i++) {
            aInt[i] = parells;
            parells += 2;
        }
    }
    
    public static void main(String[] args) {
        int[] arrayInt;
        completaArray(arrayInt = new int[43]);
        System.out.println(Arrays.toString(arrayInt));
    }
}
