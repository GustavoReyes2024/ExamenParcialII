/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author USER
 */
public class MedicoGR extends PersonaGR {
    
    private String EspecialidadGR;
        private String anio_experienciaGR;

    public MedicoGR(String EspecialidadGR, String anio_experienciaGR, String nombreGR, int edadGR, String direccionGR) {
        super(nombreGR, edadGR, direccionGR);
        this.EspecialidadGR = EspecialidadGR;
        this.anio_experienciaGR = anio_experienciaGR;
    }
    

    public String getEspecialidadGR() {
        return EspecialidadGR;
    }

    public void setEspecialidadGR(String EspecialidadGR) {
        this.EspecialidadGR = EspecialidadGR;
    }

    public String getAnio_experienciaGR() {
        return anio_experienciaGR;
    }

    public void setAnio_experienciaGR(String anio_experienciaGR) {
        this.anio_experienciaGR = anio_experienciaGR;
    }
    
}
