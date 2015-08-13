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
    public String toString() {
        return "ArticlesGood{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    static double averageCost(List<AbstractProduct> abstractProduct){
        double element = 0.0;
        for(int i = 0; i < abstractProduct.size(); i++)
             element += abstractProduct.get(i).getPrice();
         return element/ abstractProduct.size();
    }

    public static void main(String[] args) {
            Boots boots = new Boots();
        boots.insert();
        boots.print();
            System.out.println();
        boots.sortPrice();
        boots.print();
            System.out.println();

        List<AbstractProduct> agBoots = new ArrayList<AbstractProduct>(boots.bootsList);
//        System.out.println("Средняя цена туфлей: " + averageCost(agShoes));
        System.out.println("Средняя цена ботинок: " + averageCost(agBoots));
    }


}
