package mx.edu.uttt.matrices;

import javax.swing.*;
import java.util.Random;

public class practicaExamen {
    public static void main(String[] args) {
        int alumnos = 0;// se guardaran los numeros (filas)
        int materias = 0;// se guardan los numeros (columnas)
        alumnos = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el numero de alumnos:"));// se pide ingresar el numero de alumnos
        materias = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingresa el numero de materias:"));//se pide ingresar el numero de materias
        double [][] calificaciones = new double[alumnos][materias];// crea la matriz
        double [] promedioAlumnos = new double[alumnos];//crea los vectores
        double [] promedioMaterias = new double[materias];//crea los vectores
        Random random = new Random();//metodo random
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < materias; j++) {
                calificaciones[i][j] = Math.round(random.nextDouble()*10*10.0)/10.0;
            }
        }
        for (int i = 0; i < alumnos; i++) {
            double suma = 0;


        }
    }
}
