public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected String sexo;
    protected String caracteristicas;
    private Cuidado cuidado;

    public Animal(String nombre, String especie, int edad, String sexo, String caracteristicas) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sexo = sexo;
        this.caracteristicas = caracteristicas;
        this.cuidado = new Cuidado("Sin asignar");
    }

    public void alimentar() {
        System.out.println("Alimentando al animal: " + nombre);
    }

    public void revisarSalud() {
        System.out.println("Revisando la salud del animal: " + nombre);
    }

    public String verCaracteristicas() {
        return caracteristicas;
    }

    public void asignarCuidado(Cuidado cuidado) {
        this.cuidado = cuidado;
    }

    public void gestionarCuidado() {
        if (cuidado != null) {
            cuidado.gestionarCuidado();
            cuidado.gestionarLimpieza();
        } else {
            System.out.println("No se ha asignado un responsable de cuidado para " + nombre);
        }
    }

    public String getNombre() {
        return null;
    }

    public String getEspecie() {
        return null;
    }
}


