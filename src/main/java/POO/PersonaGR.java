/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author USER
 */
public class PersonaGR {
    private String nombreGR; 
    private int edadGR;
    private String direccionGR;

    public PersonaGR(String nombreGR, int edadGR, String direccionGR) {
        this.nombreGR = nombreGR;
        this.edadGR = edadGR;
        this.direccionGR = direccionGR;
    }
    

    public String getNombreGR() {
        return nombreGR;
    }

    public void setNombreGR(String nombreGR) {
        this.nombreGR = nombreGR;
    }

    public int getEdadGR() {
        return edadGR;
    }

    public void setEdadGR(int edadGR) {
        this.edadGR = edadGR;
    }

    public String getDireccionGR() {
        return direccionGR;
    }

    public void setDireccionGR(String direccionGR) {
        this.direccionGR = direccionGR;
    }
    
    


       
}