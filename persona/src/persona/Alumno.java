/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persona;

/**
 *
 * @author laboratorios
 */
public class Alumno extends Persona{

    private MiCalendar fechaIngreso;
    
    private String carrera;
    
    private Integer cantMatAprob;
    
    private Double promedio;
    
    public Alumno() {
        
    }
    
    public Alumno(MiCalendar fechaIngreso, String carrera, Integer cantMatAprob, Double promedio, Integer dni, String nombre, String apellido, Character sexo) throws PersonaInvalidaException, AlmunoInvalidoException {
        super(dni, nombre, apellido, sexo);
        this.fechaIngreso = fechaIngreso;
        this.carrera = carrera;
        
        validacantMatAprob(cantMatAprob);
        
        this.cantMatAprob = cantMatAprob;
        this.promedio = promedio;
    }
    
    public MiCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(MiCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getCantMatAprob() {
        return cantMatAprob;
    }

    public void setCantMatAprob(Integer cantMatAprob) {
        this.cantMatAprob = cantMatAprob;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    private void validacantMatAprob(Integer cantMatAprob) throws AlmunoInvalidoException {
        if(cantMatAprob <0){
        throw new AlmunoInvalidoException("La cantidad de materias es invalida"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public String toString() {
        return 
                this.getDni() + ";" +
                this.getNombre() + ";" +
                this.getApellido() + ";" +
                this.getSexo() + ";" +
                this.getFechaNac() + ";" +
                this.getFechaIngreso() + ";" +
                this.getCarrera() + ";" +
                this.getCantMatAprob() + ";" +
                this.getPromedio() + ";";
    }
    
}
