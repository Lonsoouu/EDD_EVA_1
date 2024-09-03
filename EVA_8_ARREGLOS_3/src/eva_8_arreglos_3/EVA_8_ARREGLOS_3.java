/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_8_arreglos_3;

/**
 *
 * @author Usuario
 */
public class EVA_8_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] diasSemana = {"Domingo", "Lunes","Martes", "Miercoles","Jueves","Viernes", "Sabado"};
        
        int[] billetes= {20, 50, 100, 200, 500};
        
        for (int i= 0; i <diasSemana.length; i++){
            System.out.print("["+diasSemana[i] + "]" );
        }
        for (int i= 0; i <billetes.length; i++){
            System.out.print("["+billetes[i] + "]" );
        }
            
       
    }
}
    
    

