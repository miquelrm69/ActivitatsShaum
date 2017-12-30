package Act_3_11;

public class Cadena2 {
    private String nombre, apellido_1, apellido_2;
    int longitud;
    
    public Cadena2(String nombre, String apellido_1, String apellido_2) {
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
    }
    
    String encadenadoCompleto() {
        longitud = nombre.length() + apellido_1.length() + apellido_2.length();
        return nombre + " " + apellido_1 + " " + apellido_2;
    }
}

class TestCadena2 {
    public static void main(String[] args) {
        Cadena2 c1 = new Cadena2("Juan", "Pérez", "López");
        System.out.println(c1.encadenadoCompleto());
        System.out.println("Longitud: " + c1.longitud);
    }
}
