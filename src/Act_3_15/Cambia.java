package Act_3_15;

/**
 *
 * @author miquel
 */
public class Cambia {
    static String cambiar(String t) {
        String nuevoString = "";
        for (char l : t.toCharArray()) {
            if ((l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') && Character.isLowerCase(l)) {
                t = t.replace(l, 'a');
            }
        }
        return t;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Cambia.cambiar("Hola que tal va"));
    }
}
