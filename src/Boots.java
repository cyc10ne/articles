/**
 * Created by cyc10ne on 08.08.2015.
 */
public class Boots extends AbstractProduct{
    private int size;
    private String color;

    public Boots() {
    }

    public Boots(int size, String color) {
        this.size = size;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boots)) return false;

        Boots boots = (Boots) o;

        if (size != boots.size) return false;
        if (!color.equals(boots.color)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Boots{" +"Name="+ name +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


