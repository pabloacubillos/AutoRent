import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ciudad;
    private List<Cliente> listaClientes;
    private List<Vehiculo> listaVehiculos;

    public Empresa(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        listaClientes = new ArrayList<>();
        listaVehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Cliente> getListaClientes() {return listaClientes;}
    public void setListaClientes(List<Cliente> listaClientes) {this.listaClientes = listaClientes;}

    public List<Vehiculo> getListaVehiculos() {return listaVehiculos;}
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {this.listaVehiculos = listaVehiculos;}
}
