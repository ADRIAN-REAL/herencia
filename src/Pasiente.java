import java.util.Date;

public class Pasiente extends Visita {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Pasiente(String nombre, String primerApellido, String segundoApellido) {
        super(nombre, primerApellido, segundoApellido);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
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
