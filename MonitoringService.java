public class MonitoringService  implements DBInteractions, DataOperations{

    private Report report;

    /**
     * Generate the report for each given result
     * @param formattedResult
     * @return - a report 
     */
    public Report generateReport(FormattedResult formattedResult){
        return report;
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
}
