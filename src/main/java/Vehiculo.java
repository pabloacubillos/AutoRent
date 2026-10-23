public abstract class Vehiculo {

    private Empresa empresa;
    private String placa;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private EstadoVehiculo estadoVehiculo;
    private final double TARIFA_BASE = 10000;

    public Vehiculo(String placa, String marca, String modelo, int anioFabricacion, EstadoVehiculo estadoVehiculo, Empresa empresa) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.estadoVehiculo = estadoVehiculo;
        this.empresa = empresa;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Empresa getEmpresa() {return empresa;}
    public void setEmpresa(Empresa empresa) {this.empresa = empresa;}

    public EstadoVehiculo getEstadoVehiculo() {return estadoVehiculo;}
    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {this.estadoVehiculo = estadoVehiculo;}

    public double getTARIFA_BASE() {
        return TARIFA_BASE;
    }

    public  abstract double calcularCostoAlquiler(int dias);
}
