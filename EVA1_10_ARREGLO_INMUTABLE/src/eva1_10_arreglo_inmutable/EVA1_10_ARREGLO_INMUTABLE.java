/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_arreglo_inmutable;

/**
 *
 * @author Usuario
 */
public class EVA1_10_ARREGLO_INMUTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[] = new int [5];
        int temp[] = new int [5];
        temp = datos;
        System.out.println(datos);
        datos[0] = 100;
        datos[1] = 200;
        datos[2] = 300;
        datos[3] = 400;
        datos[4] = 500;
        for (int dato : datos){
            System.out.print("[" + dato + "]");
        }
        System.out.println("");
        datos = new int [6];
        System.out.println(datos);

        datos[5] = 600;
        
        for (int i = 0; i < temp.length; i++) {
            datos[i]= temp[i];
            
        }
        for ( int dato : datos){
            System.err.print("[" + dato + "]");
        }
    }
    
}
