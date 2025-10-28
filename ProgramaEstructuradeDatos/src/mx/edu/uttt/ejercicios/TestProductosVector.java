package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class TestProductosVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        boolean sentinel = true;

        int tamanio = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el número de productos:"));
        productosVector pv = new productosVector(tamanio);

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion) {
                case "1":
                    if (!pv.estaLleno()) {
                        pv.llenarArreglo(llenarProducto());
                    } else {
                        JOptionPane.showMessageDialog(null, "El vector está lleno.");
                    }
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    String productoEliminar = JOptionPane.showInputDialog("Introduce el nombre del producto que deseas eliminar:");
                    pv.eliminarProducto(productoEliminar);
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    String productoActualizar = JOptionPane.showInputDialog("Introduce el nombre del producto que deseas editar:");
                    String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
                    int nuevaExistencia = Integer.parseInt(JOptionPane.showInputDialog("Nueva existencia:"));
                    double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio:"));
                    pv.actualizarProducto(productoActualizar, nuevoNombre, nuevaExistencia, nuevoPrecio);
                    break;

                case "5":
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (sentinel);
    }

    public static String menu() {
        return """
                Menú Principal
                1) Agregar producto
                2) Eliminar producto
                3) Imprimir productos
                4) Editar producto
                5) Salir
                Elige una opción:
                """;
    }

    public static Producto llenarProducto() {
        Producto producto = new Producto();

        String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto:");
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio:"));

        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);

        return producto;
    }
}

