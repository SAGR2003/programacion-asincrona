package promesa;

import java.util.concurrent.CompletableFuture;

public class Asignador {
    public void asignadorTeams(int tiempoEntrega, boolean tarde) {
        CompletableFuture<String> asignacionTeams = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(tiempoEntrega);
                System.out.println("Se cumplio fecha limite");
            } catch (Exception e) {
                System.out.println("Algo salio mal con el hilo");
            }
            if (tarde) {
                throw new RuntimeException();
            }

            return "El estudiante entrego a tiempo la tarea";
        });

        realizaOtrasActividades();

        try {
            String entrega = asignacionTeams.join();
            System.out.println(entrega);
        } catch (Exception e) {
            System.out.println("El estudiante entrego tarde la tarea");
        }
    }

    private void realizaOtrasActividades() {
        System.out.println("Dictas otras clases");
        System.out.println("Vas a tu casa");
        System.out.println("Almuerzas");
    }
}
