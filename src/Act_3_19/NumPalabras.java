package Act_3_19;

/**
 *
 * @author miquel
 */
public class NumPalabras {
    static int numPalabrasCadena (String cadena) {
        cadena = cadena.trim();
        String[] fragCadena = cadena.split(" +");
        int numPalabras = fragCadena.length;
        return numPalabras;
    }
}

class Test {
    public static void main(String[] args) {
        String cadena = "Hola que tal";
        System.out.println(NumPalabras.numPalabrasCadena(cadena));
    }
}
