package Act_3_17;

import java.util.Arrays;

/**
 *
 * @author miquel
 */
public class CadenaSust {
    static String ocurrenciaES(String c) {
        c = c.replaceAll("es", "no por");
        return c; 
    }
    
    static String ocurrenciaDig(String c) {
        c = c.replaceAll("\\d+", "*");
        return c;
    }
    
//    static String ocurrenciaDig(String c) {
//        char[] l = c.toCharArray();
//        String newString = "";
//        int init_i, init_f;
//        for (int i = 0; i < l.length; i++) {
//            if (Character.isDigit(l[i])) {
//                init_i = i;
//                System.out.print(i + " ");
//                if (Character.isDigit( l[i + 1] )) {
//                    init_f = i + 1;
//                } else {
//                    init_f = i;
//                }
//                newString = c.replaceAll(c.substring(init_i, init_f), "*");
//            } 
//        }
//        return newString;
//    }
}


class Test {
    public static void main(String[] args) {
        String cadena = "esto1234es5678bueno900";
        System.out.println(CadenaSust.ocurrenciaES(cadena));
        System.out.println(CadenaSust.ocurrenciaDig(cadena));
    }
}
