package Act_4_06;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class TresNumerosOrdenados {

    public static double[] ordenacio(double a, double b, double c) {
        double[] aOrdenat = new double[3];
        if (a <= b && a <= c) {
            aOrdenat[0] = a;
            if (b <= c) {
                aOrdenat[1] = b;
                aOrdenat[2] = c;
            } else {
                aOrdenat[1] = c;
                aOrdenat[2] = b;
            }
        } else if (b <= a && b <= c) {
            aOrdenat[0] = b;
            if (a <= c) {
                aOrdenat[1] = a;
                aOrdenat[2] = c;
            } else {
                aOrdenat[1] = c;
                aOrdenat[2] = a;
            }
        } else if (c <= a && c <= b) {
            aOrdenat[0] = c;
            if (a <= b) {
                aOrdenat[1] = a;
                aOrdenat[2] = b;
            } else {
                aOrdenat[1] = b;
                aOrdenat[2] = a;
            }
        }
        return aOrdenat;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ordenacio(9, 6, 0)));
    }
}
