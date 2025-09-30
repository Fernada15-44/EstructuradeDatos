package mx.edu.uttt;

public class PromedioVector {
    private double[] valores;
    private int indice;

    // Constructor: recibe el tamaño del vector
    public PromedioVector(int tamanio) {
        valores = new double[tamanio];
        indice = 0;
    }

    // Agregar un valor al vector
    public void agregarValor(double valor) {
        if (indice < valores.length) {
            valores[indice] = valor;
            indice++;
        }
    }

    // Calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < indice; i++) {
            suma += valores[i];
        }
        return suma / indice;
    }

    // Contar cuántos valores son mayores que el promedio
    public int contarMayores(double promedio) {
        int contador = 0;
        for (int i = 0; i < indice; i++) {
            if (valores[i] > promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Lista de valores mayores que el promedio
    public String listaMayores(double promedio) {
        String lista = "";
        for (int i = 0; i < indice; i++) {
            if (valores[i] > promedio) {
                lista += valores[i] + "\n";
            }
        }
        return lista.equals("") ? "No hay valores mayores." : lista;
    }
}

