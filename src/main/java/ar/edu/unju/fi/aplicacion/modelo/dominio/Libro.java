package ar.edu.unju.fi.aplicacion.modelo.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIBROS")
public class Libro implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "lib_codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "lib_isbn")
    private Integer ISBN;
    @Column(name = "lib_titulo")
    private String titulo;

    public Libro(Integer iSBN, String titulo) {
        ISBN = iSBN;
        this.titulo = titulo;
    }

    public Libro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + "]";
    }

    
    
    
}
