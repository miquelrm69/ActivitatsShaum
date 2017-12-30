package Act_3_05;

public class Elemento {
    private static int numElementos = 0;
    private String nombre;
    
    public Elemento(String nombre) {
        this.nombre = nombre;
        
        numElementos++;
    }
    
    static int numeroElementos() {
        return numElementos;
    }
}

class Test {
    public static void main(String[] args) {
        Elemento e1 = new Elemento("Elemento 1");
        Elemento e2 = new Elemento("Elemento 2");
        Elemento e3 = new Elemento("Elemento 3");
        
        System.out.println("Numero de elementos instanciados: " + Elemento.numeroElementos());
    }
}
