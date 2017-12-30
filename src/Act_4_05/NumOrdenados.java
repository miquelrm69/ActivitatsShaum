package Act_4_05;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class NumOrdenados {
    public static void escribeOrdenadosDosNumeros(double n1, double n2) {
        if (n1 < n2) {
            System.out.println(n1 + " " + n2);
        } else if (n1 > n2) {
            System.out.println(n2 + " " + n1);
        } else if (n1 == n2) {
            System.out.println("Son iguals.");
        } else {
            System.out.println("Error!");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------Si vols escriure amb decimals recorda que és amb comes (,)-------");
        System.out.print("Primer numero: ");
        double num_1 = input.nextDouble();
        System.out.print("Segon numero: ");
        double num_2 = input.nextDouble();
        escribeOrdenadosDosNumeros(num_1, num_2);
    }
}
