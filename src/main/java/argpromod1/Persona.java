package argpromod1;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter


public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    public Persona(String nombre, String apellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() { 
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(this.fechaNacimiento);
        return "Nombre=" + nombre + ",\nApellido=" + apellido + ",\nFecha de Nacimiento=" + fechaFormateada + ".\n";
    }

}
