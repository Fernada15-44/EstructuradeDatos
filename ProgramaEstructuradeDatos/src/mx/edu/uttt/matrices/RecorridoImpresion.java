package mx.edu.uttt.matrices;

import javax.swing.*;

public class RecorridoImpresion {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int [][] matri = new int [solicitarNumeroDeFilas()][solicitarNumeroDeColumnas()];
        llenar(matri);
        imprimir4(matri);
    }
    public static int solicitarNumeroDeFilas(){
        boolean sentinel = true;
        int numFilas =0;
        do{
            try {
                numFilas =
                        Integer.parseInt (JOptionPane.showInputDialog ("Introduce el numero de filas"));
                if(numFilas > 0){
                    sentinel = false;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "El valor debe ser mayor a cero");
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog (null,
                        "El valor debe ser un entero");
            }
        }while(sentinel);

        return numFilas;
    }

    public static int solicitarNumeroDeColumnas(){
        boolean sentinel = true;
        int numColumnas =0;
        do{
            try {
                numColumnas =
                        Integer.parseInt (JOptionPane.showInputDialog ("Introduce el numero de columnas"));
                if(numColumnas > 0){
                    sentinel = false;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "El valor debe ser mayor a cero");
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog (null,
                        "El valor debe ser un entero");
            }
        }while(sentinel);

        return numColumnas;
    }

    public static int solicitarValor(){
        int valor = 0;
        boolean sentinel = true;
        do {
            try {
                valor = Integer.parseInt (JOptionPane.showInputDialog("Introduce el valor"));
                sentinel = false;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser un número");
            }
        }while(sentinel);

        return valor;
    }

    public static void llenar(int [][] ma){
        for (int i = 0; i <ma.length ; i++) {
            for (int j = 0; j <ma[i].length ; j++) {
                ma[i][j] = solicitarValor();
            }
        }
    }

    public static void imprimir( int [][] matrix ){
        int i=0;
        int j=0;
        String salida = "";
        while(i<matrix.length){
            j = 0;
            while(j<matrix[i].length){
                salida+= matrix[i][j] + " ";
                j++;
            }
            salida+="\n";
            i++;
        }

        JOptionPane.showMessageDialog(null, salida);
    }

    public void imprimir2 (int [][] matrix){
        int i=0, j=0;
        String salida = "";
        do{
            do{
                salida+=matrix[i][j] + " ";
                j++;
            }while(j<matrix[i].length);
            salida+="\n";
            j=0;
            i++;
        }while(i<matrix.length);

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void imprimir3(int [][] matrix){
        String salida = "";
        int j =0;

        for (int i = 0; i < matrix.length; i++);{

            j=0;
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void imprimir4(int [][] kiss){
        String salida = " ";
        //en una matriiz cada fila es un arreglo unidimensional (vector)
        for(int [] fila : kiss) {
            for (int valor : fila) {
                salida+= valor + " ";
            }
            salida+="\n";
        }
    }
}






