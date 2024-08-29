/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_paso_parametros;

/**
 *
 * @author Usuario
 */
public class EVA1_5_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num =100;
        incrementa(num);
        System.out.println("valor=" + num);
        
        Prueba objPrueba =new Prueba();
        System.out.println("Valo de x(antes) =" + objPrueba.x);
        incrementaObj(objPrueba);
        System.out.println("Valor de x (despues)" + objPrueba);
    }
    public static void incrementa(int valor) { //PASO POR VALOR
        valor++;
    }
    public static void incrementaObj(Prueba objeto) { //PASO POR REFERENCIA
        objeto.x++;
        
    }
}
class Prueba{
    int x= 5;
}
