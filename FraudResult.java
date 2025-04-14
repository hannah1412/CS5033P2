public class FraudResult {
    
    private String id;
    private boolean isFraud;
    private Double score;
    private String cardProviderID;
    private CompatibleTransaction transaction;
    private FraudResult result;

    public FraudResult getResult() {
        return result;
    }
}
