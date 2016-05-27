/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Collection;

/**
 *
 * @author Gabriel
 * @param <T>
 */
public interface DAO<T, U> {
    
    public void create(T entidad) throws Exception;
    public T read(U clave) throws Exception;
    public void update(T entidad) throws Exception;
    public void delete(T entidad);
    
    public Collection<T> listarTodos();

	public void close();
    
}
