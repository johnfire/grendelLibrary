/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicstuff;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author christopherrehm
 */
public class ObjectStatus extends Thread {
    String myName;
    
    public void setMyName(String WhoAmI) {
        myName = WhoAmI;
    }
    
    @Override
    public void run(){
        int pid = 0;
            // NOTE this is not a child of basic object so code repeats here 
            try {
                
                pid = Integer.parseInt(new File("/proc/self").getCanonicalFile().getName());
            } catch (IOException ex) {
            Logger.getLogger(ObjectStatus.class.getName()).log(Level.SEVERE, null, ex);
        
            try {
                System.out.println("-----CELL REPORT-----we are in the " + myName + " routine, process number " + pid);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Logger.getLogger(ObjectStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }
}
