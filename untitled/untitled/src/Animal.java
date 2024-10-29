import java.util.List;

public class Animal {
    String nombre;
    String especie;
    int edad;
    String sexo;
    String caracteristicas;
    List<Alimentacion> alimentacion;

    public void alimentar() {
        // Lógica para alimentar al animal
    }

    public void revisarSalud() {
        // Lógica para revisar la salud del animal
    }

    public String verCaracteristicas() {
        return caracteristicas;
    }
}
