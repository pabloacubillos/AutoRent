import java.time.LocalDate;
import java.util.List;

public class Alquiler {
    private String codigo;
    private LocalDate fecha;
    private int dias;
    private Empresa empresa;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(String codigo, LocalDate fecha, int dias, Empresa empresa, Cliente cliente, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.dias = dias;
        this.empresa = empresa;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double calcularCostoTotal() {
        double costoTotal = vehiculo.calcularCostoAlquiler(dias);
        return costoTotal;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", dias=" + dias +
                ", empresa=" + empresa +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
