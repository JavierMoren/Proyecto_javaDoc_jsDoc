const Libro = require('./Libro');
const Reserva = require('./Reserva');

const libros = [];
const reservas = [];

/**
 * Muestra el formulario por pantalla
 */
function mostrarFormulario() {
  console.log('Formulario mostrado');
}

/**
 * Oculta el formulario por pantalla
 */
function ocultarFormulario() {
  console.log('Formulario oculto');
}

/**
 * Muestra la lista de libros
 */
function mostrarListaLibros() {
  console.log('Lista de Libros:');
  libros.forEach((libro, index) => {
    console.log(`Libro ${index + 1}:`);
    console.log(`Título: ${libro.getTitulo()}`);
    console.log(`Autor: ${libro.getAutor()}`);
    console.log(`ISBN: ${libro.getISBN()}`);
    console.log(`Estado: ${libro.getEstado()}`);
    console.log('--------------');
  });
}

/**
 * Muestra la lista de Reserva
 */
function mostrarListaReservas() {
  console.log('Lista de Reservas:');
  reservas.forEach((reserva, index) => {
    console.log(`Reserva ${index + 1}:`);
    console.log(`Usuario: ${reserva.getUsuario()}`);
    console.log(`Libro: ${reserva.getLibro().getTitulo()}`);
    console.log(`Fecha de Reserva: ${reserva.getFechaReserva()}`);
    console.log(`Fecha de Devolución: ${reserva.getFechaDevolucion()}`);
    console.log('--------------');
  });
}

const libro1 = new Libro('El Principito', 'Antoine de Saint-Exupéry', '978-84-207-3127-2', 'disponible');
const libro2 = new Libro('Don Quijote', 'Miguel de Cervantes', '978-84-15459-42-2', 'reservado');
const reserva1 = new Reserva('Usuario1', libro1, '2023-10-01', '2023-10-15');
const reserva2 = new Reserva('Usuario2', libro2, '2023-10-05', '2023-10-20');

libros.push(libro1, libro2);
reservas.push(reserva1, reserva2);

mostrarFormulario();
ocultarFormulario();
mostrarListaLibros();
mostrarListaReservas();


