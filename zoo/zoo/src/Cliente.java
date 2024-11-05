public class Cliente extends Persona {
    public Cliente(String nombre, String cedula, int fechaNacimiento) {
        super(nombre, cedula, fechaNacimiento);
    }

    public void comprarBoletos() {
        System.out.println("El cliente " + nombre + " está comprando boletos.");
    }

    public boolean getNombre() {
        return false;
    }
}

