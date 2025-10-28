package mx.edu.uttt.matrices;

import javax.swing.*;

public class TestOperacionesMatrices {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int filas = obtenerTamanio();
        int columnas = obtenerTamanio();

        OperacionesMatrices oper = new OperacionesMatrices(filas, columnas);
        OperacionesMatrices oper2 = new OperacionesMatrices(filas, columnas);
        OperacionesMatrices oper3 = new OperacionesMatrices(filas, columnas);

        double[][] m = new double[filas][columnas];
        llenarMatriz(m);
        oper.setM(m);
        oper.imprimir();
    }

    public static int obtenerTamanio() {
        int valor = 0;
        boolean sentinel = true;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL VALOR"));
                if (valor > 0) {
                    sentinel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El valor debe ser mayor que cero");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un número");
            }
        } while (sentinel);
        return valor;
    }

    public static void llenarMatriz(double[][] matrix) {
        int i = 0, j = 0;
        boolean sentinel;
        do {
            j = 0;
            do {
                sentinel = true;
                do {
                    try {
                        matrix[i][j] = Double.parseDouble(
                                JOptionPane.showInputDialog("Ingresa el valor para [" + i + "][" + j + "]:")
                        );
                        sentinel = false;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "El valor debe ser un número válido");
                    }
                } while (sentinel);
                j++;
            } while (j < matrix[i].length);
            i++;
        } while (i < matrix.length);
    }
}
