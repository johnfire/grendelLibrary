package basicstuff;
import java.io.Serializable;

public class Message /**/ implements Serializable{

    long idNumber = 0;
    long myOrigin = 0;
    long myDestination = 0;
    int actionCode = 0;
    long myData = 0; 
    String aTextMessage = "nothin here but the NSA";
    
    public void setID(long id){
        idNumber = id;
    }
    
    public long showID(){
        return idNumber;
    }
    
    public void setOrigin (long id){
        myOrigin = id;
    }
    
    public long showOrigin(){
        return myOrigin;   
    }
    
    public void setDestination(long id){
        myDestination = id;    
    }
    
    public long showDestination(long id){
        return myDestination;
    }
    
    public void setDataID(long id){
        myData = id;
    }
    
    public long showDataID(){
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