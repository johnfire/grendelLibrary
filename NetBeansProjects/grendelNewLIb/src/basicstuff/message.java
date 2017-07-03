package basicstuff;
import java.io.Serializable;

public class message /**/ implements Serializable{

    private long idNumber = 0;
    private long myOrigin = 0;
    private long myDestination = 0;
    private int actionCode = 0;
    private long myData = 0; 
    private String aTextMessage = "nothin here but the NSA";
    
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