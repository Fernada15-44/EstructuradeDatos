package mx.edu.uttt.matrices;

import javax.swing.*;

public class MenuMatrices {

    private double[][] matriz;

    public void crearMatriz() {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Número de columnas:"));
        matriz = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog(
                        "Valor [" + i + "][" + j + "]:"));
            }
        }
    }

    public void mostrar() {
        if (matriz == null) {
            JOptionPane.showMessageDialog(null, "Primero llena la matriz");
            return;
        }
        StringBuilder salida = new StringBuilder();
        for (double[] fila : matriz) {
            for (double valor : fila) {
                salida.append(String.format("%6.2f", valor)).append(" ");
            }
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString(), "Matriz actual", JOptionPane.PLAIN_MESSAGE);
    }

    public boolean esCuadrada() {
        return matriz != null && matriz.length == matriz[0].length;
    }

    public double sumaDebajo() throws Exception {
        if (!esCuadrada()) throw new Exception("La matriz no es cuadrada");
        double suma = 0;
        for (int i = 1; i < matriz.length; i++)
            for (int j = 0; j < i; j++)
                suma += matriz[i][j];
        return suma;
    }

    public double sumaEncima() throws Exception {
        if (!esCuadrada()) throw new Exception("La matriz no es cuadrada");
        double suma = 0;
        for (int i = 0; i < matriz.length - 1; i++)
            for (int j = i + 1; j < matriz.length; j++)
                suma += matriz[i][j];
        return suma;
    }

    public void contorno() {
        if (matriz == null) {
            JOptionPane.showMessageDialog(null, "Primero llena la matriz");
            return;
        }
        int filas = matriz.length;
        int cols = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = (i == 0 || j == 0 || i == filas - 1 || j == cols - 1) ? 1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        MenuMatrices app = new MenuMatrices();
        String[] opciones = {
                "1) Debe llenar la matriz",
                "2) Se desea mostrar la matriz",
                "3) Sumar debajo de la diagonal",
                "4) Sumar encima de la diagonal",
                "5) Contorno 1 e interior 0",
                "6) Salir"
        };

        boolean seguir = true;
        while (seguir) {
            String menu = String.join("\n", opciones) + "\n\nElige una opción:";
            String op = JOptionPane.showInputDialog(menu);
            if (op == null) break;

            try {
                switch (op) {
                    case "1" -> app.crearMatriz();
                    case "2" -> app.mostrar();
                    case "3" -> JOptionPane.showMessageDialog(null, "Suma debajo de diagonal: " + app.sumaDebajo());
                    case "4" -> JOptionPane.showMessageDialog(null, "Suma encima de diagonal: " + app.sumaEncima());
                    case "5" -> {
                        app.contorno();
                        JOptionPane.showMessageDialog(null, "Contorno actualizado (1) e interior (0)");
                    }
                    case "6" -> seguir = false;
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
