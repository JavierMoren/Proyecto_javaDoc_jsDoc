package java;

import java.Libro.EstadoLibro;
import java.util.Date;
import java.util.List;

/**
 * La clase Reserva posee variables para poder introducir el libro,fecha de reserva y su fecha de devolucion
 * Posee metodos para Crear reservas, cancelarlas y listarlas
 * 
 * 
 * @author Javier Moreno Salas
 * @version 1.0
 */
public class Reserva {
    private Libro libro;
    private Date fechaReserva;
    private Date fechaDevolucion;

     /**
     * Constructor de la clase Reserva para crear una reserva con un libro, fecha de reserva y fecha de devolución.
     * 
     * @param libro - El libro que se va a reservar
     * @param fechaReserva - Fecha en que se realizó la reserva
     * @param fechaDevolucion - Fecha en que se debe devolver el libro
     */
    public Reserva( Libro libro, Date fechaReserva, Date fechaDevolucion) {
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Método estático para crear una reserva de un libro y agregarla a la lista de reservas.
     * 
     * @param libro - El libro que se va a reservar
     * @param reservas - La lista de reservas donde se agregará la nueva reserva
     */
    public static void crearReserva(Libro libro, List<Reserva> reservas) {
        if (libro.getEstado() == EstadoLibro.DISPONIBLE) {
            Date fechaReserva = new Date();
            Date fechaDevolucion = new Date(); 
            Reserva reserva = new Reserva( libro, fechaReserva, fechaDevolucion);
            reservas.add(reserva);
            libro.setEstado(EstadoLibro.RESERVADO);
            notificarReservaExitosa(); 
        } else {
            System.out.println("El libro no está disponible para reserva.");
        }
    }

    /**
     * Método estático para cancelar una reserva de un libro.
     * 
     * @param libro - El libro cuya reserva se va a cancelar
     * @param reservas - La lista de reservas donde se buscará y eliminará la reserva
     */
    public static void cancelarReserva(Libro libro, List<Reserva> reservas) {
        for (Reserva reserva : reservas) {
            if ( reserva.getLibro() == libro) {
                reservas.remove(reserva);
                libro.setEstado(EstadoLibro.DISPONIBLE);
                notificarCancelacionExitosa(); 
                return; 
            }
        }
        System.out.println("No se encontró ninguna reserva para cancelar.");
    }

    /**
     * Método estático para listar las reservas activas.
     * 
     * @param reservas - La lista de reservas a mostrar
     */
    public static void listarReservas(List<Reserva> reservas) {
        System.out.println("Lista de Reservas Activas:");
        for (Reserva reserva : reservas) {
            System.out.println("Libro: " + reserva.getLibro().getTitulo());
            System.out.println("Fecha de Reserva: " + reserva.getFechaReserva());
            System.out.println("Fecha de Devolución: " + reserva.getFechaDevolucion());
            System.out.println("------------------------");
        }
    }
 
    /**
     * Método estático para notificar una reserva exitosa.
     */
    public static void notificarReservaExitosa() {
        System.out.println("Reserva exitosa");
    }

    /**
     * Método estático para notificar una cancelación de reserva exitosa.
     */
    public static void notificarCancelacionExitosa() {
        System.out.println("Cancelación de reserva exitosa");
    }

    /**
     * Obtiene el libro asociado a la reserva.
     * 
     * @return el libro asociado a la reserva
     */
	public Libro getLibro() {
		return libro;
	}

    /**
     * Establece el libro asociado a la reserva.
     * 
     * @param libro - El libro que se va a asociar a la reserva
     */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

    /**
     * Obtiene la fecha de la reserva.
     * 
     * @return la fecha de la reserva
     */
	public Date getFechaReserva() {
		return fechaReserva;
	}

    /**
     * Establece la fecha de la reserva.
     * 
     * @param fechaReserva - La fecha en que se realizó la reserva
     */
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

    /**
     * Obtiene la fecha de devolución del libro reservado.
     * 
     * @return la fecha de devolución del libro reservado
     */
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

    /**
     * Establece la fecha de devolución del libro reservado.
     * 
     * @param fechaDevolucion - La fecha en que se debe devolver el libro
     */
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

    /**
     * Genera una representación en formato de cadena (String) de la reserva.
     * 
     * @return una cadena que representa la reserva en formato de texto
     */
    @Override
    public String toString() {
        return "Reserva{" +
                "libro=" + getLibro() +
                ", fechaReserva=" + getFechaReserva() +
                ", fechaDevolucion=" + getFechaDevolucion() +
                '}';
    }
   
}

