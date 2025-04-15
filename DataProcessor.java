public class DataProcessor implements DBInteractions, DataOperations{
    
    private CompatibleTransaction transaction;
    private FormattedAlert formattedAlert;
    private FormattedResult formattedResult;

    /**
     * Formatting the transaction into a compatible format
     * @param incomingTransaction the transaction in raw format
     * @return formatted transaction
     */
    public CompatibleTransaction formatTransaction(String incomingTransaction){
        return transaction;
    }

    /**
     * Queuing transactions to be analysed
     * @param transactions the transactions in compatible format
     */
    public void queueData(CompatibleTransaction[] transactions){

    }

    /**
     * Formatting the result according to Alert service's standard format
     * @param fraudResult the result of the fraud analysis against the compatible transaction in raw format
     * @return formatted alert
     */
    public FormattedAlert formatAlert(FraudResult fraudResult){
        return formattedAlert;
    }

    /**
     * Formatting the result to send to the Monitoring service (report format)
     * @param fraudResult the result of the fraud analysis against the compatible transaction in raw format
     * @return formatted result to be used in report
     */
    public FormattedResult formatResult(FraudResult fraudResult){
        return formattedResult;
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
