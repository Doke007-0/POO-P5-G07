package ecu911.util;

/**
 * Reúne las validaciones de datos ingresados por el usuario, de forma que
 * las reglas estén en un solo lugar y puedan reutilizarse.
 */
public final class Validador {

    /** Cantidad exacta de dígitos que debe tener una cédula. */
    public static final int LONGITUD_CEDULA = 10;

    private Validador() {
        // Clase de utilidad: no se instancia.
    }

    /**
     * Indica si un texto contiene exactamente 10 dígitos numéricos.
     *
     * @param cedula texto a validar
     * @return {@code true} si cumple el formato
     */
    public static boolean esCedulaValida(String cedula) {
        return cedula != null && cedula.matches("\\d{" + LONGITUD_CEDULA + "}");
    }

    /**
     * Indica si un texto tiene contenido (no es nulo ni solo espacios).
     *
     * @param texto texto a validar
     * @return {@code true} si hay al menos un carácter visible
     */
    public static boolean noVacio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    /**
     * Validación sencilla de correo: debe tener una arroba y un punto
     * posterior, sin espacios.
     *
     * @param email correo a validar
     * @return {@code true} si tiene un formato razonable
     */
    public static boolean esEmailValido(String email) {
        return email != null && email.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+");
    }

    /**
     * Recorta un texto a un largo máximo, útil para tablas de consola.
     *
     * @param texto texto original
     * @param max   largo máximo permitido
     * @return texto original o recortado con "..." al final
     */
    public static String recortar(String texto, int max) {
        if (texto == null) {
            return "";
        }
        return texto.length() <= max ? texto : texto.substring(0, Math.max(0, max - 3)) + "...";
    }
}

