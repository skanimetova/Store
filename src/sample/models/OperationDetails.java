package sample.models;

public class OperationDetails {

    private int id;
    private Operations operation;
    private Products product;
    private int amount;
    private int price;


    public OperationDetails(Operations operation, Products product, int amount, int price) {
        this.id = id;
        this.operation = operation;
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
