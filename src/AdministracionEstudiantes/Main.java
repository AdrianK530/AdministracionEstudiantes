package AdministracionEstudiantes;


// Clase principal para probar la herencia y los métodos
public class Main {
    public static void main(String[] args) {
        // Creamos un estudiante univeristario usando el constructor
        EstudianteUniversitario uni= new EstudianteUniversitario("Ana", 20, "A001","Arquitectura");
        
        // Mostramos la información del estudiante universitario
        uni.mostrarInfo();// Muestra datos heredados + carrera
        
        // Creamos un estudiante de preparatoria usando el constructor
        EstudiantePreparatoria prep = new EstudiantePreparatoria("Luis", 22, "A002",4);
        
        // Mostramos la información del estudiante de preparatoria
        prep.mostrarInfo();// Muestra datos heredados + grado
               
        }
}