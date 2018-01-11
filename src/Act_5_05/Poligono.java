package Act_5_05;

import Act_5_04.Punto;

/**
 *
 * @author miquel
 */
public class Poligono {

    private Punto[] aPunto;

    public Poligono(Punto[] vertices) throws IllegalArgumentException {
        if (vertices.length <= 3) {
            throw new IllegalArgumentException("Vertice menor que 3");
        }
        aPunto = vertices;
    }

    public void trasladar(double desplX, double desplY) {
        for (int i = 0; i < aPunto.length; i++) {
            aPunto[i].setX(aPunto[i].getX() + desplX);
            aPunto[i].setY(aPunto[i].getY() + desplY);
        }
    }

    public void escalar(double escX, double escY) {
        for (int i = 0; i < aPunto.length; i++) {
            aPunto[i].setX(aPunto[i].getX() * escX);
            aPunto[i].setY(aPunto[i].getY() * escY);
        }
    }
    
    public int numVertices() {
        return aPunto.length;
    }
    
    public String toString() {
        String showString = "";
        for (int i = 0; i < aPunto.length; i++) {
            showString += aPunto[i].toString() + System.lineSeparator();
        }
        return showString;
    }
    
    public double perimetro() {
        double distancia = 0;
        for (int i = 0; i < aPunto.length - 1; i++) {
            if (i == aPunto.length - 2) {
                distancia += aPunto[i].distanciaDe(aPunto[0]);
            }
            distancia += aPunto[i].distanciaDe(aPunto[i + 1]);
        }
        return distancia;
    }
}

class TestClass {
    public static void main(String[] args) {
        Punto p1 = new Punto(7, 4);
        Punto p2 = new Punto(4, 7);
        Punto p3 = new Punto(10, 2);
        Punto p4 = new Punto(4, 6);
        Punto p5 = new Punto(10, 8);
        
        Punto[] arrayPuntos = {p1, p2, p3, p4, p5};
        
        Poligono poligono = new Poligono(arrayPuntos);
        poligono.escalar(2, 1);
        System.out.println("Escalado: \n" + poligono.toString());
        poligono.trasladar(2, 1);
        System.out.println("Trasladado: \n" + poligono.toString());
        
    }
}