/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_20;

import java.util.LinkedList;

/**
 *
 * @author miquel
 */
public abstract class ColeccionSimple {
    
    private LinkedList<Object> lista;
    
    public ColeccionSimple() {
        lista = new LinkedList<Object>();
    }
    
    public boolean estaVacia() {
        return lista.isEmpty();
    }
    
    public Object extraer() {
        return lista.removeFirst();
    }
    
    public Object primero() {
        return lista.get(0);
    }
    
    public abstract void anadir(Object obj);
    
    protected LinkedList<Object> getLista() {
        return lista;
    }
    
    public String toString() {
        String stringOut = "";
        for (int x = 0; x < lista.size(); x++) {
            stringOut += lista.get(x) + "\n";
        }
        return stringOut;
    }
}
