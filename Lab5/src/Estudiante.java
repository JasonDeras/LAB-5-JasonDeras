
public class Estudiante {

    private String nombre;
    private String cuenta;
    private int edad;
    private String genero;
    private String carrera;

    public Estudiante(String nombre, String cuenta, int edad, String genero, String carrera) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", carrera=" + carrera + '}';
    }
    
}
