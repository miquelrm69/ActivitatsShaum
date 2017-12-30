package Act_3_21;
import java.lang.Math;

/**
 *
 * @author miquel
 */
public class FuncionesMath {
    static void radianesAGrados (double angulo) {
        System.out.println(Math.toDegrees(angulo));
        System.out.println("Cosinus: " + Math.toDegrees(Math.cos(angulo)));
        System.out.println("Sinus: " + Math.toDegrees(Math.sin(angulo)));
        System.out.println("Tangente: " + Math.toDegrees(Math.tan(angulo)));
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        FuncionesMath.radianesAGrados(0);
        FuncionesMath.radianesAGrados(Math.PI/4);
        FuncionesMath.radianesAGrados(Math.PI/2);
        FuncionesMath.radianesAGrados(Math.PI);
    }
}