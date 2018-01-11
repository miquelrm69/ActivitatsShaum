/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_03;

import javafx.beans.property.BooleanPropertyBase;

/**
 *
 * @author miquel
 */
public class FilaPalillos {
    int totalPalillosFila, actualPalillos;
    public FilaPalillos(int cantPalillosFila) {
        
        actualPalillos = ( cantPalillosFila < 1 ) ? 1 : cantPalillosFila;
        this.totalPalillosFila = actualPalillos;
       
    }
    
    public String toString() {
        String palillos = "";
        for (int i = 0; i < actualPalillos; i++) {
            palillos += "|";
        }
        return palillos;
    }
    
    public boolean quitaPalillos(int numPalillos) {
        if (actualPalillos - numPalillos < 0) {
            return false;
        }
        actualPalillos -= numPalillos;
        return true;
    }
    
    public boolean anadePalillos(int numPalillos) {
        if (numPalillos + actualPalillos > totalPalillosFila) {
            return false;
        }
        actualPalillos += numPalillos;
        return true;
    }
    
    public int cuntosPalillos() {
        return actualPalillos;
    }
    
    public boolean esPlena(){
        return ( actualPalillos != 0 ) ;
    }
}
