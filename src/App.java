import java.util.ArrayList;
import java.util.List;

import controllers.PersonaController;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Miguel Torres", 15));
        personas.add(new Persona("Luisa Gomez", 16));
        personas.add(new Persona("Roberto Castro", 45));
        personas.add(new Persona("Patricia Ruiz", 60));
        personas.add(new Persona("Miguel Torres", 15));
        personas.add(new Persona("Luisa Gomez", 16));

        personas.add(new Persona("Ana Garcia", 20));
        personas.add(new Persona("Luis Martinez", 22));
        personas.add(new Persona("Carlos Perez", 25));

        personas.add(new Persona("Roberto Castro", 45));
        personas.add(new Persona("Patricia Ruiz", 60));

        // run
        PersonaController p = new PersonaController();
        System.out.println("===== Filtar y Ordenar =====");
        System.out.println(p.filtarYOrdenar(personas, 18));
        System.out.println("===== Agrupar por edad =====");
        System.out.println(p.agruparPorRangoEdad(personas));

    }

}
