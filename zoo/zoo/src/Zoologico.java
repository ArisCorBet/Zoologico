import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private List<Animal> animales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void registrarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Animal registrado: " + animal.nombre);
    }

    public List<Animal> listarAnimales() {
        return animales;
    }

    public String getNombre() {
        return nombre;
    }
}