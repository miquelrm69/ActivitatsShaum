/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_10;

import Act_5_09.Multimedia;
import java.lang.IllegalArgumentException;

/**
 *
 * @author miquel
 */
public class Pelicula extends Multimedia {

    private String actorPrincipal, actrizPrincipal;

    public Pelicula(String titulo, String autor, double duracion, formatos formato, String actorPrincipal, String actrizPrincipal) throws IllegalArgumentException {
        super(titulo, autor, duracion, formato);
        if (actrizPrincipal == null && actorPrincipal == null) {
           throw new IllegalArgumentException("Como mínimo debe haber un actor o actriz en la Película.");
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }
    
    public String getActor() {
        return actorPrincipal;
    }
    
    public String getActriz() {
        if (actorPrincipal == null) {
            return super.toString() + "\nActriz: " + actrizPrincipal;
        } else if (actrizPrincipal == null) {
            return super.toString() + "\nActor: " + actorPrincipal;
        }
        return super.toString() + "\nActor: " + actorPrincipal + "\nActriz: " + actrizPrincipal;
    }
    
    public String toString() {
        return super.toString() + "\nActriz: " + actrizPrincipal + "\nActor: " + actorPrincipal;
    }

    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Peli 1", "Jo", 120, formatos.wav, "Miquel Rossello", null);
        System.out.println(p1.toString());
    }
}