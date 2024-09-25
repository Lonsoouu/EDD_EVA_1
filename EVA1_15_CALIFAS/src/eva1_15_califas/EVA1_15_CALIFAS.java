/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_15_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] califas;
        int noCarr, noAl, noGpos;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantas carreras son");
        noCarr = captu.nextInt();
        captu.nextLine();
       
        califas= new int[noCarr][][];
        for (int i = 0; califas.length < 10; i++) {
            System.out.println("Cuantos grupos son");
            noGpos = captu.nextInt();
            captu.nextLine();
            califas[i]= new int[noGpos][];
            for (int j = 0; j< califas[i].length; j++) {
               System.out.println("Cuantos alumnos son");
               noAl = captu.nextInt();
               captu.nextLine();
               califas [i][j]= new int[noAl];
                  for (int k = 0; k < califas[i][j].length; k++) {
                     System.out.println("Clifa para el alumno"+k+ ", del grupo"+j+
                            ", de la carrera"+i);
                     califas [i][j][k]= captu.nextInt();
                     captu.nextLine();
                    
                }
        
            
                
            }
        }
        
      
    }
    
}
