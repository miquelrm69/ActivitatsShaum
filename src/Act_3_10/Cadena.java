package Act_3_10;

public class Cadena {
    String nombre;
    String apellido_1;
    
    public Cadena(String nombre, String apellido_1) {
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
    }
}

class TestCadena {
    public static void main(String[] args) {
        Cadena c1 = new Cadena("Juan", "Pérez");
        System.out.println(c1.nombre + " " + c1.apellido_1);
        System.out.println(c1.nombre + ": Longitud de " + c1.nombre.length() + " letras.");
        System.out.println(c1.apellido_1 + ": Longitud de " + c1.apellido_1.length() + " letras.");
    }
}
