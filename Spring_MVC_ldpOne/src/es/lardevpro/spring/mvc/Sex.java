package es.lardevpro.spring.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public enum Sex {
    MALE("Hombre"),
    FEMALE("Mujer"),
    OTHER("Otro");

    private final String label;

    private Sex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    // Método para obtener las opciones de sexo en un Map
    public static Map<String, String> getSexOptions() {
        Map<String, String> sexOptions = new LinkedHashMap<>();
        for (Sex sex : values()) {
            sexOptions.put(sex.name(), sex.getLabel());
        }
        return sexOptions;
    }
}
