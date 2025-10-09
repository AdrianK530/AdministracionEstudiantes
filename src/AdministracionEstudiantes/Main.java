package AdministracionEstudiantes;


// Clase principal del programa
public class Main {
    public static void main(String[] args) {
        // Creamos algunos estudiantes usando el constructor
        Estudiante estudiante1 = new Estudiante("Ana", 20, "A001");
        Estudiante estudiante2 = new Estudiante("Luis", 22, "A002");

        // Mostramos la información de los estudiantes
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();

        // Cambiamos la edad de un estudiante usando un método
        estudiante1.setEdad(21);
        System.out.println("Después de actualizar la edad:");
        estudiante1.mostrarInfo();
    }
}