package basicstuff;
import java.io.Serializable;

public class Message implements Serializable{
    
    private static int theMessageCounter = 0;
    int myMessageNr = 0;
    int myID = 0;
    int myOrigin = 0;
    int myDestination = 0;
    int actionCode = 0;
    int[] myData = new int[] {0,1,2,3};
    String aTextMessage = "nothin here but the NSA";
    
    public void Message(){
        System.out.println("CREATING NEW MESSAGE");
        theMessageCounter = theMessageCounter + 1;
        System.out.println("THE VALUE OF THE MESSAGE COUNTER IS" + theMessageCounter);
        myMessageNr  = theMessageCounter;
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
    
    public int showDestination(int id){
        return myDestination;
    }
    
    public void setDataID(int[] id){
        myData = id;
    }
    
    public int[] showDataID(){
        return myData;    
    }
    
    public void setActionCode(int theActionCode){
        actionCode = theActionCode;
    }
    
    public int getActionCode(){
        return actionCode;
    }
    
    public void setMessageTxt(String aText){
        aTextMessage = aText;
    }
    
    public String getMessageTxt(){
        return aTextMessage;
    }
}