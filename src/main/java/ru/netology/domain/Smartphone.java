package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String maker;
    private Smartphone smartphone;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone smartphone = (Smartphone) o;
        return Objects.equals(maker, smartphone.maker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maker);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "maker='" + maker +
                '}';
    }

    @Override
    public boolean matches(Product product, String search) {
        if (super.matches(product, search)) {
            return  true;
        }
        if (getMaker().equalsIgnoreCase(search)) {
            return true;
        }
        return false;
    }
}
