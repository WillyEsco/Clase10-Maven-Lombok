package argpromod1;
import java.time.*;
import lombok.*;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@Getter
@Setter


public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() { 
        String fechaString  = fechaNacimiento.format(DateTimeFormatter.ofPattern("d/M/yyyy"));
        return "Nombre= " + nombre + ",\nApellido= " + apellido + ",\nFecha de Nacimiento= " + fechaString + ".\n";
    }

}
