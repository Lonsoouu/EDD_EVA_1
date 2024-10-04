/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_mcd;

/**
 *
 * @author Usuario
 */
public class EVA1_18_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El MCD de 180 y 48 es" + mcd(180,48));
    }
  
    public static int mcd(int num1, int num2){
       int modulo = num1 % num2;
       if( modulo==0)
           return num2;
       
       else
           return mcd(num2, modulo);
    }
    

}
   
    
    
    
    
    
    
    
    
    
    
    
    





