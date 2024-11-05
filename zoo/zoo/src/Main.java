import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear dirección del zoológico
        Direccion direccionZoologico = new Direccion("Frente al parque central", "Av. Principal", "Calle Secundaria");
        System.out.println("Dirección del Zoológico: " + direccionZoologico.getDireccionCompleta());

        // Crear el zoológico
        Zoologico zoologico = new Zoologico("Zoológico Nacional");

        // Crear y registrar algunos animales en el zoológico
        Carnivoro leon = new Carnivoro("Simba", "León", 5, "Macho", "Fuerte y valiente");
        Hervivoro elefante = new Hervivoro("Dumbo", "Elefante", 10, "Hembra", "Grande y tranquila");
        Omnivoro oso = new Omnivoro("Baloo", "Oso", 7, "Macho", "Amigable y curioso");

        zoologico.registrarAnimal(leon);
        zoologico.registrarAnimal(elefante);
        zoologico.registrarAnimal(oso);

        // Crear boletos y un cliente
        Boleto boleto = new Boleto(10.0f, 1, TipoBoleto.GENERAL, new Date());
        Cliente cliente = new Cliente("Laura", "10001", 1990);
        System.out.println(cliente.getNombre() + " está comprando un boleto de tipo " + boleto.getTipo());

        // Crear un taquillero y un veterinario
        Taquillero taquillero = new Taquillero("Carlos", "20001", 1985, 1200.0);
        Veterinario veterinario = new Veterinario("Dr. Ana", "30001", 1992, 1500.0, "Animales Salvajes");

        // Realizar las tareas de los empleados
        taquillero.realizarTarea();
        veterinario.realizarTarea();

        // Crear un hábitat y agregar una acción
        Habitat habitatSelva = new Habitat("Selva", "Bosque tropical", 27.5);
        habitatSelva.limpiar();
        System.out.println("Temperatura en el hábitat '" + habitatSelva.getNombre() + "': " + habitatSelva.controlarTemperatura() + "°C");

        // Asignar cuidados a los animales
        Cuidado cuidadoLeon = new Cuidado("Juan");
        Cuidado cuidadoElefante = new Cuidado("Maria");
        Cuidado cuidadoOso = new Cuidado("Luis");

        leon.asignarCuidado(cuidadoLeon);
        elefante.asignarCuidado(cuidadoElefante);
        oso.asignarCuidado(cuidadoOso);

        // Crear historial de salud para los animales
        HistorialSalud historialLeon = new HistorialSalud(new Date(), "Salud excelente");
        HistorialSalud historialElefante = new HistorialSalud(new Date(), "Ligera deshidratación");
        HistorialSalud historialOso = new HistorialSalud(new Date(), "Enfermedad estomacal");

        System.out.println("Historial de salud de León: " + historialLeon.obtenerUltimoHistorial());
        System.out.println("Historial de salud de Elefante: " + historialElefante.obtenerUltimoHistorial());
        System.out.println("Historial de salud de Oso: " + historialOso.obtenerUltimoHistorial());

        // Crear horarios para alimentación y limpieza
        Horario horarioLeon = new Horario(new Date(), new Date());
        Horario horarioElefante = new Horario(new Date(), new Date());
        Horario horarioOso = new Horario(new Date(), new Date());

        System.out.println("Horario de alimentación del León: " + horarioLeon.getHorarioAlimentacion());
        System.out.println("Horario de limpieza del Elefante: " + horarioElefante.getHorarioLimpieza());

        // Asignar tipos de alimentación
        Alimentacion alimentacionLeon = new Alimentacion("Carnívoro");
        Alimentacion alimentacionElefante = new Alimentacion("Herbívoro");
        Alimentacion alimentacionOso = new Alimentacion("Omnívoro");

        alimentacionLeon.gestionarAlimentacion();
        alimentacionElefante.gestionarAlimentacion();
        alimentacionOso.gestionarAlimentacion();

        // Mostrar animales registrados en el zoológico
        System.out.println("\nAnimales registrados en el " + zoologico.getNombre() + ":");
        for (Animal animal : zoologico.listarAnimales()) {
            String tipoDieta = "Desconocida";
            if (animal instanceof Carnivoro) {
                tipoDieta = "Carnívoro";
            } else if (animal instanceof Hervivoro) {
                tipoDieta = "Herbívoro";
            } else if (animal instanceof Omnivoro) {
                tipoDieta = "Omnívoro";
            }

            System.out.println("Nombre: " + animal.getNombre() + ", Especie: " + animal.getEspecie() +
                    ", Dieta: " + tipoDieta + ", Características: " + animal.verCaracteristicas());

            // Realizar acciones específicas con cada animal
            animal.alimentar();
            animal.revisarSalud();
            animal.gestionarCuidado();  // Manejo del cuidado para cada animal
        }
    }
}


