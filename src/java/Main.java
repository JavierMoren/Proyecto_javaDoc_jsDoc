package java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        
        Libro libro1 = new Libro("Libro 1", "Autor 1", "ISBN001");
        Libro libro2 = new Libro("Libro 2", "Autor 2", "ISBN002");
        libros.add(libro1);
        libros.add(libro2);

        Libro.listarLibros(libros);
        
        Reserva.crearReserva(libro1, reservas);

        Reserva.cancelarReserva(libro1, reservas);

        Reserva.listarReservas(reservas);

    }
}

