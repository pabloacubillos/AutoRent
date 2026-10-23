import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Empresa empresa;
    private String nombre;
    private String correo;
    private String documento;
    private List<Alquiler> listaAlquileres;

    public Cliente(String nombre, String correo, String documento, Empresa empresa) {
        this.nombre = nombre;
        this.correo = correo;
        this.documento = documento;
        this.empresa = empresa;
        listaAlquileres = new ArrayList<>();
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

    public List<Alquiler> getListaAlquileres() {return listaAlquileres;}
    public void setListaAlquileres(List<Alquiler> listaAlquileres) {this.listaAlquileres = listaAlquileres;}
}
