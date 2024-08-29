/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA1_6_ARREGLOS {
        // QUE ES UN ARREGLO? 
        // ES UNA ESTRUCTURA DE DATOS, UN OBJETO, ESTRUCTURA DE DATOS DEL MISMO TIPO
        // ES SECUANCIAL, ES ORDENADA (tiene posiciones)N=cantidad de elementos(primer elemento 0, ultimo n-1)
        //ES INMUTABLE, TIENE INDICE
        //ACCESO A LOS DATOS SE REALIZA DE MANERA ALEATORIA
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]arreglo = new int [10];// Cuanto espacio ocupa? 44bytes
        System.out.println(arreglo);
        //Acceso por indices
        arreglo[0]= 100;
        arreglo[9]= 1000;
        System.out.println("arreglo[0] =" + arreglo[0]);
        System.out.println("arreglo[9] =" + arreglo[9]);
     
    }
    
}
