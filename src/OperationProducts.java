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
        bootsList.add(new Boots(43, "black"));
        bootsList.add(new Boots(39, "red"));
        bootsList.add(new Boots(41, "brown"));
        bootsList.add(new Boots(43, "black"));
        bootsList.add(new Boots(45, "yellow"));
        bootsList.add(new Boots(44, "black"));
        bootsList.add(new Boots(40, "green"));
        bootsList.add(new Boots(41, "brown"));
        bootsList.add(new Boots(44, "black"));
        bootsList.add(new Boots(39, "red"));

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

    public void printRacquetList(){
        for(AbstractProduct b: racquetList)
            System.out.println(b);
    }

    public void printBootsList(){
        for(AbstractProduct b: bootsList)
            System.out.println(b);
    }
    int countBoots() {
        int count = 0;
        while (count < bootsList.size())
            count++;
        return count;
    }

    int countRacquets() {
        int count = 0;
        while (count < racquetList.size())
            count++;
        return count;
    }

    List<AbstractProduct> sortBootsByPrice(){
        Collections.sort(bootsList);
        return bootsList;
    }

    List<AbstractProduct> sortRacquetByPrice(){
        Collections.sort(racquetList);
        return racquetList;
    }

    Object accessBootsById(int id) {
        Object a = null;
        for (int i = 0; i < bootsList.size(); i++)
            if (i == id)
                a = bootsList.get(id);
        return a;
    }

    Object accessRacquetById(int id) {
        Object a = null;
        for (int i = 0; i < bootsList.size(); i++)
            if (i == id)
                a = bootsList.get(id);
        return a;
    }

    static double averageCost(List<AbstractProduct> abstractProduct){
        double element = 0.0;
        for(int i = 0; i < abstractProduct.size(); i++)
            element += abstractProduct.get(i).getPrice();
        return element/abstractProduct.size();
    }
}
