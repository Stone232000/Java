package krakedev.entidades;
import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;
    

    public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	//

	public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Estudiante buscarEstudiantePorCedula(String cedula) {
        // Buscar estudiante por cédula
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    public void matricularEstudiante(Estudiante estudiante) {
        // Matricular estudiante si no está en el curso
        if (buscarEstudiantePorCedula(estudiante.getCedula()) == null) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante matriculado correctamente.");
        } else {
            System.out.println("Error: El estudiante ya está matriculado en el curso.");
        }
    }

    public double calcularPromedioCurso() {
        // Calcular promedio del curso
        if (estudiantes.isEmpty()) {
            return 0.0; // Evitar división por cero
        }

        double sumaPromedios = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
        }

        return sumaPromedios / estudiantes.size();
    }

    public void mostrar() {
        System.out.println("Curso:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar();
        }
        System.out.println("Promedio del curso: " + calcularPromedioCurso());
    }

}
