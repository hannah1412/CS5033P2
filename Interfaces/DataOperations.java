package Interfaces;
/**
 * Interface for handling data transfer operations between system components.
 */
public interface DataOperations {
    /**
     * Receives data from an external source or service.
     * @return the received data as a String
     */
    public String receiveData();

    /**
     * Forwards data to another service or component for further processing.
     * @param data the data to be forwarded
     */
    public void forwardData(String data);
} 
