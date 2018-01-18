/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_17;
import Act_5_09.Multimedia;
import Act_5_11.ListaMultimedia;
import Act_5_13.Disco;
import Act_5_10.Pelicula;
/**
 *
 * @author miquel
 */
public class PolimorfismoPrueba {
    public static void main(String[] args) throws Exception {
        ListaMultimedia l1 = new ListaMultimedia(10);
        Disco Nevermind = new Disco("Nevermind", "Nirvana", 80, Multimedia.formatos.mp3, Disco.Generos.ROCK);
        l1.add(Nevermind);
        Disco MasterOfPuppets = new Disco("Master Of Puppets", "Metallica", 120, Multimedia.formatos.cdAudio, Disco.Generos.METAL);
        l1.add(MasterOfPuppets);
        Disco HereComesTheSun = new Disco("Here Comes The Sun", "The Beatles", 120, Multimedia.formatos.wav, Disco.Generos.POP);
        l1.add(HereComesTheSun);
        Pelicula Avatar = new Pelicula("Avatar", "Tu madre", 110, Multimedia.formatos.avi, "Ac1", "Az 1");
        l1.add(Avatar);
        Pelicula DeadPool = new Pelicula("DeadPool 1", "Rami Malek", 220, Multimedia.formatos.wav, "Deadpool", null);
        l1.add(DeadPool);
        Pelicula SuperMan = new Pelicula("Superman", "Franco demerda", 90, Multimedia.formatos.wav, "Franco", null);
        l1.add(SuperMan);
        Multimedia[] aM = {Nevermind, MasterOfPuppets, HereComesTheSun, Avatar, DeadPool, SuperMan};
        System.out.println(l1.toString());
        double duracion = 0;
        int gruposRock = 0, sinActriz = 0;
        for (int i = 0; i < aM.length; i++) {
            duracion += aM[i].getDuracion();
            if (aM[i] instanceof Disco) {
                if (((Disco)aM[i]).getGenero() == Disco.Generos.ROCK) {
                    gruposRock++;
                }
            }
            if (aM[i] instanceof Pelicula) {
                if (((Pelicula)aM[i]).thereIsActriz() == false) {
                    sinActriz++;
                }
            }
        }
        System.out.println("Duracion total de la lista: " + duracion);
        System.out.println("Total grupos de rock: " + gruposRock);
        System.out.println("Películas sin actriz: " + sinActriz);
    }
}
