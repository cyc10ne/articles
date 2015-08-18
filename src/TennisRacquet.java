/**
 * Created by cyc10ne on 13.08.2015.
 */
public class TennisRacquet extends AbstractProduct {

    private String material;
    private String companyManufactures;

    TennisRacquet(){}

    TennisRacquet(String material, String companyManufactures){
        this.material = material;
        this.companyManufactures = companyManufactures;
        this.racquetInitialPrice();
    }

    double racquetInitialPrice(){
        if(getCompanyManufactures().equals("Wilson"))
           if(getMaterial().equals("Graphene"))
                price = 199.0;
        else
           if(getMaterial().equals("Basalt"))
                price = 99.0;

        if(getCompanyManufactures().equals("Head"))
           if (getMaterial().equals("Graphene"))
                price = 189.95;
        else
           if(getMaterial().equals("Titanium"))
                price = 79.55;
        return price;
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
        return "TennisRacquet{" +
                "Material='" + material + '\'' +
                ", manufactures company='" + companyManufactures + '\'' +
                ", price=" + price + '}';
    }
}
