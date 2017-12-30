package Act_4_01;

/**
 *
 * @author miquel
 */
public class Edat {
    
    public void mayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("És mayor de edad.");
        } else {
            System.out.println("No és mayor de edad.");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Edat e1 = new Edat();
        e1.mayorDeEdad(18);
    }
}
