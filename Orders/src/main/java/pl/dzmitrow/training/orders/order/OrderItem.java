package pl.dzmitrow.training.orders.order;

public class OrderItem {

    private Long id;
    private Coffee coffee;

    public OrderItem(Coffee coffee) {
        this.coffee = coffee;
    }

    public OrderItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (id != null ? !id.equals(orderItem.id) : orderItem.id != null) return false;
        return coffee != null ? coffee.equals(orderItem.coffee) : orderItem.coffee == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (coffee != null ? coffee.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", coffee=" + coffee +
                '}';
    }
}
