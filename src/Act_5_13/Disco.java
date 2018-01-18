/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_13;

import Act_5_09.Multimedia;

/**
 *
 * @author miquel
 */
public class Disco extends Multimedia {
    private Generos genero;
    public enum Generos {POP, ROCK, METAL, BLUES, REGGAE, PUNK, FUNK, HOUSE, SKA};

    public Disco(String titulo, String autor, double duracion, formatos formato, Generos genero) throws IllegalArgumentException {
        super(titulo, autor, duracion, formato);
        this.genero = genero;
    }
    
    public Generos getGenero() {
        return genero;
    }
    
    public String toString() {
        return super.toString() + "\nGenero: " + genero + "\n";
    }
}
