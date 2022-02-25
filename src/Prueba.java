import java.time.LocalDate;

public class Prueba {
    String nombre;

    public Prueba(String prueba){
        nombre = prueba;
    }

    public boolean is(Prueba test) {
        if (test.equals(nombre)){
            return true;
        }
        return false;
    }

}
