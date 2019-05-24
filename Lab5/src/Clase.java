
public class Clase {

    private String nombre;
    private int seccion;
    private int edificio;
    private String salon;
    private boolean aire;

    public Clase(String nombre, int seccion, int edificio, String salon, boolean aire) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aire = aire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public boolean isAire() {
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire = aire;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", seccion=" + seccion + ", edificio=" + edificio + ", salon=" + salon + ", aire=" + aire + '}';
    }
    
}
