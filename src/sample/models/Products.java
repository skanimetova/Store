package sample.models;

public class Products {
    private int id;
    private String name;
    private Categories category;
    private String barcode;

    public Products(String name, Categories category, String barcode) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.barcode = barcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
