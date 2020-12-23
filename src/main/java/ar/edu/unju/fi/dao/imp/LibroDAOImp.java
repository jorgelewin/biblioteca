package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.aplicacion.modelo.dominio.Libro;
import ar.edu.unju.fi.dao.ILibroDAO;

public class LibroDAOImp implements ILibroDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");

    @Override
    public void save(Libro libro) {
      
        EntityManager manager = emf.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(libro);

        manager.getTransaction().commit();

        manager.close();
    }

    @Override
    public Libro findById(Long id) {
        EntityManager manager = emf.createEntityManager();

       Libro libro = (Libro) manager.find(Libro.class, id);

        manager.close();

        if (libro == null) {

            return null;
            
        } else {
            
        
        return libro;
    }
    }
    
}
