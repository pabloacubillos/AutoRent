public class Residente extends Cliente{
    private String direccionResidencia;

    public Residente(String nombre, String correo, String documento, String direccionResidencia) {
        super(nombre, correo, documento);
        this.direccionResidencia = direccionResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }
}
