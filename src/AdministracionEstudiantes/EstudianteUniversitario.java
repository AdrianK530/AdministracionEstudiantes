package AdministracionEstudiantes;

// Subclase que hereda de Estudiante
public class EstudianteUniversitario extends Estudiante {
    // Atributo único de los universitarios
    private String carrera;

    // Constructor: usa super() para llamar al constructor de la clase base
    public EstudianteUniversitario(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad, matricula);// Llama al constructor de Estudiante
        this.carrera = carrera;
    }

    // Sobrescribir el método mostrarInfo() para agregar más datos
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase base
        System.out.println("Carrera: " + carrera);
        System.out.println("-----------------------");
    }

    // Método exclusivo de esta subclase
    public void estudiar() {
        System.out.println(nombre + " está estudiando su carrera de " + carrera + ".");
    }
}