public class Turista extends Cliente{
    private String visa;

    public Turista(String nombre, String correo, String documento, Empresa empresa, String visa) {
        super(nombre, correo, documento, empresa);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    @Override
    public String toString() {
        return "Turista{" +super.toString()+
                "visa='" + visa + '\'' +
                '}';
    }
}
