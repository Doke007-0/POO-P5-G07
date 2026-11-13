package ecu911.modelo;

/**
 * Tipos de emergencia que un operador puede registrar.
 */
public enum TipoEmergencia {
    /** Emergencias de energía eléctrica. */
    ENERGIA("Energía"),
    /** Emergencias civiles. */
    CIVIL("Civil"),
    /** Emergencias de tránsito. */
    TRANSITO("Tránsito"),
    /** Emergencias de medio ambiente. */
    MEDIO_AMBIENTE("Medio ambiente"),
    /** Cualquier otra emergencia. */
    OTROS("Otros");

    private final String etiqueta;

    TipoEmergencia(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * Texto que se muestra al usuario.
     *
     * @return etiqueta legible del tipo
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public String toString() {
        return etiqueta;
    }
}