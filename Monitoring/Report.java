package Monitoring;
import DataProcessing.FormattedResult;

public class Report {
    
    private String title;
    private String cardProviderID;
    private String mainBody;
    private FormattedResult result;
    private Report report;

    /**
     * Return report incorporating details of the fraud results
     * @return report
     */
    public Report getReport(){
        return report;
    }
}
