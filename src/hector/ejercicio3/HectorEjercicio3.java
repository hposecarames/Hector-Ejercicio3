/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hector.ejercicio3;

/**
 *
 * @author DANIELCASTELAO\hposecarames
 */
public class HectorEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Hilos hilo1 = new Hilos();
        hilo1.run();
        
        
        System.out.println("Programa finalizado");
    }
    
}
