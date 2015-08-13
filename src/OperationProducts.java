import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyc10ne on 13.08.2015.
 */
public class OperationProducts extends AbstractProduct{

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
}
