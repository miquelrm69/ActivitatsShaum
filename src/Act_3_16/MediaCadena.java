package Act_3_16;

public class MediaCadena {
    static String mitad(String c) {
        String nuevaC = "";
        int i = (int)c.length() / 2;
        return c.substring(0, i);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(MediaCadena.mitad("Hola que tal"));
        System.out.println(MediaCadena.mitad("Adiós"));
    }
}
