package Act_3_07;

public class Bombilla {
    enum estado {ON, OFF};
    private estado int_Bombilla = estado.OFF;
    private estado int_General = estado.ON;
    private estado bombilla = estado.OFF;
    
    public Bombilla() {
        bombilla = estado.OFF;
    }
    
    public void interrBombilla (estado estado) {
        if (estado == estado.ON) {
            int_Bombilla = estado.ON;
        } else if (estado == estado.OFF){
            int_Bombilla = estado.OFF;
            bombilla = estado.OFF;
        } else {
            System.out.println("Valor incorrecto!");
        }
    }
    
    public void interrGeneral (estado estado) {
        if (estado == estado.OFF) {
            int_Bombilla = estado.OFF;
        } else if (estado == estado.ON) {
            if (int_Bombilla == estado.ON) {
                bombilla = estado.ON;
            } else if (int_Bombilla == estado.OFF) {
                bombilla = estado.OFF;
            }
        }
    }
    
    public void getBombilla() {
        if (bombilla == estado.ON) {
            System.out.println("ON");
        } else if (bombilla == estado.OFF) {
            System.out.println("OFF");
        }
    }
}

class TestBombilla {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        b1.interrBombilla(Bombilla.estado.ON);
        b1.interrGeneral(Bombilla.estado.ON);
        System.out.print("Estado bombilla 1: ");
        b1.getBombilla();
        
        Bombilla b2 = new Bombilla();
        b2.interrBombilla(Bombilla.estado.OFF);
        b2.interrGeneral(Bombilla.estado.ON);
        System.out.print("Estado bombilla 2: ");
        b2.getBombilla();
    }
}
