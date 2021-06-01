
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class StateCensusAnalyzerTest {

    @Test
    public void givenCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() throws IOException {
        StateCensusAnalyzer stateCensusAnalyser = new StateCensusAnalyzer();
        int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        Assertions.assertEquals(30, numberOfRecords);
    }

}