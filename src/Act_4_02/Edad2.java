package Act_4_02;

/**
 *
 * @author miquel
 */
public class Edad2 {
    final int MAYOR_25 = 25;
    
    public void mayorQue25(int edad) {
        System.out.println((edad >= MAYOR_25 ? "Mayor" : "Menor"));
    }
}

class Test {
    public static void main(String[] args) {
        Edad2 e2 = new Edad2();
        e2.mayorQue25(25);
    }
}
