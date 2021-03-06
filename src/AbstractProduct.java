/**
 * Created by cyc10ne on 08.08.2015.
 */
public abstract class AbstractProduct implements Comparable<AbstractProduct>{
   protected double price;
   protected String name;

    public AbstractProduct() {
    }

    public AbstractProduct(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AbstractProduct abstractProduct) {
     return (this.price < abstractProduct.getPrice() ? -1 : (this.price == abstractProduct.getPrice() ? 0 : 1));
    }
}
