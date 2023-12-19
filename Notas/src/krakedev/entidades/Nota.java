package krakedev.entidades;

public class Nota {
	Materia materia;
    double calificacion;

    public Nota(Materia materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public void mostrar() {
        System.out.println("Nota [materia=" + materia + ", calificacion=" + calificacion + "]");
    }

}
