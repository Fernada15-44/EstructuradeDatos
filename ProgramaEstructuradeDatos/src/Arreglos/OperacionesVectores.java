package Arreglos;

import javax.swing.*;

public class OperacionesVectores {
    private double [] vector;
    private final int TAMANO = 5;
    public OperacionesVectores(){
        vector = new double[TAMANO];
    }

    public OperacionesVectores (double [] vector){
        this.vector = new double[vector.length];
        llenarVector(vector);
    }

    private void llenarVector (double [] vector){
        for (int i=0; 1<vector.length; i++){
            this.vector[i] = vector[i];
        }
    }

    public void llenarVector(){
        int i=0;
        do{
            this.vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posicion [" + (i+1) + "]"));
            i++;
        }while (i<this.vector.length);
    }

    public boolean compararArreglos (double [] vector){
        boolean isEqual = true;
        if (this.vector.length != vector.length){
            isEqual = false;
        }else {
            for (int i = 0;  i < this.vector.length && isEqual; i++) {
                if (vector[i] != this.vector[i]) {
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }

    public  void imprimir(){
       this.toString();
    }

    public double sumarElementos(){
        double suma = 0;
        for (double valor : this.vector){
            suma+= valor;
        }
        return suma;
    }

    public double obtenerMaximoValor(){
        int i=0;
        double maximo= 0.0;
        while(i<this.vector.length){

            if(maximo<this.vector[i]){
                maximo = vector[i];
            }
            i++;
        }
        return maximo;
    }

    public double obtenerMinimoValor(){
        double minimo = this.vector[0];
        for(double valor : this.vector){
            if(valor < minimo){
                minimo = valor;
            }
        }
        return minimo;

    }


    public void cambiarTamanioArreglo (int tamanio){
        if(vector.length >= tamanio) {

            double[] temp = new double[tamanio];
            for (int i = 0; i < this.vector.length; i++) {
                temp[i] = this.vector[i];
            }
            temp = null;
            return;
        }
        System.out.println("No se puede crear un arreglo mas pequeño que el vector");

    }

    public String toString(){
        String salida = "";
        for (double valor: this.vector){
            salida+= "|" + valor + " | ";
        }
        return  salida;
    }
}
