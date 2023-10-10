package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Autor autor=new Autor();
        autor.setCorreo("baratay@gmail.com");
        autor.setNombre("brayan ");
        libro.setPrecio(100);
        
        libro.setAutor(autor);
        libro.setCantidad(12);
        libro.setIsbn("100000");
        libro.setNombre("los juanences");
        System.out.println(libro.toString());
    }
}
