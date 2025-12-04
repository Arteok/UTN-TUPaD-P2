package parte.pkg1;

public class MainEcommerce {

    public static void main(String[] args) {

        // 1. Creamos un cliente
        Cliente cliente = new Cliente("Pablo", "pablo@example.com");

        // 2. Creamos algunos productos
        Producto p1 = new Producto("Mouse gamer", 5000);
        Producto p2 = new Producto("Teclado mecánico", 15000);
        Producto p3 = new Producto("Monitor 24\"", 80000);

        // 3. Creamos un pedido para ese cliente
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // 4. Mostramos productos y total
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos en el pedido:");

        for (Producto p : pedido.getProductos()) {
            System.out.println(" - " + p);
        }

        double total = pedido.calcularTotal();              
        System.out.println("\nTotal del pedido: $" + total);

        // 5. Pagamos con Tarjeta de Crédito (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9999-0000", "Pablo Mariasch", 0.10);
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        System.out.println("Total con descuento tarjeta (10%): $" + totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);

        // 6. Cambiar estado del pedido (debería notificar al cliente)
        System.out.println("\n");
        pedido.cambiarEstado("En preparación");
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");

        // 7. Ejemplo rápido pagando con PayPal (sin descuento)
        System.out.println("\n--- Pago alternativo con PayPal (sin descuento) ---");
        PayPal paypal = new PayPal("pablo.paypal@example.com");
        paypal.procesarPago(total);
    }
}
