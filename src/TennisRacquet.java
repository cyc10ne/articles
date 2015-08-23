/**
 * Created by cyc10ne on 13.08.2015.
 */
public class TennisRacquet extends AbstractProduct {

    private String material;
    private String companyManufactures;

    TennisRacquet(){}

    TennisRacquet(String name,String material, String companyManufactures, Double price){
        super.name = name;
        this.material = material;
        this.companyManufactures = companyManufactures;
        super.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        if (material != null ? !material.equals(that.material) : that.material != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = material != null ? material.hashCode() : 0;
        result = 31 * result + (companyManufactures != null ? companyManufactures.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TennisRacquet{" + "Name = " + name +
                ", Manufactures company= '" + companyManufactures + '\''
                +    ", Material='" + material + '\''
                + ", price=" + price + '}';
    }
}
