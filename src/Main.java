import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Pasiente jose =  new Pasiente("Jose","Garcia","Mendez");

        System.out.println(jose.getNombre());
        System.out.println(jose.getPrimerApellido());
        System.out.println(jose.getSegundoApellido());



    }
}
