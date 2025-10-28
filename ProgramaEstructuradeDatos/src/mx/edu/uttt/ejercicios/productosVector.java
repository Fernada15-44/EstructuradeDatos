package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class productosVector {
    private Producto[] vector;
    private int contador;

    public productosVector(int tamanio) {
        vector = new Producto[tamanio];
        contador = 0;
    }

    public boolean estaLleno() {
        return contador >= vector.length;
    }

    public void llenarArreglo(Producto p) {
        if (!estaLleno()) {
            vector[contador] = p;
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "El vector está lleno, no se puede agregar más productos.");
        }
    }

    public String imprimir() {
        if (contador == 0) return "No hay productos registrados.";

        StringBuilder sb = new StringBuilder("Lista de productos:\n");
        for (int i = 0; i < contador; i++) {
            sb.append(i + 1).append(") ").append(vector[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (vector[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < contador - 1; j++) {
                    vector[j] = vector[j + 1];
                }
                vector[contador - 1] = null;
                contador--;
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el producto.");
    }

    public void actualizarProducto(String nombreAntiguo, String nuevoNombre, int nuevaExistencia, double nuevoPrecio) {
        for (int i = 0; i < contador; i++) {
            if (vector[i].getNombre().equalsIgnoreCase(nombreAntiguo)) {
                vector[i].setNombre(nuevoNombre);
                vector[i].setExistencia(nuevaExistencia);
                vector[i].setPrecio(nuevoPrecio);
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el producto a editar.");
    }
}
