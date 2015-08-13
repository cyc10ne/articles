import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyc10ne on 08.08.2015.
 */
public abstract class AbstractProduct implements Comparable<AbstractProduct>{
   protected double price;
   protected String name;
   protected int id;

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
        if (this.price < abstractProduct.getPrice())
            return -1;
        else
        if (this.price == abstractProduct.getPrice())
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {

        OperationProducts operationProducts = new OperationProducts();

        operationProducts.addBoots();
        operationProducts.printBootsList();
        System.out.println();
        operationProducts.sortBootsByPrice();
        operationProducts.printBootsList();
        System.out.println();
        operationProducts.addRacquet();
        operationProducts.printRacquetList();
        System.out.println();
        operationProducts.sortRacquetByPrice();
        operationProducts.printRacquetList();

        System.out.println("Boots = " + operationProducts.countBoots());
        System.out.println("Raquet = " + operationProducts.countRacquets());
        System.out.println();
        System.out.println("Доступ к ботинкам по id: " + operationProducts.accessBootsById(5));
        System.out.println("Доступ к теннисным ракеткам по id: " + operationProducts.accessRacquetById(5));

        List<AbstractProduct> averagePriceBoots = new ArrayList<AbstractProduct>(operationProducts.bootsList);
        List<AbstractProduct> averagePriceRacquet = new ArrayList<AbstractProduct>(operationProducts.racquetList);
        System.out.println();
        System.out.println("Средняя цена туфлей: " + OperationProducts.averageCost(averagePriceBoots));
        System.out.println("Средняя цена теннисных ракеток: " + OperationProducts.averageCost(averagePriceRacquet));
    }


}
