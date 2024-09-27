/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_for_recursivo;

/**
 *
 * @author Usuario
 */
public class EVA1_16_FOR_RECURSIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // for (int i = 5; i > 0; i--) {
            //System.out.print(i + "-");}
            
        
        forRecursivoUp(1,5);
        
    }
    public static void forRecursivo(int val){
         System.out.print(val + "-");
         if(val >1)
            forRecursivo(val - 1);
        
    }
    public static void forRecursivoUp(int val, int fin){
         
        System.out.print(val + "-");
            if(val < fin)
                forRecursivoUp(val + 1, fin);
        
    }
        
    }
    

