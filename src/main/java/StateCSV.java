import com.opencsv.bean.CsvBindByName;
public class StateCSV {
    @CsvBindByName(column = "SrNo",required = true)
    public String srNo;
    @CsvBindByName(column = "State",required = true)
    public String state;
    @CsvBindByName(column = "Population",required = true)
    public String population;
    @CsvBindByName(column = "AreaInSqKm",required = true)
    public String areaInSqKm;
    @CsvBindByName(column = "DensityPerSqKm",required = true)
    public String densityPerSqKm;

    public String getSrNo() {
        return srNo;
    }

    public String getState() {
        return state;
    }

    public String getPopulation() {
        return population;
    }

    public String getAreaInSqKm() {
        return areaInSqKm;
    }

    public String getDensityPerSqKm() {
        return densityPerSqKm;
    }

    public void setState(String state) {
        this.state = state;
    }
}
