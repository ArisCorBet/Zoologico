import java.util.Date;

public class HistorialSalud {
    private Date fecha;
    private String detallesSalud;

    public HistorialSalud(Date fecha, String detallesSalud) {
        this.fecha = fecha;
        this.detallesSalud = detallesSalud;
    }

    public void registrarNuevoHistorial(Date nuevaFecha, String nuevosDetalles) {
        this.fecha = nuevaFecha;
        this.detallesSalud = nuevosDetalles;
    }

    public String obtenerUltimoHistorial() {
        return "Fecha: " + fecha + ", Detalles de salud: " + detallesSalud;
    }
}