package hiloindependiente;

import java.util.ArrayList;
import java.util.List;

public class ParcialVirtualSabana {
    private static final int NUMERO_ESTUDIANTES = 5;
    public static final int NUMERO_PREGUNTAS = 8;

    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 1; i <= NUMERO_ESTUDIANTES; i++) {
            estudiantes.add(new Estudiante("Estudiante " + i, 0));
        }
        ParcialEstudianteHilo parcialHilo = new ParcialEstudianteHilo(estudiantes);
        parcialHilo.start();
    }
}
