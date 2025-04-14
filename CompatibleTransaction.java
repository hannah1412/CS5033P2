import java.util.Date;

public class CompatibleTransaction {
    
    private String id;
    private Date timestamp;
    private Double amount;
    private String cardProviderID;


    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    /**
     * Checking the legitimate of a transaction 
     * @return 
     */
    public boolean validate(){
        return false;
    }
}
