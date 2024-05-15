package java;

import java.util.List;
/**
 * La clase Libro posee variables para poder introducir el titulo, autor, ISBN y su estado
 * Posee metodos para listar los libros, ademas de su constructor
 * 
 * 
 * @author Javier Moreno Salas
 * @version 1.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private EstadoLibro estado;
    
    public enum EstadoLibro {
        DISPONIBLE,
        RESERVADO
    }

    /**
     * Constructor para inicializar libro con los valores de titulo, autor y ISBN
     * 
     * @param titulo - El nombre del libro
     * @param autor - EL nombre del autor del libro
     * @param ISBN - El codigo ISBN
     */
    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estado = EstadoLibro.DISPONIBLE; 
    }
    
    /**
     * Metodo el cual muestra por pantalla un listado de libros
     * 
     * @param libros - Lista de libros
     */
    public static void listarLibros(List<Libro> libros) {
        System.out.println("Lista de Libros:");

        for (Libro libro : libros) {
            String estado = (libro.getEstado() == EstadoLibro.DISPONIBLE) ? "Disponible" : "Reservado";
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISBN: " + libro.getISBN());
            System.out.println("Estado: " + estado);
            System.out.println("------------------------");
        }
    }

    /**
     * Obtiene el titulo del Libro
     * 
     * @return el titulo del libro
     */
    public String getTitulo() {
		return titulo;
	}


    /**
     * Establece el titulo
     * 
     * @param titulo - Nuevo titulo del libro
     */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


    /**
     * Obtiene el nombre del autor del Libro
     * 
     * @return el nombre del autor del libro
     */
	public String getAutor() {
		return autor;
	}


    /**
     * Establece el nombre del autor del libro
     * 
     * @param autor - Nuevo nombre del autor del libro
     */
	public void setAutor(String autor) {
		this.autor = autor;
	}


    /**
     * Obtiene el código ISBN del Libro
     * 
     * @return el código ISBN del libro
     */
	public String getISBN() {
		return ISBN;
	}


    /**
     * Establece el código ISBN del libro
     * 
     * @param iSBN - Nuevo código ISBN del libro
     */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


    /**
     * Obtiene el estado del Libro
     * 
     * @return el estado del libro
     */
	public EstadoLibro getEstado() {
        return estado;
    }

    /**
     * Establece el estado del libro
     * 
     * @param estado - Nuevo estado del libro
     */
    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    /**
     * Genera una representación en formato de cadena (String) del objeto Libro.
     * 
     * @return una cadena que representa el libro en formato de texto
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", estado=" + getEstado() +
                '}';
    }

}
