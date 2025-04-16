package Identification;

import Interfaces.DBInteractions;
import Interfaces.DataOperations;

public class IdentificationService implements DataOperations, DBInteractions{
    
    private boolean identified;

    /**
     * Validate the card provider before fraud analysis
     * @param cardProviderID the unique identifier of the card provider 
     * @return true if the card provider is valid, false otherwise
     */
    public boolean identifyProvider(String cardProviderID){

        return identified;
    }

    /**
     * Registering a valid card provider into the system
     * @param cardProviderID the unique identifier of the card provider
     * @param cardProviderInfo additional data about the card provider to be registered
     */
    public void register(String cardProviderID, String cardProviderInfo) {   
    }

    @Override
    public String readFromDB(String query) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'readFromDB'");
    }

    @Override
    public void writeToDB(String data) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'writeToDB'");
    }

    @Override
    public String receiveData() {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'receiveData'");
    }

    @Override
    public void forwardData(String data) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'forwardData'");
    }
}
