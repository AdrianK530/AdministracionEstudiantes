package AdministracionEstudiantes;

// Clase base: contiene los atributos y métodos comunes para todos los estudiantes
public class Estudiante {
    // Atributos generales
    protected String nombre;     // protected: permite que las subclases lo hereden
    protected int edad;
    protected String matricula;

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
    }
}