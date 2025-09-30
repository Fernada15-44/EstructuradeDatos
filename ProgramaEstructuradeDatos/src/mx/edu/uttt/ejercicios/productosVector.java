package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class productosVector {
    private final int TAMANO = 2;
    private Producto[] productos;

    // < >

    public productosVector() {
        this.productos = new Producto[this.TAMANO];
    }

    public productosVector(int tamanio) {
        if (tamanio <= 0)
            this.productos = new Producto[this.TAMANO];
        else
            this.productos = new Producto[tamanio];
    }

    public void LlenarArreglo(Producto producto) {
        if (estalleno()) {
            JOptionPane.showMessageDialog(null, "El vector esta lleno");
        } else {
            this.productos[buscarposicion()] = producto;
        }
    }

    private int buscarposicion() {
        int posicion = 0;
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] == null) {
                posicion = i;
                break;

            }
        }
        return posicion;
    }


    public boolean estalleno() {
        boolean lleno = true;
        for (Producto producto : this.productos) {
            if (producto == null) {
                lleno = false;
                break;
            }
        }
        return lleno;
    }

    public String imprimir() {
        String salida = "Lista de Productos\n";

//          for (Producto producto: this.productos){
//            salida += producto.toString() + "\n";
//        }

        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null) {
                salida += this.productos[i].toString() + "\nImporte:" +
                        productos[i].getPrecio() *
                                productos[i].getExistencia()
                        + "\n";
            }
        }

        return salida;

    }

    //Elminar producto, mostrar productos que hay
    // y puede seleccionar el que quiere elminar por nombre,
    // un metodo donde busquen el arreglo por nombre


    public void eliminarProducto(String nombreProducto) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i].getNombre().equalsIgnoreCase(nombreProducto)) {
                this.productos[i] = null;
            }
        }
    }

    public void actualizarProducto(String nombreProducto, String nombre, int existencia, Double precio) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i].getNombre().equalsIgnoreCase(nombreProducto)) {
                this.productos[i].setNombre(nombre);
                this.productos[i].setExistencia(existencia);
                this.productos[i].setPrecio(precio);
            } else {
                System.out.println(":D");
            }
        }
    }
}