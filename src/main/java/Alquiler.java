import java.time.LocalDate;

public class Alquiler {
    private String codigo;
   private LocalDate fecha;
    private int dias;

    public Alquiler(String codigo, LocalDate fecha, int dias) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.dias = dias;
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



}
