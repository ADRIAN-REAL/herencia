import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(1,"Jhonn","Machaca","Flores","123456", Calendar.getInstance().getTime(),"3A5F9D");
        Paciente p2 = new Paciente(2,"Alan","Enrique","Sainz","222222",Calendar.getInstance().getTime(), "D9DS85");
        Paciente p3 = new Paciente(3,"Sebastian","Sarzuri","Mamani","31111",Calendar.getInstance().getTime(), "FF89DS");

        Ciudad c1 = new Ciudad("Cb","Cochabamba");
        Ciudad c2 = new Ciudad("LP","LA PAZ");
        Ciudad c3 = new Ciudad("Sr","SUCRE");

        Historial h1 = new Historial("AA",p1);
        Historial h2 = new Historial("BB",p2);
        Historial h3 = new Historial("OO",p3);

        List<Servicio> servicios = new ArrayList<>();
        Servicio s1 = new Servicio("Analisis de Sangre",15,"ninguno");
        servicios.add(s1);
        Servicio s2 = new Servicio("Revision de corazon",12,"ninguno");
        servicios.add(s2);
        Servicio s3 = new Servicio("Estudio de la sangre",11,"ninguno");
        servicios.add(s3);

        List<Medico> medicos = new ArrayList<>();
        Medico m1 = new Medico(11,"Jhoel","Jimenez","Benito","11265",Calendar.getInstance().getTime(),servicios);
        medicos.add(m1);
        Medico m2 = new Medico(12,"Cristobal","Fernandez","Rojas","888415",Calendar.getInstance().getTime(), servicios);
        medicos.add(m2);
        Medico m3 = new Medico(13,"Manuel","Rojas","Real","78947",Calendar.getInstance().getTime(), servicios);

        Hospital hospital1 = new Hospital("LAB-A","HOSPITALES COCHABAMBA",c1,4587123,servicios,m1);
        Hospital hospital2 = new Hospital("LAB-B","salomon klein",c2,4485123,servicios,m2);
        Hospital hospital3= new Hospital("LAB-C","UNIVALLE",c3,4984326,servicios,m3);

        Visita v1 = new Visita("BBC",Calendar.getInstance().getTime(),hospital1,s1,m1,"Aparantemente el paciente no presenta ningun sintoma del virus.","Debe mantener reposo y evitar hacer esfuerzos.",18,Calendar.getInstance().getTime(),h1);
        Visita v2 = new Visita("PIB",Calendar.getInstance().getTime(),hospital2,s2,m2,"El paciente aun se encuentra en estado de coma","Esperar para realizar la operacion",20,Calendar.getInstance().getTime(), h2);
        Visita v3 = new Visita("BID",Calendar.getInstance().getTime(), hospital3,s3,m3,"Se encuentra en buen estado","No hacer muchos esfuerzos",22,Calendar.getInstance().getTime(), h3);

        System.out.println("INFORME");

        System.out.println("NRO\tPRIMER-APELLIDO\tSEGUNDO-APELLIDO\tNOMBRE\t  DNI\tN°SEGURIDAD-SOCIAL");

        System.out.println("p1.getCodPersona()\tp1.toString()\t+p1.getDni()\t +p1.getNumeroSeguridadSocial()");

        System.out.println("Servicio: "+s1.getNombre());
        System.out.println("Diagnostico: "+v1.getDiagnostico());
        System.out.println("Tratamiento: "+v1.getTratamientos());

        System.out.println("Hospital: "+hospital1.getNombre()+"\t"+"Ciudad: "+hospital1.getCiudad().getNombre()+"\t"+"Telefono: "+hospital1.getTelefono()+"\t");

        System.out.println("Director: "+hospital1.getDirector());

        System.out.println("Fecha: "+v1.getFechaSalida());

        System.out.println();
        System.out.println("INFORME");

        System.out.println("NRO\tPRIMER-APELLIDO\tSEGUNDO-APELLIDO\tNOMBRE\t  DNI\tN°SEGURIDAD-SOCIAL");

        System.out.println(""+p2.getCodPersona()+"\t"+p2.toString()+"\t"+p2.getDni()+"\t "+p2.getNumeroSeguridadSocial());
        System.out.println("Servicio: "+s2.getNombre());
        System.out.println("Diagnostico: "+v2.getDiagnostico());
        System.out.println("Tratamiento: "+v2.getTratamientos());

        System.out.println("Hospital: "+hospital2.getNombre()+"\t"+"Ciudad: "+hospital2.getCiudad().getNombre()+"\t"+"Telefono: "+hospital2.getTelefono());

        System.out.println("Director: "+hospital2.getDirector());

        System.out.println("Fecha: "+v2.getFechaSalida());

    }
}
