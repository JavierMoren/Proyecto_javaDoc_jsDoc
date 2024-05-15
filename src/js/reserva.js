/**  
* La clase Reserva representa la reserva de un libro por parte de un usuario, con información sobre 
* el usuario, el libro, la fecha de reserva y la fecha de devolución.
*
* @class
*/
class Reserva {

    /**
     * Constructor para crear una reserva
     * @param {string} usuario - El usuario que realizó la reserva.
     * @param {string} libro - El parámetro "libro" representa el libro que se está reservando.
     * @param {Date} fechaReserva - El parámetro "fechaReserva" representa la fecha en que el usuario reservó el libro.
     * @param {Date} fechaDevolucion - El parámetro "fechaDevolucion" representa la fecha en que se espera que el libro sea devuelto o la fecha de vencimiento para devolver el libro.
     */
    constructor(usuario, libro, fechaReserva, fechaDevolucion) {
      this.usuario = usuario;
      this.libro = libro;
      this.fechaReserva = fechaReserva;
      this.fechaDevolucion = fechaDevolucion;
    }
  
    /**
     * Retorna el valor de la propiedad "usuario".
     * @returns {string} El valor de la propiedad "usuario".
     */
    getUsuario() {
      return this.usuario;
    }
  
    /**
     * La función establece el valor de la propiedad "usuario" en el objeto actual.
     * @param usuario - El parámetro "usuario" es una variable que representa al usuario o el nombre de usuario
     * que desea establecer para un objeto o instancia en particular.
     */
    setUsuario(usuario) {
      this.usuario = usuario;
    }
  
    /**
     * La función "getLibro" devuelve el valor de la propiedad "libro".
     * @returns El valor de la variable "libro" está siendo devuelto.
     */
    getLibro() {
      return this.libro;
    }
  
    /**
     * La función establece el valor de la propiedad "libro" en el objeto actual.
     * @param libro - El parámetro "libro" es una variable que representa un objeto libro.
     */
    setLibro(libro) {
      this.libro = libro;
    }
  
    /**
     * La función "getFechaReserva" devuelve el valor de la propiedad "fechaReserva".
     * @returns El método está retornando el valor de la variable "fechaReserva".
     */
    getFechaReserva() {
      return this.fechaReserva;
    }
  
    /**
     * La función establece el valor de la propiedad "fechaReserva".
     * @param fechaReserva - El parámetro "fechaReserva" es una variable que representa la fecha de una
     * reserva.
     */
    setFechaReserva(fechaReserva) {
      this.fechaReserva = fechaReserva;
    }
  
    /**
     * La función "getFechaDevolucion" devuelve el valor de la propiedad "fechaDevolucion".
     * @returns El método está retornando el valor de la variable "fechaDevolucion".
     */
    getFechaDevolucion() {
      return this.fechaDevolucion;
    }
  
    /**
     * La función establece el valor de la propiedad "fechaDevolucion".
     * @param fechaDevolucion - El parámetro "fechaDevolucion" es una variable que representa la fecha de
     * devolución o entrega.
     */
    setFechaDevolucion(fechaDevolucion) {
      this.fechaDevolucion = fechaDevolucion;
    }
  }
  
  module.exports = Reserva;
  