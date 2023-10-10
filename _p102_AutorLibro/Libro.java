package _p102_AutorLibro;

public class Libro {
    private String Isbn,Nombre;
    private Autor Autor;
    private double precio;
    private int cantidad;
    public Libro() {
    }
    public Libro(String isbn, String nombre, _p102_AutorLibro.Autor autor, double precio, int cantidad) {
        Isbn = isbn;
        Nombre = nombre;
        Autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Autor getAutor() {
        return Autor;
    }
    public void setAutor(Autor autor) {
        Autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Autor=" + Autor + ", precio=" + precio + ", cantidad="
                + cantidad + "]";
    }
     
}
