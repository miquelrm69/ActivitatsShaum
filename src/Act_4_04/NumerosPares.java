package Act_4_04;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class NumerosPares {
    
    public static void esPar(int n) {
        String par = n % 2 == 0 ? "Es par" : "No es par";
        System.out.println(par);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escriu un numero: ");
        int num = input.nextInt();
        esPar(num);
    }
}
