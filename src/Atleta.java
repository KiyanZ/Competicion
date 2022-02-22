import java.time.LocalDate;
import java.time.Period;

public class Atleta {
    private String nombre;

    private enum Genero
    {
        MALE, FEMALE
    }

    private LocalDate Nacimiento;
    private LocalDate InicioCarrera;
    private LocalDate FinCarrera;

    public Atleta(String name, Genero sex , LocalDate BirthDate, LocalDate CareerDebut, LocalDate RetirmentDate){
        nombre = name;
        Nacimiento = BirthDate;
        InicioCarrera = CareerDebut;
        FinCarrera = RetirmentDate;

    }

    public int edad() {
        return Period.between(Nacimiento, LocalDate.now()).getYears();
    }

    public boolean debutar(LocalDate date) {
        if ((Nacimiento == null) || (FinCarrera != null)) {
            return false;
        }
        InicioCarrera = date;
        return true;
    }
}
