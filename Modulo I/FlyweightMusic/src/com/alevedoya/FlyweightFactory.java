package com.alevedoya;

import java.util.HashMap;

public class FlyweightFactory {

    private final static HashMap<String, Cancion> cancionesMap = new HashMap<>();
    public static Cancion crearcanciones(String name) {
        Cancion cancion = cancionesMap.get(name);
        if (cancion == null) {
            cancion = new Cancion(name);
            cancionesMap.put(name, cancion);
            return cancionesMap.get(name);
        }
        return cancionesMap.get(name);
    }

    public static Cancion borrarcanciones(String name) {
        Cancion cancion = cancionesMap.get(name);
        if (cancion != null) {
            cancionesMap.remove(name, cancion);
            return cancionesMap.get(name);
        }
        return cancionesMap.get(name);
    }
}
