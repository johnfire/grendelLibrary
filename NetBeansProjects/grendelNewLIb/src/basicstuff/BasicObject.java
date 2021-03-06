package basicstuff;

//test
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;

/*
 * Copyright (C) 2017 christopherrehm.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

/**
 *
 * @author christopherrehm
 */
public class BasicObject extends Thread implements Serializable {
    int messageCounter = 0;
    
    // this is the basic object that all objects are derived from it has the following properties
    // creates and implements analysis
    // creates and implements basic Message sending anywhere in the system
    // maintains a list of who is accessing this object lock problems 
    // write data to txt file 
    // read data from txt file
    
    long timerTotal = 0 ;
    long startTime = 0 ;
   

    public long now() {
       return this.getCurrentTime();  
    }
    
    public void setStrartTime(long inputTime){
        startTime = inputTime;  
    }
    
    public long getStartTime(){
        return startTime;
    }
    
    public long calcluateTimeDiff(long startTime, long endTime) {
        return endTime-startTime;   
    }
        
    public long updateTotalTime(long startTime, long endTime){
        return timerTotal += endTime - startTime;
    }
    
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
    
    public long getTotalTime(){
        return timerTotal;
    }
    
//    public Message newMessage(int myID, int destination, int actionCode, int[] data, String text) {
//        
//        Message newMessage = new Message();
//        
//        newMessage.myOrigin = myID;
//        newMessage.myDestination = destination;
//        newMessage.myActionCode = actionCode;
//        newMessage.myData = data;
//        newMessage.aTextMessage = text;
//        return newMessage;
//    } 
    
//    public Message generateRndMessage (int myID, int destination, int actionCode,int[] data, String text, boolean real){
//        Message myNewMsg;
//        myNewMsg = Message(myID, destination, actionCode, data, text ,real);
//        myNewMsg.aTextMessage = UUID.randomUUID().toString();
//        return myNewMsg;
//    }
    
    public String readTxtFile(String someTxtFile){
       String mystring = null;   
       // some proceedure here
       System.out.println("Reading File from Java code");
       //Name of the file
       try{
          //Create object of FileReader
          FileReader inputFile = new FileReader(someTxtFile);

           //Variable to hold the one line data
           try ( //Instantiate the BufferedReader Class
                   BufferedReader bufferReader = new BufferedReader(inputFile)) {
               //Variable to hold the one line data
               String line;
               // Read file line by line and print on the console
               while ((line = bufferReader.readLine()) != null) {
                   mystring += line;
                   // System.out.println(line);
               }
               //Close the buffer reader
           }
       }catch(IOException e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }
       return mystring; 
    }
    
    public int writeTxtFile(String someTxt, String someTxtFile){   
         try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(someTxtFile), "utf-8"))) {
           writer.write(someTxt);
        } catch (IOException ex) {
            Logger.getLogger(BasicObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    // NOTE this is for assembling strings. not currently used. 
    public String buildMessage (String[] args){
        int x = 0;
        String theMessage = "";
        for ( x=0; x<args.length; x++){
         theMessage += args[x];    
        }
        System.out.println("the message assembled is " + theMessage);
        return theMessage;
    }
    
    public void systemMessage(String msg){
        System.out.println(java.time.LocalTime.now() + "-----System Message-----" + msg);  
    }
    
    public void systemMessageError(String msg){
        System.out.println(java.time.LocalTime.now() + "-----SYSTEM MESSAGE -ERROR-----" + msg);  
    }
    
    public void systemMessageStartUp (String msg){
        System.out.println(java.time.LocalTime.now() + "-----System Message -Start Up Notice-----" + msg);
    }
    
    public void testingMessage (String msg){
        System.out.println(java.time.LocalTime.now() + "-----Testing Message-----" + msg);
    }
    
    public int getPID(){
        int pid = 0;
        try {
             pid = Integer.parseInt(new File("/proc/self").getCanonicalFile().getName());
            
        } catch (IOException ex) {
            Logger.getLogger(BasicObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pid;
    }  
    
    public void startObjStatus (String myName){try {

            this.systemMessageStartUp("start object status method is starting");
            ObjectStatus myStats = new basicstuff.ObjectStatus();
            myStats.setMyName(myName);
            Thread visionThread = new Thread(myStats);
            visionThread.start();
            this.systemMessageStartUp("starting " + myName + " cell object status tracker");
        } catch (Exception e) {
            this.systemMessageError("something is wrong in the startObjStatus routine");
        }
    }
}
