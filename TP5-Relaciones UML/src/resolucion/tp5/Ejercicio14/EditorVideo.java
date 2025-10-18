package resolucion.tp5.Ejercicio14;

public class EditorVideo {

    public EditorVideo() {}

    // Dependencia de creación: crea un Render dentro del método
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto...");
        Render render = new Render(formato, proyecto);
        render.mostrarInfo();
        System.out.println("Exportación completada.\n");
    }
}

