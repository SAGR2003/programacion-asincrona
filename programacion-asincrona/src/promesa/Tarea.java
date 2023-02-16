package promesa;

import java.util.concurrent.CompletableFuture;

public class Tarea {

    public static void main(String[] args) {
        Asignador asignador = new Asignador();
        int tiempoEntrega = 5000;
        int tiempoEstudiante = 3000;
        boolean tarde = tiempoEntrega < tiempoEstudiante;

        asignador.asignadorTeams(tiempoEntrega, tarde);
    }
}
