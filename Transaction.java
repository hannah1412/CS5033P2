// Transaction class 

import java.util.Date;

class Transaction {
    private String id;
    private Date timestamp;
    private Double amount;
    private String cardProviderID;

    public Transaction(String id, Date timestamp, Double amount, String cardProviderID){
        this.id = id;
        this.timestamp = timestamp;
        this.amount = amount;
        this.cardProviderID = cardProviderID;
    }

    private void setID(String id) {
        // Initialise  transaction ID
    }

    public String getID(){
        return id;
    }
    
    public boolean validate(){
        // Validate validity of given instance
        return false;
    }
}