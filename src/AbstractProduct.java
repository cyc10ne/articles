import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyc10ne on 08.08.2015.
 */
public abstract class AbstractProduct {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractProduct that = (AbstractProduct) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ArticlesGood{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract int compareTo(AbstractProduct boots);

    static double averageCost(List<AbstractProduct> abstractProduct){
        double element = 0.0;
        for(int i = 0; i < abstractProduct.size(); i++)
             element += abstractProduct.get(i).getPrice();
         return element/ abstractProduct.size();
    }

    public static void main(String[] args) {
            Boots boots = new Boots();
            Shoes shoes = new Shoes();
        boots.insert();
        boots.print();
            System.out.println();
        boots.sortCost();
        boots.print();
            System.out.println();
        shoes.insert();
        shoes.print();
            System.out.println();
        shoes.sortCost();
        shoes.print();
            System.out.println();
        List<AbstractProduct> agShoes = new ArrayList<AbstractProduct>(shoes.shoesList);
        List<AbstractProduct> agBoots = new ArrayList<AbstractProduct>(boots.bootsList);
        System.out.println("Средняя цена туфлей: " + averageCost(agShoes));
        System.out.println("Средняя цена ботинок: " + averageCost(agBoots));
    }


}
