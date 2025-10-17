package resolucion.tp5.Ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;          // agregación
    private Conductor conductor;  // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + modelo + ", Patente: " + patente);
        motor.mostrarInfo();
        conductor.mostrarInfo();
    }
}

