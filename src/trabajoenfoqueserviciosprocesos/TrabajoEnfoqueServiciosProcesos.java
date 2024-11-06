/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenfoqueserviciosprocesos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Pedro Luis
 */
public class TrabajoEnfoqueServiciosProcesos {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //los clientes
        String[] nombresCliente = new String[] {"Pedro","Juan","Pepe","Antonio","Jose","Conchi","Paula","Toñi","María"};
        
        //numero de clientes simultaneos
        int clientesSimultaneos = 4;
        
        //se crea un semáforo con 4 clientes
        Semaphore semaforo = new Semaphore(clientesSimultaneos);
        
        //ahora se crean los 9 clientes  cada uno con sus datos
        for(int i = 0; i<=8; i++){
            
            //el tiempo de conducción será aleatorio entre 5 y 15
            int segundosConduccion = (int) Math.floor(Math.random()*(15-5+1)+5);  // Valor entre 5 y 15, ambos incluidos.
            new Cliente(nombresCliente[i], semaforo,  i, segundosConduccion ).start();
        
        }//final del bucle for creando los usuarios
        
        
    }//final main
    
}
