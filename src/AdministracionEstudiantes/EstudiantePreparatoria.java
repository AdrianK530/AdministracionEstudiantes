package AdministracionEstudiantes;

// Subclase que hereda de Estudiante
public class EstudiantePreparatoria extends Estudiante {
    // Atributo único de estudiantes de preparatoria
    private final int grado;

    // Constructor con super() para inicializar la clase base
    public EstudiantePreparatoria(String nombre, int edad, String matricula, int grado) {
        super(nombre, edad, matricula);
        this.grado = grado;
    }

    // Sobrescribir el método mostrarInfo() para agregar información extra
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Muestra los datos de la clase base
        System.out.println("Grado: " + grado);
        System.out.println("-----------------------");
    }

    // Método exclusivo
    public void hacerTarea() {
        System.out.println(nombre + " está cursando el grado " + grado + ".");
    }
}