package argpromod1;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
//import SimpleDateFormat
import java.text.SimpleDateFormat;
/**
 * Ejercio 10 - ArgProMod1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Scanner sc = new Scanner(System.in);
    ArrayList<Persona> lista = new ArrayList<>();
    String nombre;
    String apellido;
    String fechaString;

    System.out.println("Ingrese nombre");
    nombre = sc.nextLine();
    System.out.println("Ingrese apellido");
    apellido = sc.nextLine();
    System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy)");
    fechaString = sc.nextLine();
    Date fecha = null;

    try {
        fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
    } catch (Exception e) {
        System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato dd/mm/yyyy.");
        return;
    }

    Persona p = new Persona();
    p.setNombre(nombre);
    p.setApellido(apellido);
    p.setFechaNacimiento(fecha /*fechaNacimiento*/);

    lista.add(p);

    System.out.println("Desea ingresar otra persona? s/n");
    String respuesta = sc.nextLine();

    while (respuesta.equals("s")) {
        System.out.println("Ingrese nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy)");
        fechaString = sc.nextLine();
        fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha. Asegúrese de ingresarla en el formato dd/mm/yyyy.");
            return;
        }

        p = new Persona();
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setFechaNacimiento(fecha);

        lista.add(p);

        System.out.println("Desea ingresar otra persona? s/n");
        respuesta = sc.nextLine();
    }
    sc.close();
    System.out.println("\n L I S T A D O  D E   P E R S O N A S ");
    System.out.println("--------------------------------------\n");
      for (Persona persona : lista) {
          System.out.println(persona.toString());
          System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
      }
    }

}
