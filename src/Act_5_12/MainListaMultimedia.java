/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_12;
import Act_5_09.Multimedia;
import Act_5_11.ListaMultimedia;
import Act_5_10.Pelicula;
/**
 *
 * @author miquel
 */
public class MainListaMultimedia {
    public static void main(String[] args) throws Exception {
        ListaMultimedia l1 = new ListaMultimedia(10);
        Pelicula p1 = new Pelicula("Peli 1", "Miquel RM", 90, Multimedia.formatos.wav, "Actor 1", null);
        Pelicula p2 = new Pelicula("Peli 2", "Joan Fornes", 150, Multimedia.formatos.avi, "Joan", "Maria");
        Pelicula p3 = new Pelicula("Peli 3", "Phillip", 60, Multimedia.formatos.dvd, "Phillip", "Actriz 1");
        
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        
        System.out.println(l1.toString());
        
        System.out.println(l1.get(l1.indexOf(p3)));
    }
}
