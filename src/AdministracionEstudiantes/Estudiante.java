package AdministracionEstudiantes;


// Clase Estudiante: guarda la información básica de cada alumno
public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String matricula;

    // Constructor de la clase
    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("-----------------------");
    }

    // Método para actualizar la edad
    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    // Método para obtener la edad (opcional)
    public int getEdad() {
        return edad;
    }
}

