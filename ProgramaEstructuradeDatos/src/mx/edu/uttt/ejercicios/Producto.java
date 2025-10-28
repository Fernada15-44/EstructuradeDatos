package mx.edu.uttt.ejercicios;

public class Producto {
    private String nombre;
    private int existencia;
    private double precio;

    public Producto() {}

    public Producto(String nombre, int existencia, double precio) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre +
                " | Existencia: " + existencia +
                " | Precio: $" + precio;
    }
}
