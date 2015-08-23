import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cyc10ne on 13.08.2015.
 */
public class OperationProducts extends AbstractProduct {

    List<AbstractProduct> bootsList = new ArrayList<AbstractProduct>();
    List<AbstractProduct> racquetList = new ArrayList<AbstractProduct>();

    List<AbstractProduct> addBoots() {
        bootsList.add(new Boots("Nord", "Black", 46, 32.58));
        bootsList.add(new Boots("Timberland", "White", 42, 132.55));
        bootsList.add(new Boots("Grinders", "Black", 44, 162.25));
        bootsList.add(new Boots("Clarks", "Black", 45, 200.67));
        bootsList.add(new Boots("Kari", "Black", 41, 60.99));
        bootsList.add(new Boots("Geox", "Grey", 40, 100.05));
        bootsList.add(new Boots("Ecco", "Grey", 45, 90.05));
        bootsList.add(new Boots("Panama Jack", "Blue", 39, 200.05));
        bootsList.add(new Boots("Gucci", "Pink", 39, 100.99));
        bootsList.add(new Boots("Lacoste", "Black", 38, 120.50));


        return bootsList;
    }

    List<AbstractProduct> addRacquet(){
        racquetList.add(new TennisRacquet("Tennis racquet","Graphene","Wilson",198.0));
        racquetList.add(new TennisRacquet("Tennis racquet","Basalt","Wilson", 99.0 ));
        racquetList.add(new TennisRacquet("Tennis racquet","Titanium","Head", 126.0));
        racquetList.add(new TennisRacquet("Tennis racquet","Graphene","Head", 156.5));
        racquetList.add(new TennisRacquet("Tennis racquet","Graphene","Wilson", 201.1));
        racquetList.add(new TennisRacquet("Tennis racquet","Basalt","Wilson", 189.0));
        racquetList.add(new TennisRacquet("Tennis racquet","Titanium","Head", 95.20));
        racquetList.add(new TennisRacquet("Tennis racquet","Graphene","Head", 113.7));

        return racquetList;
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

    static double averagePrice(List<AbstractProduct> abstractProduct){
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
        System.out.println();

        System.out.println("Boots = " + operationProducts.countBoots());
        System.out.println("Raquet = " + operationProducts.countRacquets());
        System.out.println();

        System.out.println("Доступ к теннисным ракеткам по id: " + operationProducts.accessRacquetById(5));
        System.out.println("Доступ к ботинкам по id: " + operationProducts.accessBootsById(5));
        System.out.println();

        System.out.println("Средняя цена ботинок: " + OperationProducts.averagePrice(operationProducts.bootsList));
        System.out.println("Средняя цена теннисных ракеток: " + OperationProducts.averagePrice(operationProducts.racquetList));
    }
}
