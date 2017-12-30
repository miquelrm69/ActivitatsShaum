package Act_3_14;

/**
 *
 * @author miquel
 */
public class ConteoCadena {
    
    
    public static void conteoDeCadena(String t) {
        //Passam Strig a Array de Char amb toCharArray()
        char[] l = t.toCharArray();
        int letras = 0, digitos = 0, espacios = 0;
        for (int i = 0; i < t.length(); i++) {
            if (Character.isDigit(l[i])) {
                digitos++;
            } else if (Character.isWhitespace(l[i])) {
                espacios++;
            } else if (Character.isLetter(l[i])) {
                letras++;
            }
        }
        System.out.println("Hay " + letras + " letras, " + digitos + " números i " + espacios + " espacios.");
    }
}

class Test {
    public static void main(String[] args) {
        String cadena = "Hola, vivo en Marquina 123, 5-7";
        ConteoCadena.conteoDeCadena(cadena);
    }
}
