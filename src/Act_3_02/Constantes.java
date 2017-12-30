package Act_3_02;

public class Constantes {
    public final double c = 2.9979 * (Math.pow(10, 8)); //En m/s
    public final double G = 6.67 * (Math.pow(10, -11));
    public final double h = 6.6262 * (Math.pow(10, -34));
    
}

class PruebaConstantes {
    public static void main(String[] args) {
        Constantes testConstantes = new Constantes();
        System.out.println("Velocidad de la luz: " + testConstantes.c + " en m/s.");
        System.out.println("Constante universal de gravitación: " + testConstantes.G + " en N m2/kg2.");
        System.out.println("Constante de Planck " + testConstantes.h + " en J·s.");
    }
}
