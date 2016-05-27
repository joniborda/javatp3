/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import persona.Alumno;
import persona.MiCalendar;
import persona.MiCalendarException;
import persona.PersonaInvalidaException;

/**
 *
 * @author Gabriel
 */
public class Test {
    
    public static void main(String[] args) throws PersonaInvalidaException, MiCalendarException, FileNotFoundException, Exception {
        
        MiCalendar fechaNac = new MiCalendar(2014, 1, 22);
        Alumno alu = new Alumno(fechaNac, "a", 11, 2.2, 2222223, "Juana", "Perez", 'F');
        
        MiCalendar fechaIng = new MiCalendar(2016, 10, 12);
        alu.setFechaIngreso(fechaIng);
        
        alu.setCantMatAprob(55);
        alu.setPromedio(7.5);
        alu.setCarrera("Ing. en Sistemas");
        
        DAO dao = new AlumnoDAOTxt(new File("Alumno.txt"));
        dao.create(alu);
    }
}
