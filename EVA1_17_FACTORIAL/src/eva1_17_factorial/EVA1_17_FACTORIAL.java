/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_factorial;

/**
 *
 * @author Usuario
 */
public class EVA1_17_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial(5) = " + factorial(5));  
    }
    public static int factorial (int valor){
        int facto = 1;
        for (int i = 1; i <= valor; i++) 
            facto = facto * i;
            return facto;
            
        
    }


    public static int factorialX (int valor){
        if(valor > 0) 
          return valor * factorialX(valor-1);
        else
          return 1;
    }
}


       
    
   
  

 


   

        
    

