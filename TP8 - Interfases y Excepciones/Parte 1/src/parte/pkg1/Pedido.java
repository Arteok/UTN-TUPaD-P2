package parte.pkg1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private Cliente cliente;
    private List<Producto> productos;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Creado";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        productos.remove(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Pedido debe notificar al cliente cuando cambia de estado
        if (cliente != null) {
            cliente.notificar("El estado de su pedido cambió a: " + nuevoEstado);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }
}





