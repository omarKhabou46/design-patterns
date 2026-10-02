package com.springRevision.TriProblem;

import java.time.LocalDate;

public class Produit {
    private int id;
    private double price;
    private String name;
    private LocalDate localDate;

    public Produit(int id, double price, String name, LocalDate localDate) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
