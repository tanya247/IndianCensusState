import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class StateCensusAnalyzerTest {

    @Test
    public void givenCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() throws IOException, StateCsvException {
        StateCensusAnalyzer stateCensusAnalyser = new StateCensusAnalyzer();
        int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        Assertions.assertEquals(30, numberOfRecords);
    }
    @Test
    public void givenCSVFile_WhenNumberOfRecordNOtMatches_ShouldReturnException() throws StateCsvException, IOException {
        StateCensusAnalyzer stateCensusAnalyser = new StateCensusAnalyzer();
        try {
            int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        } catch (StateCsvException e) {
            e.printStackTrace();
            Assertions.assertEquals(StateCsvException.StateCsvExceptionType.NO_SUCH_FILE, e.type);
        }
    }
    @Test
    public void givenCSVFile_WhenCorrect_ButTypeIncorrect_ShouldReturnException()
            throws StateCsvException, IOException {
        StateCensusAnalyzer stateCensusAnalyser = new StateCensusAnalyzer();
        try {
            int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        } catch (StateCsvException e) {
            e.printStackTrace();
            Assertions.assertEquals(StateCsvException.StateCsvExceptionType.INCORRECT_ENTRIES, e.type);
        }
    }
}