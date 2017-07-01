package basicstuff;

public class message{

    private long idNumber ;
    private long myOrigin ;
    private long myDestination;
    private int actionCode;
    private long myData;  
    
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
}