
package pkg5.simulacion.nave;

public class SimulacionNave {
    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Enterprise", 50);

        // Despega e intentar avanzar sin recargar
        nave1.despegar();
        nave1.avanzar(60); 

        // Recargar combustible
        nave1.recargarCombustible(30); 

        // Avanzar correctamente
        nave1.avanzar(60);

        // Mostrar estado final
        nave1.mostrarEstado();
    }
}
