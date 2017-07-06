package basicstuff;
import java.io.Serializable;

/** standard system message
 * 
 * @author christopherrehm
 */

public class Message implements Serializable{
    
    private static int theMessageCounter = 0;
    int myMessageNr;
    int myID;
    int myOrigin;
    int myDestination;
    int myActionCode;
    int[] myData;
    String aTextMessage;

    public Message(int i, int i0, int i1, int i2, int[] intAry, String blah, boolean real) {
         myID = i;
        myOrigin =i0;
        myDestination = i1;
        myActionCode = i2;
        myData = intAry;
        aTextMessage = blah;
        System.out.println("CREATING NEW MESSAGE");
        
        if ( real == true ) {
            theMessageCounter = theMessageCounter + 1;
            System.out.println("THE VALUE OF THE MESSAGE COUNTER IS" + theMessageCounter);
            myMessageNr = theMessageCounter;
        } else{
            myMessageNr = 0;
        }
    }

    public int showMessageNr(){
        return myMessageNr;
    }
    
    public int showID(){
        return this.myID;
    }
    
    public void setOrigin (int id){
        myOrigin = id;
    }
    
    public int showOrigin(){
        return myOrigin;   
    }
    
    public void setDestination(int id){
        myDestination = id;    
    }
    
    public int showDestination(){
        return myDestination;
    }
    
    public void setDataID(int[] id){
        myData = id;
    }
    
    public int[] showDataID(){
        return myData;    
    }
    
    public void setMyActionCode(int theActionCode){
        myActionCode = theActionCode;
    }
    
    public int getMyActionCode(){
        return myActionCode;
    }
    
    public void setMessageTxt(String aText){
        aTextMessage = aText;
    }
    
    public String getMessageTxt(){
        return aTextMessage;
    }
}