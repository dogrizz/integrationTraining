package pl.dzmitrow.training.lab04.order;

public class Coffee {

    private CoffeeType coffeeType;
    private boolean iced;

    public Coffee(CoffeeType coffeeType, boolean iced) {
        this.coffeeType = coffeeType;
        this.iced = iced;
    }

    public Coffee() {
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public boolean isIced() {
        return iced;
    }

    public void setIced(boolean iced) {
        this.iced = iced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;

        if (iced != coffee.iced) return false;
        return coffeeType == coffee.coffeeType;

    }

    @Override
    public int hashCode() {
        int result = coffeeType.hashCode();
        result = 31 * result + (iced ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType=" + coffeeType +
                ", iced=" + iced +
                '}';
    }
}
