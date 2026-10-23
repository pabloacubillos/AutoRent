public class Residente extends Cliente{
    private String direccionResidencia;

    public Residente(String nombre, String correo, String documento, Empresa empresa, String direccionResidencia) {
        super(nombre, correo, documento, empresa);
        this.direccionResidencia = direccionResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    @Override
    public String toString() {
        return "Residente{" + super.toString()+
                "direccionResidencia='" + direccionResidencia + '\'' +
                '}';
    }
}
