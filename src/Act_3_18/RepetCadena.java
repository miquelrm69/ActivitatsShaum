package Act_3_18;

public class RepetCadena {
    static String repetCadena(String c, String l) {
        char[] x = c.toCharArray();
        int num_rep = 0, pos = 0;
        while ((pos = c.indexOf(l, pos)) >= 0) {
            pos += l.length();
            num_rep++;
        }
        return "Se repite  " + num_rep + " veces.";
    }
    
//    static String repetCadena(String c, char l) {
//        int num_repeticiones = 0;
//        char[] a = c.toCharArray();
//        System.out.println(a.length);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(i + "      " + (i+1));
//            if (Character.isWhitespace(a[i + 1]) && c.charAt(i) == l) {
//                num_repeticiones++;
//            }
//        }
//        return "Se repite " + num_repeticiones + " veces";
//    }
}

class Test {
    public static void main(String[] args) {
        String cadena = "En un lugar de la mancha, de cuyo nombre no puedo acordarme";
        System.out.println(RepetCadena.repetCadena(cadena, "o "));
    }
}
