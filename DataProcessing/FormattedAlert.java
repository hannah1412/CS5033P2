package DataProcessing;
import java.util.Date;

public class FormattedAlert {
    
    private String id;
    private Date timestamp;
    private String message;
    private String severity;
    private FormattedAlert alert;

    /**
     * Return formatted alert to be used by alert service
     * @return formatted alert
     */
    public FormattedAlert getFormattedAlert() {
        return alert;
    }
}
