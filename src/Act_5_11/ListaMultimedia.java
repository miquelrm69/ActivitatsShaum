/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_11;

import Act_5_09.Multimedia;

public class ListaMultimedia {

    private Multimedia[] aMultimedia;
    private int contador;

    public ListaMultimedia(int numObj) throws IllegalArgumentException {
        if ( ! (numObj > 0) ) {
            throw new IllegalArgumentException("Como mínimo un objeto Multimedia!");
        }
        aMultimedia = new Multimedia[numObj];
        contador = 0;
    }

    private boolean llena() {
        if (contador == 0) {
            return false;
        }
        for (int i = 0; i < aMultimedia.length; i++) {
            if (aMultimedia[i] != null) {
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        return contador;
    }

    public boolean add(Multimedia m) throws Exception {
        for (int i = 0; i < aMultimedia.length; i++) {
            if (aMultimedia[i] == null) {
                aMultimedia[i] = m;
                contador++;
                return true;
            }
        }
        return false;
    }
    
    public Multimedia get(int m) throws Exception{
        if (!llena()) {
            throw new Exception("Array vacío! Nothing to return");
        }
        return aMultimedia[m];
    }
    
    public int indexOf(Multimedia m) throws Exception {
        if (!llena()) {
            throw new Exception("Array vacío! Nothing to return");
        }
        for (int i = 0; i < aMultimedia.length; i++) {
            if (aMultimedia[i] == m) {
                System.out.print("Posicion: ");
                return i;
            }
        }
        System.out.print("No se encuentra el objeto. ");
        return -1;
    }
    
    public String toString() {
        String info = "";
        for (int i = 0; i < aMultimedia.length; i++) {
            if (aMultimedia[i] != null) {
                info += aMultimedia[i].toString();
            }
        }
        return info;
    }
}