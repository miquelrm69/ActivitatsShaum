package Act_3_12;

public class KeySensitive {
    private static String cadena = "Juan Piñón López";
    
    static String lowCase() {
        return cadena.toLowerCase();
    }
    
    static String uppCase() {
        return cadena.toUpperCase();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("En minúscules: " + KeySensitive.lowCase());
        System.out.println("En majúscules: " + KeySensitive.uppCase());
    }
}