public class MonitoringService  implements DBInteractions, DataOperations{

    private Report report;

    /**
     * Generate the report for the formatted result
     * @param formattedResult the result of the fraud analysis against the compatible transaction in compatible format
     * @return report incorporating details of the fraud results
     */
    public Report generateReport(FormattedResult formattedResult){
        return report;
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
