public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected int fechaNacimiento;

    public Persona(String nombre, String cedula, int fechaNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        return 2023 - fechaNacimiento;
    }
}
