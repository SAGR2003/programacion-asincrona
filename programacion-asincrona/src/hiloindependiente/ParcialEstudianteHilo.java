package hiloindependiente;

import java.util.List;
import java.util.Random;

import static hiloindependiente.ParcialVirtualSabana.NUMERO_PREGUNTAS;

public class ParcialEstudianteHilo extends Thread {
    private final List<Estudiante> estudiantes;

    public ParcialEstudianteHilo(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public void run() {
        revisar();
    }

    private void revisar() {
        Random aleatorio = new Random();

        while (true) {
            for (Estudiante estudiante : estudiantes) {
                estudiante.setPregunta(estudiante.getPregunta() + aleatorio.nextInt(NUMERO_PREGUNTAS));
            }

            imprimirRevision();

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Dejo de revisar");
            }
        }
    }

    private void imprimirRevision() {
        System.out.println("====================================================================================================");

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getIdEstudiante() + ": " + actualizarEstadoEstudiantes(estudiante.getPregunta()));
        }
    }

    private String actualizarEstadoEstudiantes(int pregunta) {
        StringBuilder estadoEstudiante = new StringBuilder();

        for (int numero = 0; numero < NUMERO_PREGUNTAS; numero++) {
            if (numero == pregunta) {
                estadoEstudiante.append("X" + " / ");
            } else {
                estadoEstudiante.append(numero + 1 + " / ");
            }
        }
        return estadoEstudiante.toString();
    }
}
