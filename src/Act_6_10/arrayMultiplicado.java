/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_10;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class arrayMultiplicado {
    public static int[] arrayMult(int[] aInt, int factMult) {
        int[] arrFactorizado = new int[aInt.length];
        for (int i = 0; i < aInt.length; i++) {
            arrFactorizado[i] = aInt[i] * factMult;
        }
        return arrFactorizado;
    }
}
