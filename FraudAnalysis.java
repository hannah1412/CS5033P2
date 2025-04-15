public class FraudAnalysis implements DataOperations, DBInteractions{
    
    private FraudResult result;
    
    /**
     * Evaluate the validity of the transaction in compatible form
     * @param transaction transaction in compatible format
     * @return the fraud result, details on if it is fraud or not
     */
    public FraudResult evaluate(CompatibleTransaction transaction){
        return result;
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
}
