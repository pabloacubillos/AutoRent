public class Cliente {
    private Empresa empresa;
    private String nombre;
    private String correo;
    private String documento;

    public Cliente(String nombre, String correo, String documento, Empresa empresa) {
        this.nombre = nombre;
        this.correo = correo;
        this.documento = documento;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Empresa getEmpresa() {return empresa;}
    public void setEmpresa(Empresa empresa) {this.empresa = empresa;}
}
