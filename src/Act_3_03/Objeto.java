package Act_3_03;

public class Objeto {
    
    private int potencia;
    private boolean encendido;
    
    public Objeto(int potencia) {
        this.potencia = potencia;
        encendido = false;
    }
    
    void print() {
        System.out.println("Potencia de " + potencia + " Esta encendido? " + encendido);
    }
    
    int getPotencia() {
        return potencia;
    }
    
    boolean getEncendido () {
        return encendido;
    }
    
    void setEncendido(boolean e) {
        encendido = e;
    }
}
