package Act_3_03;

public class Consumo {
    public static double consumoTotal, consumoActual;
    
    public static double consultaConsumoActual() {
        return consumoActual;
    }
    
    public static void enciende(Objeto obj) {
        
        if (! obj.getEncendido()) {
            consumoTotal += obj.getPotencia();
            consumoActual += obj.getPotencia();
            obj.setEncendido(true);
        }
    }
    
    public static void apaga (Objeto obj) {
        if (obj.getEncendido()) {
            consumoActual -= obj.getPotencia();
            obj.setEncendido(false);
        }
    }
}

class TestConsumo {
    public static void main(String[] args) {
        
        Objeto bombilla = new Objeto(100);
        Objeto plancha = new Objeto(1200);
        Objeto radiador = new Objeto(2000);
        
        System.out.println("Consumo total: " + Consumo.consultaConsumoActual());
        
        Consumo.enciende(bombilla);
        Consumo.enciende(plancha);
        
        System.out.println("Consumo total: " + Consumo.consultaConsumoActual());
        
        Consumo.apaga(plancha);
        Consumo.enciende(radiador);
        
        System.out.println("Consumo total: " + Consumo.consultaConsumoActual());
    }
}