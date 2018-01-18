/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_14;
import Act_5_09.Multimedia;
import Act_5_11.ListaMultimedia;
import Act_5_13.Disco;

/**
 *
 * @author miquel
 */
public class MainDiscos {
    public static void main(String[] args) throws Exception {
        Disco d1 = new Disco("Nevermind", "Nirvana", 230, Multimedia.formatos.mp3, Disco.Generos.ROCK);
        Disco d2 = new Disco("Dhraa", "Roig!", 130, Multimedia.formatos.mp3, Disco.Generos.POP);
        Disco d3 = new Disco("Groenlandia", "Roig!", 200, Multimedia.formatos.cdAudio, Disco.Generos.POP);
        
        ListaMultimedia lista1 = new ListaMultimedia(10);
        
        lista1.add(d1);
        lista1.add(d2);
        lista1.add(d3);
        
        System.out.println(lista1.toString());
        
        System.out.println(lista1.get(lista1.indexOf(d3)));
    }
}
