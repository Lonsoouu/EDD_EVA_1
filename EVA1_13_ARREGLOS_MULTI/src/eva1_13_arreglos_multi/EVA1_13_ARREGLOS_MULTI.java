/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_arreglos_multi;

/**
 *
 * @author Usuario
 */
public class EVA1_13_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [3][2];
        System.out.println(matriz);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = (int)(Math.random()*100);
                
            }
            
        }
        
        for (int i = 0; i < matriz[i].length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matriz[i][j] +"]");
            }
            System.out.println("");
        }
    }
    
}
