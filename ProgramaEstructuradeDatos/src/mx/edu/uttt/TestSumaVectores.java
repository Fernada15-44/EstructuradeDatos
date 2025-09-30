package mx.edu.uttt;

import javax.swing.*;

public class TestSumaVectores {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        // Pedir tamaño del vector
        int tamanio = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el tamaño de los vectores")
        );

        // Crear objeto
        SumaVectores sv = new SumaVectores(tamanio);

        // Llenar vector A
        for (int i = 0; i < tamanio; i++) {
            int valor = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + " del vector A")
            );
            sv.setValorA(i, valor);
        }

        // Llenar vector B
        for (int i = 0; i < tamanio; i++) {
            int valor = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + " del vector B")
            );
            sv.setValorB(i, valor);
        }

        // Calcular la suma y mostrar resultados
        sv.calcularSuma();
        JOptionPane.showMessageDialog(null, sv.imprimirC());
    }
}
