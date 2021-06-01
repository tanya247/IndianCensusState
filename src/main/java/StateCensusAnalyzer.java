import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Iterator;

public class StateCensusAnalyzer {
    public int numberOfEntries() throws StateCsvException, IOException {
        int count = 0;
        try {
            Reader reader = Files
                    .newBufferedReader(Paths.get("C:\\Users\\tanya\\Downloads\\IndiaStateCensusData.csv"));

            CSVReader csvReader = new CSVReader(reader);
            String records[];
            while ((records = csvReader.readNext()) != null) {
                for (String record : records) {
                    System.out.println(record);

                }
                count += 1;
            }
            csvReader.close();
        } catch (NoSuchFileException noSuchFileException) {
            throw new StateCsvException(StateCsvException.StateCsvExceptionType.NO_SUCH_FILE,
                    "!!Unable to retrieve file , no such file exist!!");

        } catch (RuntimeException runtimeException){
            throw new StateCsvException(StateCsvException.StateCsvExceptionType.INCORRECT_ENTRIES,"!!File Contains Incorrect Data!!");
        }
        return  count;
    }

}