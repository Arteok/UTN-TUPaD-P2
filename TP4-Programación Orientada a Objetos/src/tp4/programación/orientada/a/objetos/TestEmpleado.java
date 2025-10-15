
package tp4.programación.orientada.a.objetos;

public class TestEmpleado {
    public static void ejecutarPruebas() {
        
       // Crear empleados con distintos constructores
        Empleado e1 = new Empleado(100, "Jose López", "Gerente", 75000);
        Empleado e2 = new Empleado(101, "Juan Pérez", "Analista", 50000);
        Empleado e3 = new Empleado("María Gómez", "Asistente");
        Empleado e4 = new Empleado("Carlos Díaz", "Técnico");

        // Actualizando salarios
        e1.actualizarSalario(10);       // Aumento del 10%
        e2.actualizarSalario(5000);     // Aumento fijo de 5000
        e3.actualizarSalario(5);        // Aumento del 5%
        e4.actualizarSalario(2000);     // Aumento fijo de 2000

        // Imprimiendo información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrando total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

