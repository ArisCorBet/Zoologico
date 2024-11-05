import java.util.Date;

public class Horario {
    private Date horarioAlimentacion;
    private Date horarioLimpieza;

    public Horario(Date horarioAlimentacion, Date horarioLimpieza) {
        this.horarioAlimentacion = horarioAlimentacion;
        this.horarioLimpieza = horarioLimpieza;
    }

    public void crearHorarioAlimentacion(Date nuevoHorario) {
        this.horarioAlimentacion = nuevoHorario;
    }

    public void crearHorarioLimpieza(Date nuevoHorario) {
        this.horarioLimpieza = nuevoHorario;
    }

    public Date getHorarioAlimentacion() {
        return horarioAlimentacion;
    }

    public Date getHorarioLimpieza() {
        return horarioLimpieza;
    }
}