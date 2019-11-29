/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hector.ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIELCASTELAO\hposecarames
 */
public class Hilos implements Runnable{
    
    Hilos(){
         Thread hilo2 = new Thread(this, "Hilo2");
         hilo2.start();
         Thread hilo3 = new Thread(this, "Hilo3");
         hilo3.start();
    }
    @Override
    public void run() {
      
        for(int i = 0; i<2; i++){
            System.out.println(i + " "+Thread.currentThread().getName());
            try {
               
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
        
        
           
       }
    }
    
}
