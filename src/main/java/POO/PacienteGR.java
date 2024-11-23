/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author USER
 */
public class PacienteGR extends PersonaGR {
    
    private String nroHistorialGR;
    private String enfermedadGR;

    public PacienteGR(String nroHistorialGR, String enfermedadGR, String nombreGR, int edadGR, String direccionGR) {
        super(nombreGR, edadGR, direccionGR);
        this.nroHistorialGR = nroHistorialGR;
        this.enfermedadGR = enfermedadGR;
    }
    
    

    public String getNroHistorialGR() {
        return nroHistorialGR;
    }

    public void setNroHistorialGR(String nroHistorialGR) {
        this.nroHistorialGR = nroHistorialGR;
    }

    public String getEnfermedadGR() {
        return enfermedadGR;
    }

    public void setEnfermedadGR(String enfermedadGR) {
        this.enfermedadGR = enfermedadGR;
    }
    
    
    
    
}