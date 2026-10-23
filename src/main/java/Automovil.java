public class Automovil extends Vehiculo{
    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, int anioFabricacion, EstadoVehiculo estadoVehiculo, int numeroPuertas) {
        super(placa, marca, modelo, anioFabricacion, estadoVehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = (getTARIFA_BASE() + 20000)*dias;
        return costo;
    }
}
