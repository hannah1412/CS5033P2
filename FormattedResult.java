import java.util.Date;

public class FormattedResult {
    
    private String result;
    private String id;
    private Date timestamp;
    private Double score;
    private String reason;
    private String cardProviderID;
    private FormattedResult formattedResult;

    /**
     * Return formatted result to be used by monitoring service
     * @return formatted result
     */
    public FormattedResult getFormattedResult() {
        return formattedResult;
    }
}
