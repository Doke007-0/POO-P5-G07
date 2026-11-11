package ecu911.modelo;


public abstract class Persona {

    private String nombres;
    private String apellidos;

    /**
     * Crea una persona.
     *
     * @param nombres   nombres (obligatorio)
     * @param apellidos apellidos (obligatorio)
     */
    protected Persona(String nombres, String apellidos) {
        this.nombres = nombres.trim();
        this.apellidos = apellidos.trim();
    }

    /**
     * Identificador propio de cada tipo de persona: el código en un operador
     * y la cédula en un ciudadano (polimorfismo).
     *
     * @return 
     */
    public abstract String getIdentificador();

    /**
     * Obtiene los nombres.
     *
     * @return 
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Cambia los nombres.
     *
     * @param nombres 
     */
    public void setNombres(String nombres) {
        this.nombres = nombres.trim();
    }

    /**
     * Obtiene los apellidos.
     *
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Cambia los apellidos.
     *
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos.trim();
    }

    /**
     * Nombre completo: todos los nombres y todos los apellidos.
     *
     * @return 
     */
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * Nombre corto: primer nombre y primer apellido.
     *
     * @return 
     */
    public String getNombreCorto() {
        return primeraPalabra(nombres) + " " + primeraPalabra(apellidos);
    }

    /**
     * Primer nombre seguido de todos los apellidos.
     *
     * @return 
     */
    public String getPrimerNombreYApellidos() {
        return primeraPalabra(nombres) + " " + apellidos;
    }

    private static String primeraPalabra(String texto) {
        return texto.split("\\s+")[0];
    }

    @Override
    public String toString() {
        return getNombreCompleto();
    }
}
