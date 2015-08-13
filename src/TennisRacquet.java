/**
 * Created by cyc10ne on 13.08.2015.
 */
public class TennisRacquet extends AbstractProduct {

    String materilal;
    String companyManufactures;

    TennisRacquet(){}

    TennisRacquet(String materilal, String companyManufactures){
        this.materilal = materilal;
        this.companyManufactures = companyManufactures;
    }

    public String getMaterilal() {
        return materilal;
    }

    public void setMaterilal(String materilal) {
        this.materilal = materilal;
    }

    public String getCompanyManufactures() {
        return companyManufactures;
    }

    public void setCompanyManufactures(String companyManufactures) {
        this.companyManufactures = companyManufactures;
    }


}
