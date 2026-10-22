public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private Estado estado;
    private final double TARIFA_BASE = 10000;

    public Vehiculo(String placa, String marca, String modelo, int anioFabricacion, Estado estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getTARIFA_BASE() {
        return TARIFA_BASE;
    }

    public  abstract double calcularCostoAlquiler(int dias);
}
