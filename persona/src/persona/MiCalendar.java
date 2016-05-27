/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persona;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author laboratorios
 */
public class MiCalendar extends GregorianCalendar {

    public MiCalendar(int año, int mes, int dia) throws MiCalendarException {
        super(año, mes-1, dia);
        this.setLenient(false);
        
        try {
            get(Calendar.YEAR);
            get(Calendar.MONTH);
            get(Calendar.DAY_OF_MONTH);
        } catch (Exception e) {
            throw new MiCalendarException("Error al crear fecha: "+e.getMessage());
        }
    }

    public int getDia() {
        return get(Calendar.DAY_OF_MONTH);
    }

    public int getMes() {
        return get(Calendar.MONTH)+1;
    }
    public int getAño() {
        return get(Calendar.YEAR);
    }
    
    @Override
    public String toString() {
        return getDia()+"/"+getMes()+"/"+getAño();
    }
    
}
