package krakedev.entidades;
import java.util.ArrayList;

public class Estudiante {
	private String nombre;
     private String apellido;
     private String cedula;
    private ArrayList<Nota> notas;
    

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public Estudiante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nuevaNota) {
        // Verificar duplicados y rango de calificación
        String codigoMateriaNueva = nuevaNota.materia.getCodigo();
        boolean codigoRepetido = false;

        for (Nota nota : notas) {
            String codigoMateriaExistente = nota.materia.getCodigo();
            if (codigoMateriaNueva.equals(codigoMateriaExistente)) {
                codigoRepetido = true;
                break;
            }
        }

        if (!codigoRepetido && nuevaNota.calificacion >= 0 && nuevaNota.calificacion <= 10) {
            notas.add(nuevaNota);
            System.out.println("Nueva nota agregada correctamente.");
        } else {
            System.out.println("Error: Código de materia repetido o calificación fuera de rango (0-10).");
        }
    }

    public void modificarNota(String codigo, double nuevaCalificacion) {
        // Modificar calificación por código
        boolean codigoEncontrado = false;

        for (Nota nota : notas) {
            if (nota.materia.getCodigo().equals(codigo)) {
                nota.calificacion = nuevaCalificacion;
                codigoEncontrado = true;
                System.out.println("Calificación modificada correctamente.");
                break;
            }
        }

        if (!codigoEncontrado) {
            System.out.println("Error: No se encontró el código de materia.");
        }
    }

    public double calcularPromedioNotasEstudiante() {
        // Calcular promedio de notas del estudiante
        if (notas.isEmpty()) {
            return 0.0; // Evitar división por cero
        }

        double sumaNotas = 0.0;
        for (Nota nota : notas) {
            sumaNotas += nota.calificacion;
        }

        return sumaNotas / notas.size();
    }

    public String mostrar() {
        StringBuilder result = new StringBuilder();
        result.append("Estudiante [nombre=").append(nombre)
              .append(", apellido=").append(apellido)
              .append(", cedula=").append(cedula).append("]\n");
        result.append("Notas: [");
        
        for (int i = 0; i < notas.size(); i++) {
            Nota nota = notas.get(i);
            result.append("materia=").append(nota.materia).append(", calificacion=").append(nota.calificacion);
            if (i < notas.size() - 1) {
                result.append(", ");
            }
        }
        
        result.append("]\n");

        return result.toString();
    }

}
