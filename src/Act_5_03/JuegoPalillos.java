/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_03;

/**
 *
 * @author miquel
 */
public class JuegoPalillos {
    FilaPalillos[] arrayFPalillos;
    
    public JuegoPalillos(int filas[]) {
        arrayFPalillos = new FilaPalillos[filas.length];
        for ( int i = 0 ; i < filas.length ; i++ ){
            arrayFPalillos[i] = new FilaPalillos(filas[i]);
        }  
    }
    
    public boolean quitaPalillos(int fila, int cantQuita) {
        
        if ( fila > arrayFPalillos.length )   {
            return false;
        }
        
        return arrayFPalillos[fila - 1].quitaPalillos(cantQuita);
    }
    
    public boolean finDeJuego() {
        
        for (int i = 0; i < arrayFPalillos.length; i++) {
            
           if (arrayFPalillos[i].esPlena()) {
               return false;
           }
        }
        return true;
    }
    
    public String toString() {
        String palillosJuego = "";
        for (int i = 0; i < arrayFPalillos.length; i++) {
            palillosJuego += ("Fila - " + (i + 1) + " ") + arrayFPalillos[i].toString() + System.lineSeparator();
        }
        return palillosJuego;
    }
}
