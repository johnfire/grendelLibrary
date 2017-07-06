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



/** reports that an object is active as a thread
 *
 * @author christopherrehm
 */
public class ObjectStatus extends Thread {
    String myName;
    int pid = 0;
    
    public void setMyName(String WhoAmI) {
        myName = WhoAmI;
    }
    
    @Override
    public void run(){
        
        // NOTE this is not a child of basic object so code repeats here 
        
        while (true) {            
            try {
                
                this.pid = Integer.parseInt(new File("/proc/self").getCanonicalFile().getName());
            } catch (IOException ex) {
                Logger.getLogger(ObjectStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println(java.time.LocalTime.now() + "-----CELL REPORT----- We are in the " + this.myName + " routine, process number " + this.pid);
                Thread.sleep(30000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ObjectStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }
}
