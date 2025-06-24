package app.domain;

import java.util.ArrayList;
import java.util.List;
public class Customer {
    private final Long id;
    private boolean isActive;
    private String name;
    private final List<Product> products; = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer(List<Product> products, String name, boolean isActive, Long id) {
        this.products = products;
        this.name = name;
        this.isActive = isActive;
        this.id = id;

    }
}
