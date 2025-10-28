package mx.edu.uttt.matrices;

import javax.swing.*;

public class OperacionesMatrices {
    private double [][] m;

    public OperacionesMatrices (int numFilas, int numColumnas){
        if(validarTamanio(numFilas) && validarTamanio(numColumnas)){
            m = new double [numFilas][numColumnas];
        }else{
            m = new double[2][2];
        }
    }

    private boolean validarTamanio(int tamanio){
        return tamanio > 0;
    }

    public double [][] getM(){
        return this.m;
    }

    public void setM (double [] [] m){
        if (!(m.length == this.m.length && m[0].length == this.m[0].length))
            return;
        for (int i = 0; i < this.m.length ; i++) {
            for (int j = 0; j <this.m[i].length ; j++) {
                this.m[i][j] = m[i][j];
            }
        }
    }

    private boolean validarCuadrada(){
        return this.m.length == this.m[0].length;
    }

    public double sumarDiagonal() throws Exception{
        if (!(validarCuadrada()))
            throw new Exception("La Matriz no es cuadrada");
        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }

    public double sumarDiagonalInversa() throws Exception{
        if (!(validarCuadrada()))
            throw new Exception("La Matriz no es cuadrada");
        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][m.length - 1 - i];
        }
        return suma;
    }

    public double [] sumarFilas(){
        int numFilas = m.length;
        int numColumnas = m[0].length;
        double[] sumaFilas = new double[numFilas];
        for (int i = 0; i < numFilas; i++) {
            double suma = 0.0;
            for (int j = 0; j < numColumnas; j++) {
                suma += m[i][j];
            }
            sumaFilas[i] = suma;
        }
        return sumaFilas;
    }

    public double [] sumarColumnas(){
        int numFilas = m.length;
        int numColumnas = m[0].length;
        double[] sumaColumnas = new double[numColumnas];
        for (int j = 0; j < numColumnas; j++) {
            double suma = 0.0;
            for (int i = 0; i < numFilas; i++) {
                suma += m[i][j];
            }
            sumaColumnas[j] = suma;
        }
        return sumaColumnas;
    }

    public String imprimirSumaColumnasFilas(){
        double[] filas = sumarFilas();
        double[] columnas = sumarColumnas();
        StringBuilder salida = new StringBuilder("Suma de Filas:\n");
        for (int i = 0; i < filas.length; i++) {
            salida.append("Fila ").append(i + 1).append(": ").append(filas[i]).append("\n");
        }
        salida.append("\nSuma de Columnas:\n");
        for (int j = 0; j < columnas.length; j++) {
            salida.append("Columna ").append(j + 1).append(": ").append(columnas[j]).append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
        return salida.toString();
    }

    public double[][] sumarMatrices(double [][]m1, double [][]m2){
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            JOptionPane.showMessageDialog(null, "Las matrices deben tener el mismo tamaño");
            return null;
        }
        double [][] resultado = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultado;
    }

    public double[][] restarMatrices(double [][]m1, double [][]m2){
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            JOptionPane.showMessageDialog(null, "Las matrices deben tener el mismo tamaño");
            return null;
        }
        double [][] resultado = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                resultado[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return resultado;
    }

    public double[][] multiplicarMatrices(double [][]m1, double [][]m2){
        if (m1[0].length != m2.length) {
            JOptionPane.showMessageDialog(null, "No se pueden multiplicar: columnas de M1 ≠ filas de M2");
            return null;
        }
        double [][] resultado = new double[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return resultado;
    }

    public double[][] Transpuesta(){
        double [][] transpuesta = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                transpuesta[j][i] = m[i][j];
            }
        }
        return transpuesta;
    }

    public void imprimir(){
        StringBuilder salida = new StringBuilder();
        for (double [] fila: this.m){
            for (double valor : fila){
                salida.append(valor).append(" | ");
            }
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }
}
