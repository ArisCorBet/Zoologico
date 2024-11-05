public class Taquillero extends Personal {
    public Taquillero(String nombre, String cedula, int fechaNacimiento, double salario) {
        super(nombre, cedula, fechaNacimiento, "Taquillero", salario);
    }

    public void venderBoletos() {
        System.out.println("El taquillero " + nombre + " está vendiendo boletos.");
    }

    @Override
    public void realizarTarea() {
        venderBoletos();
    }
}
