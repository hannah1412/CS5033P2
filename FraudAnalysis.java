public class FraudAnalysis implements DataOperations, DBInteractions{
    
    private FraudResult result;
    
    /**
     * perform 
     * @param transaction
     * @return
     */
    public FraudResult evaluate(CompatibleTransaction transaction){
        return  result;
    }

    @Override
    public String receiveData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveData'");
    }

    @Override
    public void forwardData(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forwardData'");
    }

    @Override
    public String readFromDB(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readFromDB'");
    }

    @Override
    public void writeToDB(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeToDB'");
    }
}
