package _p102_AutorLibro;

public class Autor {
    private String nombre , correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Autor() {
    }

    public Autor(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    


}
