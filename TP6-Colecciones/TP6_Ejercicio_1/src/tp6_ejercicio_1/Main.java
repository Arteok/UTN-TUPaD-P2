
package tp6_ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        //Crear productos
        Producto p1 = new Producto("P001", "Pan", 800, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3500, 40, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara", 2800, 25, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Yerba", 1900, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        //️Listar todos los productos
        System.out.println("\n=== Listado de productos ===");
        inventario.listarProductos();

        //Buscar producto por ID
        System.out.println("\n=== Buscar producto P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        //Filtrar por categoría
        System.out.println("\n=== Productos de ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        //Eliminar producto
        System.out.println("\n=== Eliminar producto P002 ===");
        inventario.eliminarProducto("P002");

        //Actualizar stock
        System.out.println("\n=== Actualizar stock de P001 ===");
        inventario.actualizarStock("P001", 60);

        //Total de stock
        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        //Producto con mayor stock
        Producto maxStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock: " + maxStock);

        //Filtrar por precio
        System.out.println("\n=== Productos entre $1000 y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        //Mostrar categorías disponibles
        System.out.println("\n=== Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }
}

