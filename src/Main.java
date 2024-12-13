import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*  String minombre="Juan";
        ComunidadEPN miembroEPN1=new ComunidadEPN();
        miembroEPN1.setCedula("1748856267");
        miembroEPN1.setNombre("Juan Perez");
        miembroEPN1.setDireccion("El Sur");
        miembroEPN1.setTelefono("0985276895");
        miembroEPN1.setEdad(25);
        miembroEPN1.setCorreo("juanp@gmai.com");
        miembroEPN1.mostrarDatos();

        ComunidadEPN miembroEPN2=new ComunidadEPN("1789565545", "Anan Mena", 24,"El Sur",
                "09846789256", "anamena@gmail.com");


        miembroEPN2.mostrarDatos();

        System.out.println(miembroEPN2.getNombre());
        System.out.println(miembroEPN2.getDireccion());
        System.out.println(miembroEPN2.getTelefono());
        System.out.println(miembroEPN2.getEdad());
        System.out.println(miembroEPN2.getCorreo());
        System.out.println(miembroEPN2.getNombre());
        System.out.println(miembroEPN2.getDireccion());
        Ya nova porque ya está en la clase

        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Pedro Suarez");
        profesor1.setCedula("1723568974");
        profesor1.setEdad(38);
        profesor1.setCorreo("psuarez@gmail.com");
        profesor1.setFacultad("Sistemas");
        profesor1.setMaterias_dictadas("Algoritmos");
        profesor1.setTipo_contrato("Indefinido");

        profesor1.mostrarDatos();

        Profesor profesor2 = new Profesor("1798563245", "Pedro Mende", 45, "El Norte",
                "0984789265", "pmendez@gmail.com", "Electricidad", "Electrica", " Anual");


        profesor2.mostrarDatos();

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Pedro Suarez");
        estudiante1.setCedula("1723568974");
        estudiante1.setEdad(38);
        estudiante1.setCorreo("psuarez@gmail.com");

        estudiante1.mostrarDatos();
        */

        JFrame frame = new JFrame("Comunidad_EPN");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setBackground(Color.BLACK);
        frame.pack();
        frame.setVisible(true);


    }
}