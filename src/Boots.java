/**
 * Created by cyc10ne on 08.08.2015.
 */
public class Boots extends AbstractProduct{
    int size;
    String color;

    public Boots() {
    }

    public Boots(int size, String color) {

        this.size = size;
        this.bootsInitialPrice();
        this.color = color;
    }

    void bootsInitialPrice(){

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
        return "Boots{" +
                "Size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


