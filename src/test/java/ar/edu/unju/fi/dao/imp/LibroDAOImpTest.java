package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.aplicacion.modelo.dominio.Libro;
import ar.edu.unju.fi.dao.ILibroDAO;

public class LibroDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;
    ILibroDAO libroDAO;
    Libro libro;

    @BeforeEach
    public void setUp() throws Exception {

        emf = Persistence.createEntityManagerFactory("biblioteca");
        manager = emf.createEntityManager();
        libroDAO = new LibroDAOImp();
        libro = new Libro(545655664, "C++ Joyanes");

    }

    @AfterEach
    public void tearDown() throws Exception {
   
        libroDAO = null;
        libro = null;
    }
    @Test
    public void agregarLibroTest() {

        libroDAO.save(libro);

        assertEquals(1L, ((Libro) manager.find(Libro.class, 1L)).getId());
        
    }
}
