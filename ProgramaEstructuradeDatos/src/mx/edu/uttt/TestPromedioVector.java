package mx.edu.uttt;

import javax.swing.*;

public class TestPromedioVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        // Pedir el tamaño del vector
        int tamanio = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el número de valores")
        );

        PromedioVector pv = new PromedioVector(tamanio);

        // Llenar el vector
        for (int i = 0; i < tamanio; i++) {
            double valor = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce el valor " + (i + 1))
            );
            pv.agregarValor(valor);
        }

        // Calcular promedio
        double promedio = pv.calcularPromedio();

        // Calcular cuántos son mayores y la lista
        int mayores = pv.contarMayores(promedio);
        String lista = pv.listaMayores(promedio);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "Resultados:\n" +
                        "Promedio: " + promedio + "\n" +
                        "Números mayores que el promedio: " + mayores + "\n" +
                        "Lista de valores mayores:\n" + lista
        );
    }
}
