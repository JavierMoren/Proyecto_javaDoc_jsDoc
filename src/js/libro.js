/**
 * La clase representa un libro con propiedades como título, autor, ISBN y estado.
 *  
 * @class
 */
class Libro {
    /**
     * Función constructora que crea objetos de libros.
     * 
     * @param {string} titulo - El parámetro "titulo" representa el título del libro.
     * @param {string} autor - El parámetro "autor" representa el autor del libro.
     * @param {string} ISBN - El ISBN (Número Internacional Normalizado del Libro) es un identificador único para los libros. Se utiliza para identificar una edición específica de un libro.
     * @param {string} estado - El parámetro "estado" representa la condición o estado del libro. Puede usarse para indicar si el libro es nuevo, usado, dañado u otra condición relevante.
     */
    constructor(titulo, autor, ISBN, estado) {
      this.titulo = titulo;
      this.autor = autor;
      this.ISBN = ISBN;
      this.estado = estado;
    }
  
    /**
     * Obtiene el título del libro.
     * @returns {string} El título del libro.
     */
    getTitulo() {
      return this.titulo;
    }

    /**
    * Establece el título del libro.
    * @param {string} titulo - El nuevo título del libro.
    */
    setTitulo(titulo) {
      this.titulo = titulo;
    }

    /**
    * Obtiene el autor del libro.
    * @returns {string} El autor del libro.
    */
    getAutor() {
      return this.autor;
    }

    /**
    * Establece el autor del libro.
    * @param {string} autor - El nuevo autor del libro.
    */
    setAutor(autor) {
      this.autor = autor;
    }

    /**
    * Obtiene el ISBN del libro.
    * @returns {string} El ISBN del libro.
    */
    getISBN() {
      return this.ISBN;
    }

    /**
    * Establece el ISBN del libro.
    * @param {string} ISBN - El nuevo ISBN del libro.
    */
    setISBN(ISBN) {
      this.ISBN = ISBN;
    }

    /**
    * Obtiene el estado del libro.
    * @returns {string} El estado del libro.
    */
    getEstado() {
      return this.estado;
    }

    /**
    * Establece el estado del libro.
    * @param {string} estado - El nuevo estado del libro.
    */
    setEstado(estado) {
      this.estado = estado;
    }

  }
  
  module.exports = Libro;
  