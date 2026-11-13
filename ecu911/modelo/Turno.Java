package com.ecu911.modelo;

/**
 * Turnos de trabajo de un operador.
 */
public enum Turno {
    /** Turno de la mañana. */
    MATUTINO("Matutino"),
    /** Turno de la tarde. */
    VESPERTINO("Vespertino"),
    /** Turno de la noche. */
    NOCTURNO("Nocturno");

    private final String etiqueta;

    Turno(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * Texto que se muestra al usuario.
     *
     * @return etiqueta legible del turno
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public String toString() {
        return etiqueta;
    }
}
