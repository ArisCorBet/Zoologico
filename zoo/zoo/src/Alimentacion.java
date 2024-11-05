public class Alimentacion {
    private String tipoAlimentacion;

    public Alimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void gestionarAlimentacion() {
        System.out.println("Gestionando alimentación de tipo: " + tipoAlimentacion);
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }
}