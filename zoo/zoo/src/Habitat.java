public class Habitat {
    String nombre;
    private String tipo;
    private double temperatura;

    public Habitat(String nombre, String tipo, double temperatura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public double controlarTemperatura() {
        return temperatura;
    }

    public void limpiar() {
        System.out.println("Limpiando el hábitat: " + nombre);
        System.out.println("Habitat tipo: " + tipo);
        System.out.println("Verificar temperatura: " + temperatura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(boolean nombre) {
        this.nombre = String.valueOf(nombre);
    }
}
