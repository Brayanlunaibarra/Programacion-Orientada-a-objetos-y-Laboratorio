package _p113_SegudoExamenParcial;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String liga;
    private List<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.Salario;
        }
        return total;
    }

    public int getTotalH() {
        int totalH = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.Sexo == 'H') {
                totalH++;
            }
        }
        return totalH;
    }

    public int getTotalM() {
        int totalM = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.Sexo == 'M') {
                totalM++;
            }
        }
        return totalM;
    }

    public void reporte() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Liga: " + liga);
        System.out.println("Total de jugadores: " + jugadores.size());
        System.out.println("Total de bono: " + getTotalBono());
        System.out.println("Total de salario: " + getTotal());
        System.out.println("Total de hombres: " + getTotalH());
        System.out.println("Total de mujeres: " + getTotalM());
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + "\nLiga: " + liga;
    }
}