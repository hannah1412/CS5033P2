package DataProcessing;
import java.util.Date;

public class CompatibleTransaction {
    
    private String id;
    private Date timestamp;
    private Double amount;
    private String cardProviderID;

    /**
     * getter method to return compatible transaction id
     * @return the id of the transaction
     */
    public String getID(){
        return id;
    }

    /**
     * setter method to set compatible transaction id
     * @param id id of the transaction
     */
    public void setID(String id){
        this.id = id;
    }

    /**
     * Checking the legitimacy of a transaction 
     * @return false if not a valid transaction, else true
     */
    public boolean validate(){
        return false;
    }
}
