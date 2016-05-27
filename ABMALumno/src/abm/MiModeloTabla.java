/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abm;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import persona.Alumno;

/**
 *
 * @author Néstor
 */
public class MiModeloTabla extends AbstractTableModel
{
	public MiModeloTabla()
	{
		listaAlumnos = new ArrayList();
	}
	
	
	public void setLista(List<Alumno> lista)
	{
		listaAlumnos = lista;
		fireTableDataChanged();
	}
	
	
	@Override
	public int getRowCount()
	{
		return listaAlumnos.size();
	}

	@Override
	public int getColumnCount()
	{
		return 7;
	}
	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		Alumno alu = listaAlumnos.get(rowIndex);
		
		switch(columnIndex)
		{
			case 0: return alu.getDni();
			case 1: return alu.getApellido();
			default: return null;
		}
	}
	
	
	
	private List<Alumno> listaAlumnos;
}
