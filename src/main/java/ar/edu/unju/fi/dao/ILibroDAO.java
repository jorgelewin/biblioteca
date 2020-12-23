package ar.edu.unju.fi.dao;

import ar.edu.unju.fi.aplicacion.modelo.dominio.Libro;

public interface ILibroDAO {

    public void save(Libro libro);
    public Libro findById(Long id);
    
}
