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
public class Persona {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Character sexo;
    private MiCalendar fechaNac;
    
    public Persona() {
    }
    
    public Integer getDni() {
        return dni;
    }

    public MiCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(MiCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setDni(Integer dni) throws PersonaInvalidaException {
        validarDNI(dni);
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Persona(Integer dni, String nombre, String apellido, Character sexo) throws PersonaInvalidaException {
        validarDNI(dni);
        this.dni = dni;
        this.nombre = nombre.trim();
        this.apellido = apellido.trim();
        validarSexo(sexo);
        this.sexo = sexo;
    }

    private void validarDNI(Integer dni) throws PersonaInvalidaException {
        if (dni < 0 || dni > 99999999){
            throw new PersonaInvalidaException("El DNI no es correcto"); //To change body of generated methods, choose Tools | Templates.
            }
    }

    private void validarSexo(Character sexo) throws PersonaInvalidaException {
        if(Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F'){
        throw new PersonaInvalidaException("El sexo es incorrecto"); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    @Override
    public String toString() {
        return 
                this.getDni() + ";" +
                this.getNombre() + ";" +
                this.getApellido() + ";" +
                this.getSexo() + ";" +
                this.getFechaNac() + ";";
    }
    
}
