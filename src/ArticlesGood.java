import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cyc10ne on 08.08.2015.
 */
public abstract class ArticlesGood {
    double cost;
    String name;

    public ArticlesGood() {
    }

    public ArticlesGood(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

        ArticlesGood that = (ArticlesGood) o;

        if (Double.compare(that.cost, cost) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ArticlesGood{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Boots boots = new Boots();
        Boots boots1 = new Boots();
        boots.insert();
        System.out.println(boots.count());
        System.out.println(boots.bootsList.toString());
        System.out.println(boots.bootsList.get(1));
        List<Boots> compareBoots = new ArrayList<Boots>(boots.bootsList);
        Collections.sort(compareBoots,new CostCompare());
        System.out.println(compareBoots);

    }

}
