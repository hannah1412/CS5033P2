
public class AuthenticationService implements DBInteractions, DataOperations{
    
    private String sessionToken;
    
    /**
     * Validate admin's credential
     * @param admin
     * @return
     */
    public boolean validateCredential(Admin admin){
        return false;
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
