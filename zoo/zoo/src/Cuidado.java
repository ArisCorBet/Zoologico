public class Cuidado {
    private String responsable;

    public Cuidado(String responsable) {
        this.responsable = responsable;
    }

    public void asignarResponsable(String nuevoResponsable) {
        this.responsable = nuevoResponsable;
    }

    public void gestionarLimpieza() {
        System.out.println("El responsable " + responsable + " está limpiando el área del animal.");
    }

    public void gestionarCuidado() {
        System.out.println("El responsable " + responsable + " está gestionando el cuidado general del animal.");
    }

    public String getResponsable() {
        return responsable;
    }
}

