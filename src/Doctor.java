public class Doctor extends Visita{
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Doctor(String nombre, String primerApellido, String segundoApellido, String nombre1, String primerApellido1, String segundoApellido1) {
        super(nombre, primerApellido, segundoApellido);
        this.setNombre(nombre1);
        this.setPrimerApellido(primerApellido1);
        this.setSegundoApellido(segundoApellido1);
    }


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getPrimerApellido() {
        return primerApellido;
    }

    @Override
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String getSegundoApellido() {
        return segundoApellido;
    }

    @Override
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
