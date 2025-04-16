package Interfaces;
/**
 * Interface for handling database interactions such as reading and writing data.
 */
public interface DBInteractions {
    /**
     * Reads data from the database using the specified query.
     * @param query the query to execute for retrieving data
     * @return the result of the query as a String
     */
    public String readFromDB(String query);

    /**
     * Writes data to the database.
     * @param data the data to be inserted or updated in the database
     */
    void writeToDB(String data);
}
