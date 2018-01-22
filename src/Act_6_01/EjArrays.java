/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_6_01;

/**
 *
 * @author miquel
 */
public class EjArrays {
    public static void main() {
        int[] arrDig1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrDig2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        char[] arrCh1 = {'a', 'e', 'i', 'o', 'u'};
        char[] arrCh2 = {'a', 'b', 'c', 'd', 'e'};
        String cadCh1 = "", cadCh2 = "";
        for (int x = 0; x < arrCh1.length; x++ ) {
            cadCh1 += arrCh1[x] + " ";
            cadCh2 += arrCh2[x] + " ";
        }
        System.out.println(cadCh1);
        System.out.println(cadCh2);
        for (int x = 0; x < arrCh1.length; x++) {
            if (arrCh1[x] == arrCh1[x]) {
                System.out.print(arrCh1[x] + " ");
            } else {
                System.out.print(arrCh2[x] + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < arrDig1.length; i++) {
            System.out.print((arrDig1[i] + arrDig2[i]) + " ");
        }
    }
    
    public static void main(String[] args) {
        main();
    }
}
