public class Veterinario extends Personal {
    private String especializacion;

    public Veterinario(String nombre, String cedula, int fechaNacimiento, double salario, String especializacion) {
        super(nombre, cedula, fechaNacimiento, "Veterinario", salario);
        this.especializacion = especializacion;
    }

    public void revisarAnimal() {
        System.out.println("El veterinario " + nombre + " está revisando un animal.");
        System.out.println("Especializacion " + especializacion);
    }

    @Override
    public void realizarTarea() {
        revisarAnimal();
    }
}
