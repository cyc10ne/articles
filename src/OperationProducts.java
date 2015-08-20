import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cyc10ne on 13.08.2015.
 */
public class OperationProducts extends AbstractProduct implements AbstractProductAbstractFabric {

    List<AbstractProduct> bootsList = new ArrayList<AbstractProduct>();
    List<AbstractProduct> racquetList = new ArrayList<AbstractProduct>();

    List<AbstractProduct> addBoots() {
        bootsList.add(createBoots("Nord", "Black", 46, 32.58));
        bootsList.add(createBoots("Timberland", "White", 42, 132.55));
        bootsList.add(createBoots("Grinders", "Black", 44, 162.25));
        bootsList.add(createBoots("Clarks", "Black", 45, 200.67));
        bootsList.add(createBoots("Kari", "Black", 41, 60.99));
        bootsList.add(createBoots("Geox", "Grey", 40, 100.05));
        bootsList.add(createBoots("Ecco", "Grey", 45, 90.05));
        bootsList.add(createBoots("Panama Jack", "Blue", 39, 200.05));
        bootsList.add(createBoots("Gucci", "Pink", 39, 100.99));
        bootsList.add(createBoots("Lacoste", "Black", 38, 120.50));


        return bootsList;
    }

    List<AbstractProduct> addRacquet(){
        racquetList.add(new TennisRacquet("Graphene","Wilson"));
        racquetList.add(new TennisRacquet("Basalt","Wilson"));
        racquetList.add(new TennisRacquet("Titanium","Head"));
        racquetList.add(new TennisRacquet("Graphene","Head"));
        racquetList.add(new TennisRacquet("Graphene","Wilson"));
        racquetList.add(new TennisRacquet("Basalt","Wilson"));
        racquetList.add(new TennisRacquet("Titanium","Head"));
        racquetList.add(new TennisRacquet("Graphene","Head"));

        return racquetList;
    }

    @Override
    public Boots createBoots(String name, String color, int size, double price) {
        return new Boots(name,color,size,price);
    }

    @Override
    public TennisRacquet createTennisRacquet() {
        return null;
    }

    public void printRacquetList(){
        for(AbstractProduct b: racquetList)
            System.out.println(b);
    }
    public void printBootsList(){
        for(AbstractProduct b: bootsList)
            System.out.println(b);
    }

    int countBoots() {
        return bootsList.size();
    }

    int countRacquets() {
        return racquetList.size();
    }

    List<AbstractProduct> sortBootsByPrice(){
        Collections.sort(bootsList);
        return bootsList;
    }

    List<AbstractProduct> sortRacquetByPrice(){
        Collections.sort(racquetList);
        return racquetList;
    }


    Boots accessBootsById(int id) {
        Boots Boots = null;
        for (int i = 0; i < bootsList.size(); i++){
            if (i == id){
                Boots = (Boots) bootsList.get(id);
                }
            }
        return Boots;
    }

    TennisRacquet accessRacquetById(int id) {
        TennisRacquet TennisRacquet = null;
        for (int i = 0; i < racquetList.size(); i++){
            if (i == id){
                TennisRacquet = (TennisRacquet) racquetList.get(id);
            }
        }
        return TennisRacquet;
    }

    static double averageCost(List<AbstractProduct> abstractProduct){
        double element = 0.0;
        for(int i = 0; i < abstractProduct.size(); i++)
            element += abstractProduct.get(i).getPrice();
        return Math.round(element / abstractProduct.size());
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
        System.out.println("Доступ к теннисным ракеткам по id: " + operationProducts.accessRacquetById(5));
        System.out.println("Доступ к ботинкам по id: " + operationProducts.accessBootsById(5));

        List<AbstractProduct> averagePriceBoots = new ArrayList<AbstractProduct>(operationProducts.bootsList);
        List<AbstractProduct> averagePriceRacquet = new ArrayList<AbstractProduct>(operationProducts.racquetList);
        System.out.println();
        System.out.println("Средняя цена ботинок: " + OperationProducts.averageCost(averagePriceBoots));
        System.out.println("Средняя цена теннисных ракеток: " + OperationProducts.averageCost(averagePriceRacquet));
    }
}
