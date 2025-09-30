package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class TestProductosVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        boolean sentinel = true;
        int tamanio = Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el numero de Productos"));
        ProductoVector pv = new ProductoVector(tamanio);

        String opcion = "";
        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion) {
                case "1":
                    if (!pv.estalleno())
                        pv.LlenarArreglo(llenarProducto());
                    else
                        JOptionPane.showMessageDialog(null,
                                "El vector esta lleno");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    String productoEliminar = JOptionPane.showInputDialog("Introduce el nombre del producto que deseas Eliminar");
                    pv.eliminarProducto(productoEliminar);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    String productoActualizar = JOptionPane.showInputDialog("Introduce el nombre del producto que deseas editar");
                    String nuevoNombre = JOptionPane.showInputDialog("Nuevo name: ");
                    int nuevaExistencia = Integer.parseInt(JOptionPane.showInputDialog("Nueva existencia: "));
                    Double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio: "));
                    pv.actualizarProducto(productoActualizar, nuevoNombre, nuevaExistencia, nuevoPrecio);
                    break;
                case "5":
                    sentinel = false;
                    JOptionPane.showMessageDialog(null,
                            "Gracias por todo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }


        } while (sentinel);
    }

    public static String menu() {
        return "Menu Principal\n " +
                "1) Agregar Producto\n" +
                "2) Eliminar Prroducto \n" +
                "3) Imprimir Productos \n" +
                "4) Editar Producto\n" +
                "5) Salir \n" +
                " Elegir Opcion \n";
    }

    public static Producto llenarProducto() {
        // Crea el objeto de producto
        Producto producto = new Producto();

        // Se olicitan los noombres de los valors de instancia
        String nombre = JOptionPane.showInputDialog
                ("Introduce el nombre del producto");
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));

        //Asignan los valores de las variables de instancia del objeto producto
        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);

        return producto;
    }

}