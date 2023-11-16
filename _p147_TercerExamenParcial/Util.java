package _p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase de utilidad con métodos para inicializar, serializar y deserializar datos de Jugadores.
 */
public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Juan Perez", 22, 'M', "Soltero", "Delantero", 50000.0));
        datos.add(new Jugador("Maria Jimenez", 18, 'F', "Soltera", "Defensa", 45000.0));
        datos.add(new Jugador("Carlos Fuentes", 30, 'M', "Casado", "Mediocampista", 60000.0));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fJugadores = new ObjectOutputStream(arch);
        fJugadores.writeObject(datos);
        fJugadores.close();
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fJugadores = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fJugadores.readObject();
        fJugadores.close();
        return datos;
    }
}
