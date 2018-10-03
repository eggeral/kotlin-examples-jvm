package ese.kotlin.basics.aa_why_kotlin;

import java.util.Objects;

public class JavaCustomer {

    private String name;
    private String address;
    private int orders;

    // 1 create constructor
    public JavaCustomer(String name, String address, int orders) {
        this.name = name;
        this.address = address;
        this.orders = orders;
    }

    // 2 create getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    // 3 create equals and hashCoder()


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaCustomer that = (JavaCustomer) o;
        return orders == that.orders &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, orders);
    }

    // 4 implement toString

    @Override
    public String toString() {
        return "JavaCustomer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }
}
