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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TennisRacquet)) return false;

        TennisRacquet that = (TennisRacquet) o;

        if (companyManufactures != null ? !companyManufactures.equals(that.companyManufactures) : that.companyManufactures != null)
            return false;
        if (materilal != null ? !materilal.equals(that.materilal) : that.materilal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materilal != null ? materilal.hashCode() : 0;
        result = 31 * result + (companyManufactures != null ? companyManufactures.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TennisRacquet{" +
                "materilal='" + materilal + '\'' +
                ", companyManufactures='" + companyManufactures + '\'' +
                ", price=" + price + '}';
    }
}
