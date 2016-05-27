/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Collection;
import persona.Alumno;

/**
 *
 * @author Gabriel
 */
public class AlumnoDAOTxt implements DAO<Alumno, Integer>{

    RandomAccessFile archivo;

    public AlumnoDAOTxt(File archivo) throws FileNotFoundException {
        this.archivo = new RandomAccessFile(archivo, "rws");
    }
    
    @Override
    public void create(Alumno alu) throws Exception{
        archivo.seek(archivo.length());
        archivo.writeBytes(alu.toString()+System.lineSeparator());
    }

    @Override
    public Alumno read(Integer clave) throws Exception {
        archivo.seek(0);
        String line = archivo.readLine();
        String fields[] = line.split(";");
        
        Alumno alu = new Alumno();
        alu.setDni(Integer.valueOf(fields[0]));
        
        return alu;
    }

    @Override
    public void update(Alumno entidad) throws Exception{
        archivo.seek(archivo.length());
        archivo.writeBytes(entidad.toString()+System.lineSeparator());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Alumno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Alumno> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@Override
	public void close()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

    
}
