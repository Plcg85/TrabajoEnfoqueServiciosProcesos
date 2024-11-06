/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenfoqueserviciosprocesos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Pedro Luis
 */
//objeto cliente
//cada cliente correrá en un hilo separado y por eso esta clase hereda de thread
public class Cliente extends Thread {

    //variables
    private String nombreCliente = ""; //el nombre del cliente
    private Semaphore semaforo; // la instancia de semaforo
    private int identificadorCliente; //cada cliente es único por su identificador
    private int tiempoConduccion;//el tiempo que cada cliente va a conducir

    //Constructor
    public Cliente(String nombreCliente, Semaphore semaforo, int identificadorCliente, int tiempoConduccion) {

        this.nombreCliente = nombreCliente;
        this.semaforo = semaforo;
        this.identificadorCliente = identificadorCliente;
        this.tiempoConduccion = tiempoConduccion;

    }//final constructor

    //metodo run 
    @Override
    public void run() {

        try {
            
            //el cliente tiene que solicitar una plaza que otorga el objeto semaforo si hay disponible
            semaforo.acquire();
            System.out.println("Empiezo a probar el vehículo, soy  " + nombreCliente + " voy a conducir el coche durante " + tiempoConduccion + " segundos y mi identificador es:" + identificadorCliente);
            
            //se simula la conduccion durante el tiempo especificado por parámetro
            Thread.sleep(tiempoConduccion * 1000); //se multiplica por 1000 para hacerlo milisegundos que es el parámetro que acepta sleep
            System.out.println("Dejo de probar el vehículo, soy el usuario " + nombreCliente + " y mi identificador es:" + identificadorCliente);
            
        } catch (Exception e) {
            
            System.out.println("Error al coger el coche" + e.toString());
            
        } finally {
            
            //con el metodo release se liberan recursos controlados por el semaforo para que otro hilo pueda empezar a funcionar
            semaforo.release();
            
        }

    }//final metodo run

}//final de la clase cliente
