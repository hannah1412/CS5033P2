public interface DBInteractions {
    String readFromDB(String query);
    void writeToDB(String data);
}
