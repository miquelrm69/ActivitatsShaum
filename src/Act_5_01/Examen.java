/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_01;

/**
 *
 * @author miquel
 */
public class Examen {
    private String nombreAsignatura;
    private String aula;
    private Fecha fechaExamen;
    private Hora horaExamen;
    
    public Examen(String nombreAsignatura, String aula, Fecha fechaExamen, Hora horaExamen) {
        this.nombreAsignatura = nombreAsignatura;
        this.aula = aula;
        this.fechaExamen = fechaExamen;
        this.horaExamen = horaExamen;
    }
    
    String getNombreAsignatura() {
        return nombreAsignatura;
    }
    
    String getAula() {
        return aula;
    }
    
    Fecha getFecha() {
        return fechaExamen;
    }
    
    Hora getHora() {
        return horaExamen;
    }
    
    void setNombreAsignatura(String nombre) {
        nombreAsignatura = nombre;
    }
    
    void setAula (String aula) {
        this.aula = aula;
    }
    
    void setFecha(Fecha fecha) {
        fechaExamen = fecha;
    }
    
    void setHora(Hora hora) {
        horaExamen = hora;
    }
    
    public String toString() {
        return "Asignatura: " + nombreAsignatura + " - Aula: " + aula + " - Fecha: " + fechaExamen + " - Hora: " + horaExamen;
    }
}
