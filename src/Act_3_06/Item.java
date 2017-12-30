package Act_3_06;

public class Item {
    
    private final int id;
    private String nombre;
    private static int cont = 0;
    
    public Item (String nombre) {
        this.nombre = nombre;
        id = ++cont;
    }
    
    public int getID() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
}

class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item("Ordinador");
        Item item2 = new Item("Pantalla");
        Item item3 = new Item("Teclat");
        
        System.out.println("Item 1 -> ID: " + item1.getID() + " Nom: " + item1.getNombre());
        System.out.println("Item 2 -> ID: " + item2.getID() + " Nom: " + item2.getNombre());
        System.out.println("Item 3 -> ID: " + item3.getID() + " Nom: " + item3.getNombre());
    }
}
