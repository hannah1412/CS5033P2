public class DataProcessor implements DBInteractions, DataOperations{
    
    private CompatibleTransaction transaction;
    private FormattedAlert formattedAlert;
    private FormattedResult formattedResult;


    public CompatibleTransaction formatTransaction(String incomingTransaction){
        return transaction;
    }

    public void queueData(CompatibleTransaction[] transactions){

    }

    /**
     * Formatting the result according to Alert service's standard format
     * @param fraudResult - the result of the fraud annalysis
     * @return - formatted result
     */
    public FormattedAlert formatAlert(FraudResult fraudResult){
        return formattedAlert;
    }

    /**
     * Formatting the result to send to the Monitoring service (report format)
     * @param fraudResult
     * @return
     */
    public FormattedResult formatResult(FraudResult fraudResult){
        return  formattedResult;
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
