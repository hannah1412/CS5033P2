package FraudAnalysis;
import DataProcessing.CompatibleTransaction;

public class FraudResult {
    
    private String id;
    private boolean isFraud;
    private Double score;
    private String cardProviderID;
    private CompatibleTransaction transaction;
    private FraudResult result;

    /**
     * Return fraud result in raw format
     * @return fraud result
     */
    public FraudResult getResult() {
        return result;
    }
}
