public class Visita {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String carnetIdentidad;
    protected int celular;

    public Visita(String nombre, String primerApellido, String segundoApellido) {
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setCarnetIdentidad(carnetIdentidad);
        this.setCelular(celular);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(String carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        String nombreCompleto = primerApellido;
        if (segundoApellido !=null){
            nombreCompleto += " " + segundoApellido;

        }
        nombreCompleto += " " + nombre;
        return nombreCompleto;
    }
}
