package basicstuff;
import java.io.Serializable;

public class Message implements Serializable{

    int messageNr = 0;
    int idNumber = 0;
    int myOrigin = 0;
    int myDestination = 0;
    int actionCode = 0;
    int[] myData = new int[] {0,1,2,3};
    String aTextMessage = "nothin here but the NSA";
    
    public void setID(int id){
        idNumber = id;
    }
    
    public int showID(){
        return idNumber;
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