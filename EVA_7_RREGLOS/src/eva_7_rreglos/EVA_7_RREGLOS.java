/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_7_rreglos;

/**
 *
 * @author Usuario
 */
public class EVA_7_RREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] datos = new int [10];
        
        for (int i= 0; i <datos.length; i++){
            datos[i]=(int) (Math.random() * 100);
        }
        for (int i= 0; i <datos.length; i++){
            System.out.print("["+datos[i] + "]" );
        }
        // TODO code application logic here
        
    }
    
}
