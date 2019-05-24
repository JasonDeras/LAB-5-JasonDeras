
public class Carrera {

    private String nombre;
    private String facultad;
    private double costo_mensual;
    private String jefe;

    public Carrera(String nombre, String facultad, double costo_mensual, String jefe) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo_mensual = costo_mensual;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getCosto_mensual() {
        return costo_mensual;
    }

    public void setCosto_mensual(double costo_mensual) {
        this.costo_mensual = costo_mensual;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
