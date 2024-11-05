import java.util.Date;

public class Boleto {
    private float valor;
    private int numero;
    TipoBoleto tipo;
    private Date fecha;

    public Boleto(float valor, int numero, TipoBoleto tipo, Date fecha) {
        this.valor = valor;
        this.numero = numero;
        this.tipo = tipo;
        this.fecha = fecha;

        System.out.println("El boleto tiene un valor: " + this.valor);
        System.out.println("Numero de boleto: " + this.numero);
        System.out.println("tipo de boleto: " + this.tipo);
        System.out.println("Fecha del boleto: " + this.fecha);
    }

    public boolean verificarValidez() {
        return valor > 0;
    }

    public Object getTipo() {
        return null;
    }
}

enum TipoBoleto {
    INFANTIL, GENERAL, VIP
}

