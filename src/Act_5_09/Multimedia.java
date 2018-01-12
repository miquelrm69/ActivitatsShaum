package Act_5_09;

/**
 *
 * @author miquel
 */
public class Multimedia {
    private formatos formato;
    public enum formatos {wav, mp3, midi, avi, mov, mpg, cdAudio, dvd};
    private String titulo, autor;
    private double duracion;
    
    public Multimedia(String titulo, String autor, double duracion, formatos formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public double getDuracion() {
        return duracion;
    }
    
    public formatos getFormato() {
        return formato;
    }
    
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nDuracion: " + duracion + "\nFormato: " + formato;
    }
    
    public boolean equals(Multimedia objM2) {
        return titulo.equals(objM2.getTitulo()) && autor.equals(objM2.getAutor());
    }
}