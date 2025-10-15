
package tp4.programación.orientada.a.objetos;

public class Empleado {
    // Atributos encapsulados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;

    // Atributo auxiliar para generar IDs automáticos
    private static int siguienteId = 1;

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;   // Asigna id automáticamente
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0;   // Salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Getters y Setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

