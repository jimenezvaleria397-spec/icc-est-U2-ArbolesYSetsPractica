package controllers;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Persona;

public class PersonaController {
    public Set<Persona> filtarYOrdenar(
        List<Persona> personas, int edad){
            Set<Persona> personasFiltradas = new TreeSet<>((p1,p2) ->{
                int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());
                if(compEdad != 0){
                    return compEdad;
                }
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
                
            });
            for(Persona persona: personas){
                if(persona.getEdad() >= edad){
                    personasFiltradas.add(persona);
                }
            }
            return personasFiltradas;
    }
    public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas) {
    Map<String, Set<String>> personasAgrupadas = new TreeMap<>();

    personasAgrupadas.put("JOVEN", new LinkedHashSet<>());
    personasAgrupadas.put("ADULTO", new LinkedHashSet<>());
    personasAgrupadas.put("MAYOR", new LinkedHashSet<>());

    for (Persona persona : personas) {
        String primerNombre = persona.getNombre().split(" ")[0];
        String grupoEdad;
        if (persona.getEdad() < 18) {
            grupoEdad = "JOVEN";
        } else if (persona.getEdad() <= 30) {
            grupoEdad = "ADULTO";
        } else {
            grupoEdad = "MAYOR";
        }
        personasAgrupadas.get(grupoEdad).add(primerNombre);
    }
    return personasAgrupadas;
}
    
}
