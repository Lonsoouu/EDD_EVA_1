/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_arreglo_obi;

/**
 *
 * @author Usuario
 */
public class EVA1_12_ARREGLO_OBI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona[] arregloper = new Persona [5];
        System.err.println("Direccion de arreglos" + arregloper);
        for (int i = 0; i < arregloper.length; i++) {
            arregloper[i] = new Persona();
            System.err.println("arregloper[" + i + "]=" + arregloper[i]);
            System.err.println("Nombre[" + i + "]=" + arregloper[i].getNombre());
            System.err.println("Apellido[" + i + "]=" + arregloper[i].getApellido());
            System.err.println("Edad[" + i + "]=" + arregloper[i].getEdad());
         
        }
        // TODO code application logic herePersona 
    }
}   
    class Persona{
        private String Nombre;
        private String Apellido;

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }

        public void setEdad(int Edad) {
            this.Edad = Edad;
        }

        public String getNombre() {
            return Nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public int getEdad() {
            return Edad;
        }

        public Persona(String Nombre, String Apellido, int Edad) {
            this.Nombre = "ALonso";
            this.Apellido = "Portillo";
            this.Edad = 22;
        }
        private int Edad;

        public Persona() {
        }
        
        
    
}

