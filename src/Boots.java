import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyc10ne on 08.08.2015.
 */
public class Boots extends ArticlesGood/* implements Comparator<Double> */{

    int size;
    String color;
    int count;
    String name = "Boots";

    public Boots() {
    }

    public Boots(int size, String color) {

        this.size = size;

        switch (getSize()) {
            case 39:
                cost = 24.55;
                break;
            case 40:
                cost = 25.35;
                break;
            case 41:
                cost = 26.78;
                break;
            case 42:
                cost = 27.50;
                break;
            case 43:
                cost = 28.70;
                break;
            case 44:
                cost = 29.70;
                break;
            case 45:
                cost = 31.50;
                break;
            case 46:
                cost = 32.10;
                break;
        }
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
/*
    @Override
    public int compare(Double o1, Double o2) {
        return 0;
    }*/

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }


    List<Boots> bootsList = new ArrayList<Boots>();


    List<Boots> insert() {
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

    int count() {
        while (count < bootsList.size())
            count++;

        return count;
    }
}

