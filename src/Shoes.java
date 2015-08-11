import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cyc10ne on 08.08.2015.
 */
public class Shoes extends ArticlesGood implements Comparable<ArticlesGood>{

    int size;
    String color;

    public Shoes() {
    }

    public Shoes(int size, String color) {

        this.size = size;

        switch (getSize()) {
            case 39:
                cost = 14.05;
                break;
            case 40:
                cost = 15.65;
                break;
            case 41:
                cost = 16.58;
                break;
            case 42:
                cost = 17.50;
                break;
            case 43:
                cost = 18.80;
                break;
            case 44:
                cost = 19.60;
                break;
            case 45:
                cost = 21.40;
                break;
            case 46:
                cost = 22.30;
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

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

        List<Shoes> shoesList = new ArrayList<Shoes>();

    List<Shoes> insert() {
        shoesList.add(new Shoes(43, "black"));
        shoesList.add(new Shoes(39, "red"));
        shoesList.add(new Shoes(41, "brown"));
        shoesList.add(new Shoes(43, "black"));
        shoesList.add(new Shoes(45, "yellow"));
        shoesList.add(new Shoes(44, "black"));
        shoesList.add(new Shoes(40, "green"));
        shoesList.add(new Shoes(41, "brown"));
        shoesList.add(new Shoes(44, "black"));
        shoesList.add(new Shoes(39, "red"));

        return shoesList;
    }

    int count() {
        int count = 0;
        while (count < shoesList.size())
            count++;

        return count;
    }

    List<Shoes> sortCost(){
        Collections.sort(shoesList);
        return shoesList;
    }

    @Override
    public int compareTo(ArticlesGood shoes) {
        if (this.cost < shoes.getCost())
            return -1;
        else
            if (this.cost == shoes.getCost())
            return 0;
        else
            return 1;
    }

    Object accessIndex(int index) {
        Object a = null;
        for (int i = 0; i < shoesList.size(); i++)
            if (i == index)
                a = shoesList.get(index);
        return a;
    }

    public void print(){
        for(Shoes b: shoesList)
            System.out.println(b);
    }
}


