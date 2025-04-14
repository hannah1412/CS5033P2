public class IdentificationService implements DataOperations, DBInteractions{
    
    /**
     * Validate the card provider before registration
     * @param cardProviderID 
     * @return boolean
     */
    public boolean identify_provider(String cardProviderID){

        return false;
    }

    /**
     * Registering only valid card provider 
     * @param cardProviderID  - given card provider 
     * @param cardProviderInfo - the additional data of the card need to be registered
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
