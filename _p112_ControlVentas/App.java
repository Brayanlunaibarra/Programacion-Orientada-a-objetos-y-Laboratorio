package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Av. Luis Moya 345", "Carlos Castaneda");

        Clientes cliente1 = new Clientes("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        Clientes cliente2 = new Clientes("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Clientes cliente3 = new Clientes("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        Clientes cliente4 = new Clientes("Xochitl Gelatinas", "Danone 123", "xochitl@presidencia.gob.mx");

        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);
        tienda.agregarCliente(cliente3);
        tienda.agregarCliente(cliente4);

        VentaContado ventaContado1 = new VentaContado("Martillo", 10, 60.50, 10.0, "Sacabrocados");
        VentaCredito ventaCredito1 = new VentaCredito("Pala", 2, 1170.55, 3, 10.0);
        VentaCredito ventaCredito2 = new VentaCredito("Clavo", 2.5, 160.34, 2, 20.0);
        VentaCredito ventaCredito3 = new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20.0);
        VentaContado ventaContado2 = new VentaContado("Pinzas", 10, 650.33, 20.0, "Taladro");
        VentaContado ventaContado3 = new VentaContado("Thiner", 50, 65.00, 10.0, "Aerosol");

        cliente1.agregarVenta(ventaContado1);
        cliente1.agregarVenta(ventaCredito1);
        cliente2.agregarVenta(ventaCredito2);
        cliente2.agregarVenta(ventaCredito3);
        cliente2.agregarVenta(ventaContado2);
        cliente3.agregarVenta(ventaContado3);

        // Imprime el reporte de clientes sin ventas
        System.out.println("Reporte de clientes sin ventas :");
        System.out.println(tienda);

        // Imprime el reporte de ventas de los clientes
        System.out.println("Reporte de ventas de los clientes :");
        for (Clientes cliente : tienda.getClientes()) {
            System.out.println(cliente);
            for (Venta venta : cliente.getVentas()) {
                System.out.println(venta);
            }
        }
    }
}
