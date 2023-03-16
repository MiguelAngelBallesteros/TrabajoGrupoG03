package G03;

public class Contenedores {
    private int identificador;
    private int peso;
    private String país_procedencia;
    private boolean inspeccion;
    private int prioridad;
    private String [] descripcion=new String [100];
    private String [] empresa_envio=new String [20];
    private String [] empresa_recibe=new String [20];

    public Contenedores(int identificador, int peso, String país_procedencia, boolean inspeccion, int prioridad, String [] descripcion, String [] empresa_envio, String [] empresa_recibe){
        this.identificador=identificador;
        this.peso=peso;
        this.país_procedencia=país_procedencia;
        this.inspeccion=inspeccion;
        this.prioridad=prioridad;
        this.descripcion=descripcion;
        this.empresa_envio=empresa_envio;
        this.empresa_recibe=empresa_recibe;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPaís_procedencia(String país_procedencia) {
        this.país_procedencia = país_procedencia;
    }

    public void setInspeccion(boolean inspeccion) {
        this.inspeccion = inspeccion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }

    public void setEmpresa_envio(String[] empresa_envio) {
        this.empresa_envio = empresa_envio;
    }

    public void setEmpresa_recibe(String[] empresa_recibe) {
        this.empresa_recibe = empresa_recibe;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getPeso() {
        return peso;
    }

    public String getPaís_procedencia() {
        return país_procedencia;
    }

    public boolean isInspeccion() {
        return inspeccion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String[] getDescripcion() {
        return descripcion;
    }

    public String[] getEmpresa_envio() {
        return empresa_envio;
    }

    public String[] getEmpresa_recibe() {
        return empresa_recibe;
    }
    public String toString(){
        String resultado="";
        resultado= "La información de este contenedor es:\n"+"-identificador: "+identificador+
                "\n -peso: "+peso+"\n -pais:"+país_procedencia+"\n -¿ha sido inspeccionado? "+inspeccion+"\n-descripcion: "+descripcion +"\n-empresa que lo envia: "+empresa_envio+"\n -empresa que lo va a recibir:"+empresa_recibe;
        return resultado;
    }
}
