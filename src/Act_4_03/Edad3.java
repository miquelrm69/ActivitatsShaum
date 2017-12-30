package Act_4_03;

/**
 *
 * @author miquel
 */
public class Edad3 {
    
    final int MAYORIA_EDAD = 18;
    
    public boolean mayorDeEdad(int edad) {
        return edad >= MAYORIA_EDAD;
    }
}

class Test {
    public static void main(String[] args) {
        Edad3 e = new Edad3();
        System.out.println(e.mayorDeEdad(17));
    }
}
