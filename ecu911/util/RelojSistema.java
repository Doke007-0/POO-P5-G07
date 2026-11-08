package ecu911.util;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Proporciona la fecha y hora del sistema. Toda fecha de llamadas y notas se
 * obtiene aquí, nunca la ingresa el usuario.
 * <p>
 * Usa la fecha real del equipo por defecto, pero permite fijar un
 * {@link Clock} simulado (útil para pruebas o para la sustentación).
 * </p>
 */
public final class RelojSistema {

    /** Formato visible para el usuario: {@code dd/MM/yyyy - HH:mm}. */
    public static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");

    private static Clock reloj = Clock.systemDefaultZone();

    private RelojSistema() {
        // Clase de utilidad: no se instancia.
    }

    /**
     * Reemplaza el reloj del sistema (por ejemplo, por uno fijo para pruebas).
     *
     * @param nuevoReloj reloj a utilizar
     */
    public static void fijarReloj(Clock nuevoReloj) {
        reloj = nuevoReloj;
    }

    /**
     * Devuelve la fecha y hora actuales del sistema.
     *
     * @return fecha y hora actuales
     */
    public static LocalDateTime ahora() {
        return LocalDateTime.now(reloj);
    }

    /**
     * Devuelve la fecha actual del sistema (sin hora).
     *
     * @return fecha actual
     */
    public static LocalDate hoy() {
        return LocalDate.now(reloj);
    }

    /**
     * Da formato {@code dd/MM/yyyy - HH:mm} a una fecha y hora.
     *
     * @param fechaHora valor a formatear
     * @return texto formateado
     */
    public static String formatear(LocalDateTime fechaHora) {
        return fechaHora.format(FORMATO);
    }
}
