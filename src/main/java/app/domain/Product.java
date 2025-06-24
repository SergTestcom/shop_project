package app.domain;

import java.util.Objects;

public class Product {
    private final Long id;
    private boolean isActive;
    private String name;
    private double price;

    public Long getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return isActive == product.isActive && Double.compare(price, product.price) == 0 && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(Long id, boolean isActive, String name, double price) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.price = price;



    }
}
