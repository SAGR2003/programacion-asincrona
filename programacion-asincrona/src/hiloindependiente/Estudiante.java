package hiloindependiente;

public class Estudiante {

    private String idEstudiante;
    private int pregunta;

    public Estudiante(String idEstudiante, int pregunta) {
        this.idEstudiante = idEstudiante;
        this.pregunta = pregunta;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
}