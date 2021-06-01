public class StateCsvException extends Exception{
    public enum StateCsvExceptionType {
        NO_SUCH_FILE, INCORRECT_ENTRIES, DELIMETER_ISSUE, CSV_HEADER_INCORRECT;

    }

    public StateCsvExceptionType type;

    public StateCsvException(StateCsvExceptionType type, String message) {
        this.type = type;
    }


}