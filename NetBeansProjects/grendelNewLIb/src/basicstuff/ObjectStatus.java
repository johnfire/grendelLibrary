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
public class ObjectStatus extends Thread {
    String myName;
    int pid;
    
    public void setMyName(String WhoAmI) {
        myName = WhoAmI;
    }
    
    public void run(){
        while (true){
            try {
                System.out.println("-----CELL REPORT-----we are in the " + myName + " routine, process number "+ pid);
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ObjectStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }
}
