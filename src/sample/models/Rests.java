package sample.models;

public class Rests {
    private Products product;
    private int amount;
    private int max_amount;
    private int min_amount;

    public Rests(Products product, int amount, int max_amount, int min_amount) {
        this.product = product;
        this.amount = amount;
        this.max_amount = max_amount;
        this.min_amount = min_amount;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMax_amount() {
        return max_amount;
    }

    public void setMax_amount(int max_amount) {
        this.max_amount = max_amount;
    }

    public int getMin_amount() {
        return min_amount;
    }

    public void setMin_amount(int min_amount) {
        this.min_amount = min_amount;
    }
}
