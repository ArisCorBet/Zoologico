public class Direccion {
    private String referencia;
    private String callePrincipal;
    private String calleSecundaria;

    public Direccion(String referencia, String callePrincipal, String calleSecundaria) {
        this.referencia = referencia;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    public String getDireccionCompleta() {
        return "Referencia: " + referencia + ", Calle Principal: " + callePrincipal + ", Calle Secundaria: " + calleSecundaria;
    }
}
