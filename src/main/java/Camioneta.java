public class Camioneta extends Vehiculo{
    private double capacidadCargaKG;

    public Camioneta(String placa, String marca, String modelo, int anioFabricacion, EstadoVehiculo estadoVehiculo, Empresa empresa, double capacidadCargaKG) {
        super(placa, marca, modelo, anioFabricacion, estadoVehiculo, empresa);
        this.capacidadCargaKG = capacidadCargaKG;
    }

    public double getCapacidadCargaKG() {
        return capacidadCargaKG;
    }

    public void setCapacidadCargaKG(double capacidadCargaKG) {
        this.capacidadCargaKG = capacidadCargaKG;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = (getTARIFA_BASE() + 50000) * dias;
        return costo;
    }

    @Override
    public String toString() {
        return "Camioneta{" +super.toString()+
                "capacidadCargaKG=" + capacidadCargaKG +
                '}';
    }
}
