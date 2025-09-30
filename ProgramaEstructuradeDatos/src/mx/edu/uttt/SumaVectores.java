package mx.edu.uttt;

public class SumaVectores {
    private int[] a;
    private int[] b;
    private int[] c;
    private int tamanio;

    // Constructor: inicializa los tres vectores
    public SumaVectores(int tamanio) {
        this.tamanio = tamanio;
        a = new int[tamanio];
        b = new int[tamanio];
        c = new int[tamanio];
    }

    // Métodos para asignar valores en A y B
    public void setValorA(int index, int valor) {
        a[index] = valor;
    }

    public void setValorB(int index, int valor) {
        b[index] = valor;
    }

    // Calcular la suma y almacenarla en C
    public void calcularSuma() {
        for (int i = 0; i < tamanio; i++) {
            c[i] = a[i] + b[i];
        }
    }

    // Imprimir el vector C
    public String imprimirC() {
        String resultado = "Resultados del vector C (A + B):\n";
        for (int i = 0; i < tamanio; i++) {
            resultado += "C[" + i + "] = " + a[i] + " + " + b[i] + " = " + c[i] + "\n";
        }
        return resultado;
    }
}
