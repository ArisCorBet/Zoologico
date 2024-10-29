import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente();
        cliente.nombre = "Juan Perez";
        cliente.cedula = "123456789";
        System.out.println("Cliente: " + cliente.nombre);

        // Crear un taquillero y vender boletos
        Taquillero taquillero = new Taquillero();
        taquillero.nombre = "Ana Gomez";
        taquillero.especializacion = "Venta de boletos";
        taquillero.revisarAnimal();
        System.out.println("Taquillero: " + taquillero.nombre);

        // Crear un veterinario
        Veterinario veterinario = new Veterinario();
        veterinario.nombre = "Carlos Ruiz";
        veterinario.especializacion = "Mamíferos";
        veterinario.revisarAnimal();
        System.out.println("Veterinario: " + veterinario.nombre);

        // Crear boletos
        Boleto boleto1 = new Boleto();
        boleto1.valor = 50.0f;
        boleto1.numero = 1;
        boleto1.tipo = "Adulto";
        boleto1.fecha = new Date();
        boleto1.validar();

        Boleto boleto2 = new Boleto();
        boleto2.valor = 25.0f;
        boleto2.numero = 2;
        boleto2.tipo = "Niño";
        boleto2.fecha = new Date();
        boleto2.validar();

        System.out.println("Boletos generados y validados");

        // Crear animales
        Animal leon = new Animal();
        leon.nombre = "Simba";
        leon.especie = "León";
        leon.edad = 5;
        leon.sexo = "Macho";
        leon.caracteristicas = "Fuerte y saludable";

        Animal tigre = new Animal();
        tigre.nombre = "Shere Khan";
        tigre.especie = "Tigre";
        tigre.edad = 7;
        tigre.sexo = "Macho";
        tigre.caracteristicas = "Feroz y ágil";

        leon.alimentar();
        leon.revisarSalud();

        System.out.println("Animales creados: " + leon.nombre + " y " + tigre.nombre);

        // Crear un cuidador
        Cuidador cuidador = new Cuidador();
        cuidador.nombre = "Pedro Castillo";
        cuidador.especializacionEspecie = "Felinos";
        cuidador.cuidarAnimal();
        System.out.println("Cuidador: " + cuidador.nombre);

        // Crear alimentación para animales
        Alimentacion alimentacionLeon = new Alimentacion();
        alimentacionLeon.tipoAlimentacion = "Carnívoro";
        alimentacionLeon.horario = "10:00 AM";

        List<Alimentacion> listaAlimentacion = new ArrayList<>();
        listaAlimentacion.add(alimentacionLeon);
        leon.alimentacion = listaAlimentacion;

        // Crear historial de salud para el león
        HistorialSalud historialLeon = new HistorialSalud();
        historialLeon.animal = leon;
        historialLeon.fecha = new Date();
        historialLeon.detallesSalud = "Salud óptima";
        historialLeon.actualizarHistorial();
        System.out.println("Historial de salud actualizado para: " + leon.nombre);

        // Crear hábitat y asignar animales
        Habitat habitatSelva = new Habitat();
        habitatSelva.nombre = "Selva Tropical";
        habitatSelva.tipo = "Tropical";
        habitatSelva.temperatura = 26.5;
        habitatSelva.controlarTemperatura();
        habitatSelva.limpiar();

        System.out.println("Hábitat creado: " + habitatSelva.nombre);

        // Crear gestión de animales
        GestionAnimales gestionAnimales = new GestionAnimales();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(leon);
        animalList.add(tigre);
        gestionAnimales.animalList = animalList;

        // Listar los animales en la gestión
        for (Animal animal : gestionAnimales.listarAnimales()) {
            System.out.println("Animal en gestión: " + animal.nombre);
        }

        // Crear cuidado y gestionar tareas
        Cuidado cuidado = new Cuidado();
        cuidado.horarioLimpieza = "9:00 AM";
        cuidado.responsable = "Luis Ramírez";
        cuidado.asignarResponsable();
        cuidado.gestionarLimpieza();
        cuidado.gestionarCuidado();

        System.out.println("Responsable de cuidado: " + cuidado.responsable);
    }
}
