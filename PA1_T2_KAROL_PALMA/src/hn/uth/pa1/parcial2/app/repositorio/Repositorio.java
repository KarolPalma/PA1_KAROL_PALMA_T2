/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.app.repositorio;

import java.util.List;

/**
 *
 * @author karol
 */
public interface Repositorio<T> {
    public T seleccionar(T t) throws Exception ;
    
    public T buscar(Object id) throws Exception ;
    public List<T> buscarTodo() throws Exception ;
}
