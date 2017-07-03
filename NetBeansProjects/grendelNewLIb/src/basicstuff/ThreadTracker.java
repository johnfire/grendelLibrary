/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicstuff;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christopherrehm
 */
public class ThreadTracker extends Thread {
    public void run(){
        while (true){
            try {
                Thread.getAllStackTraces().keySet().forEach((t) -> System.out.println("-----Thread Tracker Report-----"+ t.getName() + " Is Daemon " + t.isDaemon() + " Is Alive " + t.isAlive()));
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ObjectStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }   
}
