package sample.models;

import java.util.Calendar;

public class Prices {
    private int id;
    private double price;
    private Products product;
    private Calendar start_date;
    private Calendar end_date;

    public Prices(int id, double price, Products product, Calendar start_date, Calendar end_date) {
        this.id = id;
        this.price = price;
        this.product = product;
        this.start_date = start_date;
        this.end_date = end_date;
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

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Calendar getStart_date() {
        return start_date;
    }

    public void setStart_date(Calendar start_date) {
        this.start_date = start_date;
    }

    public Calendar getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Calendar end_date) {
        this.end_date = end_date;
    }
}
