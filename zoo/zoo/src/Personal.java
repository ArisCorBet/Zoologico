public abstract class Personal extends Persona {
    protected String cargo;
    protected double salario;

    public Personal(String nombre, String cedula, int fechaNacimiento, String cargo, double salario) {
        super(nombre, cedula, fechaNacimiento);
        this.cargo = cargo;
        this.salario = salario;
    }

    public abstract void realizarTarea();
}

