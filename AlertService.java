import java.util.*;

public class AlertService implements DBInteractions, DataOperations{

    public void alert(String cardProviderId) {
        // Send alert message to the given Card Provider 
    }
    
    /**
     * Buffer alert to be sent to card providers
     * @param timestamp
     * @param alertMsg
     */
    public void recordBufferAlert(Date timestamp, FormattedAlert alertMsg){
        
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
