import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cyc10ne on 08.08.2015.
 */
public class Boots extends AbstractProduct implements Comparable<AbstractProduct>{

    int size;
    String color;

    public Boots() {
    }

    public Boots(int size, String color) {

        this.size = size;
        this.initialPrice();
        this.color = color;
    }

     void initialPrice(){

        switch (getSize()) {
            case 39:
                price = 24.55;
                break;
            case 40:
                price = 25.35;
                break;
            case 41:
                price = 26.78;
                break;
            case 42:
                price = 27.50;
                break;
            case 43:
                price = 28.70;
                break;
            case 44:
                price = 29.50;
                break;
            case 45:
                price = 31.50;
                break;
            case 46:
                price = 32.10;
                break;
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boots)) return false;

        Boots boots = (Boots) o;

        if (size != boots.size) return false;
        if (!bootsList.equals(boots.bootsList)) return false;
        if (!color.equals(boots.color)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + color.hashCode();
        result = 31 * result + bootsList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
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
        int count = 0;
        while (count < bootsList.size())
            count++;

        return count;
    }

    List<Boots> sortPrice(){
        Collections.sort(bootsList);
        return bootsList;
    }

    @Override
    public int compareTo(AbstractProduct boots) {
        if (this.price < boots.getPrice())
            return -1;
        else
            if (this.price == boots.getPrice())
            return 0;
        else
            return 1;
    }

    Object accessIndex(int index) {
        Object a = null;
        for (int i = 0; i < bootsList.size(); i++)
            if (i == index)
                a = bootsList.get(index);
        return a;
    }

    public void print(){
        for(Boots b: bootsList)
            System.out.println(b);
    }



}


