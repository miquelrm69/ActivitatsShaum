package Act_4_09;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class Socio {
    
    static Scanner input = new Scanner(System.in);
    
    public static void abonoSocio(boolean mayor65, boolean padresSocios, boolean menor18) {
        double cuota = 500, cuotaPaga = cuota;
        if (mayor65) {
            cuotaPaga = cuota * 0.50;
            System.out.println("La cuota para usted es de " + cuotaPaga + " euros.");
        } else if (menor18) {
            if (padresSocios) {
                cuotaPaga = cuota * 0.35;
                System.out.println("La cuota para usted es de " + cuotaPaga + " euros.");
            } else {
                cuotaPaga = cuota * 0.25;
                System.out.println("La cuota para usted es de " + cuotaPaga + " euros.");
            }
        } else {
            System.out.println("La cuota para usted es de " + cuotaPaga + " euros.");
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Introduce tu edad: ");
        boolean menor18 = false;
        int edadSocio = input.nextInt();
        if (edadSocio >= 65) { 
            abonoSocio(true, false, menor18);
        } else if (edadSocio <= 65 && edadSocio < 18) {
            System.out.print("Tus padres son socios?");
            boolean padresSocios = input.nextBoolean();
            menor18 = true;
            abonoSocio(false, padresSocios, menor18);
        } else {
            abonoSocio(false, false, false);
        }
    }
}
