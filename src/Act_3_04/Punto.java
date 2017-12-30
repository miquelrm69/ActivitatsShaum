package Act_3_04;

public class Punto {
    
    private double x, y;
    final static Punto ORIGEN = new Punto(0, 0);
    
    public Punto (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    double getX() {
        return x;
    }
    
    double getY() {
        return y;
    }
    
    static double distancia(Punto p) {
        double diffX = ORIGEN.getX() - p.getX();
        double diffY = ORIGEN.getY() - p.getY();
        double distanciaFinal = Math.sqrt((diffX * diffX) + (diffY * diffY));
        return distanciaFinal;
    }
}

class Test {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(0, 4);
        Punto punto3 = new Punto(2, -1);
        
        System.out.println(Punto.distancia(punto1));
        System.out.println(Punto.distancia(punto2));
        System.out.println(Punto.distancia(punto3));
        
        
    }
}
